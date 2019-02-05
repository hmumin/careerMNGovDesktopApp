/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careersMNGov.ui;

import Scraper.JobScraper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

/**
 *
 * @author hassanmumin
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    
    
    private static HomeFrame homeFrame;
    
    public HomeFrame() {
        initComponents();
        searchingWthLoadingIconJLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new keeptoo.KGradientPanel();
        searchTextField = new javax.swing.JTextField();
        enterKeywordLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        statementLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobJlist = new javax.swing.JList<>();
        searchingWthLoadingIconJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkBorderRadius(0);
        kGradientPanel4.setkEndColor(new java.awt.Color(51, 204, 255));
        kGradientPanel4.setkGradientFocus(300);
        kGradientPanel4.setkStartColor(new java.awt.Color(102, 102, 255));

        searchTextField.setBackground(new java.awt.Color(0, 0, 0, 0));
        searchTextField.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(255, 255, 255));
        searchTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        enterKeywordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        enterKeywordLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterKeywordLabel.setText("Enter search keyword:");

        searchButton.setBackground(new java.awt.Color(71, 163, 255));
        searchButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Minnesota2.png"))); // NOI18N

        statementLabel.setFont(new java.awt.Font("Charter", 0, 24)); // NOI18N
        statementLabel.setForeground(new java.awt.Color(255, 255, 255));
        statementLabel.setText("<html>\nSearch for Careers \n<br>\nWithin the State of Minnesota \n</html>\n");

        jobJlist.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jobJlist);

        searchingWthLoadingIconJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchingWthLoadingIconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.gif"))); // NOI18N
        searchingWthLoadingIconJLabel.setText("Searching.....");
        searchingWthLoadingIconJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel4Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enterKeywordLabel)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(logoLabel)
                                .addComponent(statementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(searchingWthLoadingIconJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(logoLabel)
                .addGap(20, 20, 20)
                .addComponent(statementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(enterKeywordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(searchingWthLoadingIconJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startThread() {
        SwingWorker swingWorker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                // turn off htmlunit warnings
                java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
                java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
                // ----------------------
                
                JobScraper jobs = null;
                try {
                    jobs = new JobScraper();
                    jobs.submitJobSearchForm("\"" + searchTextField.getText() + "\"");
                    jobs.waitUntilEverythingLoadsUp(2000);
                    //get page
                    System.out.println(jobs.getJobsOnPageVsLeftToShow());
                    
                    jobs.getAllJobTitles();
                    jobs.waitUntilEverythingLoadsUp(2000);
                } catch (IOException ex) {
                    Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NullPointerException e) {
                }
                
                DefaultListModel<String> model = new DefaultListModel<>();
                for (String job : jobs.getListOfAllJobs()) {
                    model.addElement(job);
                }
                
                jobJlist.setModel(model);
                return "Done background";
                
            }
            
            protected void done() {
                searchingWthLoadingIconJLabel.setVisible(false);
                searchButton.setEnabled(true);
            }
        };
        
        swingWorker.execute();
    }
   
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchTextField.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(homeFrame, "Search field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            
           
            startThread();
            searchingWthLoadingIconJLabel.setVisible(true);
            searchButton.setEnabled(false);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 homeFrame = new HomeFrame();

                //homeFrame.dispose();
                //homeFrame.setUndecorated(true);
                //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                homeFrame.setVisible(true);
                homeFrame.setLocationRelativeTo(null);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterKeywordLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jobJlist;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel searchingWthLoadingIconJLabel;
    private javax.swing.JLabel statementLabel;
    // End of variables declaration//GEN-END:variables
}
