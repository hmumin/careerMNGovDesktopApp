/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraper;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hassanmumin
 */
public class JobScraper {

    private List<String> listOfAllJobs;
    private final WebClient client;
    private final HtmlPage innerPage;
    private final String urlMNGovCareerSite = "https://careers.mn.gov/psp/hcm92apc/MNCAREERS/HRCR/c/HRS_HRAM.HRS_APP_SCHJOB.GBL?Page=HRS_APP_SCHJOB&Action=U&FOCUS=Applicant&SiteId=1001";

    public JobScraper() throws IOException {

        client = new WebClient();
        HtmlPage startPage = this.client.getPage(urlMNGovCareerSite);
        HtmlInlineFrame iframe = (HtmlInlineFrame) startPage.getElementsByTagName("iframe").get(0);
        innerPage = (HtmlPage) iframe.getEnclosedPage();
    }

    public String getPageTitle() {
        return this.innerPage.getTitleText();
    }

    public void submitJobSearchForm(String jobTitle) throws IOException {

        String textFieldName = "HRS_SCH_WRK_HRS_SCH_TEXT100";
        String submitButtonName = "SEARCHACTIONS#SEARCH";

        HtmlTextInput textField = (HtmlTextInput) this.innerPage.getElementByName(textFieldName);
        HtmlButtonInput submitButton = (HtmlButtonInput) this.innerPage.getElementByName(submitButtonName);

        textField.type(jobTitle);

        submitButton.click();

    }

    public void waitUntilEverythingLoadsUp(int milliseconds) {
        client.waitForBackgroundJavaScript(milliseconds);
    }

    public String getNumberOfJobsReturnedFromSearch() {
        DomNode node = innerPage.getElementById("HRS_SCH_WRK_HRS_SES_CNTS_MSG");
        String numJobsFound = node.getTextContent();

        return numJobsFound;
    }

    public String getJobsOnPageVsLeftToShow() {
        DomNode node = innerPage.getFirstByXPath("//span[contains(@class, 'PSGRIDCOUNTER')]");
        
        return "Page: " + node.getTextContent();
    }

    public void getAllJobTitles() throws IOException {

        int count = 1;
        HtmlAnchor nextPageButton = (HtmlAnchor) this.innerPage.getFirstByXPath("//*[@id=\"HRS_AGNT_RSLT_I$hdown$0\"]");
        boolean isButtonClickNull = true;
        listOfAllJobs = new ArrayList<>();
        String jobsOnPage = getJobsOnPageVsLeftToShow();
        String jobsOnNextPage = "";
        while (!(jobsOnPage.equalsIgnoreCase(jobsOnNextPage))) {

            jobsOnPage = getJobsOnPageVsLeftToShow();
            List<DomNode> nodes = innerPage.getByXPath("//div[contains(@class, 'jobopeningid')]");
            for (DomNode node : nodes) {
                //System.out.println(count + ": " + node.getTextContent());
                listOfAllJobs.add(count + ": " + node.getTextContent());
                count++;
            }

            nextPageButton.click();
            waitUntilEverythingLoadsUp(2000);
            jobsOnNextPage = getJobsOnPageVsLeftToShow();

        }
    }

    public List<String> getListOfAllJobs() {
        return listOfAllJobs;
    }

}



//TODO: Fix spinner wheel when app is searhcing for jobs
//TODO: Fix dialog box when no text entered in search field
//TODO: refactor
//TODO: add test cases
