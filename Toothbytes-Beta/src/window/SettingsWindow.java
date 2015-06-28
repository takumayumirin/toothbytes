/*
 * Copyright (c) 2014, 2015, Project Toothbytes. All rights reserved.
 *
 *
*/
package window;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.Accounts;
import models.Services;
import utilities.DBAccess;

public class SettingsWindow extends javax.swing.JDialog {
    int currentAccountID = 0;
    private ArrayList<Accounts> accountX;
    private ArrayList<Services> servicesX;
    private Services service;
    private Accounts currentAccount;
    
    private final String BUTTON_DIR = "res/buttons/";
    
    public SettingsWindow() throws Exception {
        this.setTitle("Settings");
        this.setIconImage(new ImageIcon("src/Toothbytes/favicon.png").getImage());
        
        initComponents();
        accountX = new ArrayList<>();
        accountX = DBAccess.getAccountsData("");
        servicesX = new ArrayList<>();
        getComboBox();
        service = new Services();  
        currentAccount = new Accounts();
        getAccountDetails();
        
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - this.getWidth()) / 2;
        final int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
    }
    
    public void getAccountDetails() throws Exception{
        try{
            currentAccount.setAccountID(accountX.get(currentAccountID).getAccountID());
            currentAccount.setUsername(accountX.get(currentAccountID).getUsername());
            currentAccount.setPassword(accountX.get(currentAccountID).getPassword());
            
            accountUsername.setText(currentAccount.getUsername());
            accountPassword.setText(currentAccount.getPassword());
        } catch (Exception e){
            System.out.println("AccountDetails Error: "+e);
        }
    }
    
    private void getComboBox(){
        serviceOffered.removeAllItems();
        serviceOffered.addItem("- List of Services Offered -");        
        try{
            servicesX = DBAccess.getServicesData();
            
            for(int i = 0; i < servicesX.size(); i++){
                serviceOffered.addItem(servicesX.get(i).getServiceType());
            }
        }catch(Exception e){
            System.out.println("getComboBox Error: "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        enableDisable = new javax.swing.ButtonGroup();
        servicesPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        statusService = new javax.swing.JComboBox();
        serviceOffered = new javax.swing.JComboBox();
        feeService = new javax.swing.JTextField();
        saveButtonExisting = new javax.swing.JButton();
        resetButtonExisting = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        accountUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accountConfirmPassword = new javax.swing.JPasswordField();
        accountPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        accountNewPassword = new javax.swing.JPasswordField();
        btnSaveSettings = new javax.swing.JButton();
        btnCancelSettings = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        backUp = new javax.swing.JButton();
        restoreDB = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setTitle("Settings");
        setBackground(new java.awt.Color(250, 255, 250));
        setMaximumSize(new java.awt.Dimension(300, 530));
        setMinimumSize(new java.awt.Dimension(300, 530));

        servicesPanel.setBackground(new java.awt.Color(250, 255, 250));
        servicesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("SERVICES"));
        servicesPanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Edit Services Offered");

        jLabel12.setText("Status:");

        jLabel13.setText("Service:");

        jLabel14.setText("Fee:");

        statusService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status...", "Available", "Unavailable" }));
        statusService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusServiceActionPerformed(evt);
            }
        });

        serviceOffered.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                serviceOfferedPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        serviceOffered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceOfferedActionPerformed(evt);
            }
        });

        feeService.setText(" ");
        feeService.setHorizontalAlignment(feeService.RIGHT);
        feeService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeServiceActionPerformed(evt);
            }
        });

        saveButtonExisting.setIcon(new javax.swing.ImageIcon(BUTTON_DIR+"Save.png"));
        saveButtonExisting.setText("Save");
        saveButtonExisting.setToolTipText("");
        saveButtonExisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonExistingActionPerformed(evt);
            }
        });

        resetButtonExisting.setIcon(new javax.swing.ImageIcon(BUTTON_DIR+"Reset.png"));
        resetButtonExisting.setText("Reset");
        resetButtonExisting.setToolTipText("");
        resetButtonExisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonExistingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servicesPanelLayout = new javax.swing.GroupLayout(servicesPanel);
        servicesPanel.setLayout(servicesPanelLayout);
        servicesPanelLayout.setHorizontalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(servicesPanelLayout.createSequentialGroup()
                        .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusService, 0, 150, Short.MAX_VALUE)
                            .addComponent(feeService)
                            .addComponent(serviceOffered, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(servicesPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(resetButtonExisting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButtonExisting)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        servicesPanelLayout.setVerticalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(serviceOffered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(feeService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(21, 21, 21)
                .addGroup(servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButtonExisting)
                    .addComponent(saveButtonExisting))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(250, 255, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ACCOUNT"));

        jLabel8.setText("Username :");

        accountUsername.setText(" ");

        jLabel9.setText("Password :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Change account settings");

        jLabel11.setText("Confirm Password :");

        jLabel15.setText("New Password :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(accountNewPassword)
                                    .addComponent(accountPassword)
                                    .addComponent(accountUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addComponent(accountConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(accountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(accountNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(accountConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );

        btnSaveSettings.setIcon(new javax.swing.ImageIcon(BUTTON_DIR+"Confirm.png"));
        btnSaveSettings.setText("Save");
        btnSaveSettings.setToolTipText("Save");
        btnSaveSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSettingsActionPerformed(evt);
            }
        });

        btnCancelSettings.setIcon(new javax.swing.ImageIcon(BUTTON_DIR+"Cancel.png"));
        btnCancelSettings.setText("Cancel");
        btnCancelSettings.setToolTipText("Cancel");
        btnCancelSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSettingsActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MAINTENANCE"));

        backUp.setText("Back Up Database");
        backUp.setEnabled(false);
        backUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpActionPerformed(evt);
            }
        });

        restoreDB.setText("Restore Database");
        restoreDB.setEnabled(false);
        restoreDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(restoreDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restoreDB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(servicesPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelSettings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveSettings)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelSettings)
                    .addComponent(btnSaveSettings))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void clearfieldsOne(){
        serviceOffered.setSelectedItem(null);
        feeService.setText("");
        statusService.setSelectedItem(null);
    }

     
    private void btnSaveSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSettingsActionPerformed
        try {
            if(!(Arrays.toString(accountNewPassword.getPassword()).equals(Arrays.toString(accountConfirmPassword.getPassword())))){
                JOptionPane.showMessageDialog( this, "Password entered not the same","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else if (Arrays.equals(accountPassword.getPassword(), accountNewPassword.getPassword())){
                JOptionPane.showMessageDialog( this, "Previous and new password should not be the same","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else if (Arrays.equals(accountConfirmPassword.getPassword(), accountNewPassword.getPassword())){                  
                currentAccount.setUsername(accountUsername.getText());
                currentAccount.setPassword(String.valueOf(accountNewPassword.getPassword()));
                DBAccess.updateAccountsData(currentAccount);
                JOptionPane.showMessageDialog(this, "Accounts changes saved");
                Window w = SwingUtilities.getWindowAncestor(this);
                w.dispose(); 
                return;
            }                 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_btnSaveSettingsActionPerformed
    
    private void btnCancelSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSettingsActionPerformed
        Window w = SwingUtilities.getWindowAncestor(this);
        w.dispose();
    }//GEN-LAST:event_btnCancelSettingsActionPerformed

    private void resetButtonExistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonExistingActionPerformed
        // TODO add your handling code here:
        try {            
            for(int i = 0; i < servicesX.size(); i++){
                if(serviceOffered.getSelectedItem().equals(servicesX.get(i).getServiceType())){
                    feeService.setText(String.valueOf(servicesX.get(i).getServiceFee()));
                    if(servicesX.get(i).getServiceAvailable()){
                        statusService.setSelectedIndex(1);
                    } else {
                        statusService.setSelectedIndex(0);
                    }
                    break;
                }
            }
            
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_resetButtonExistingActionPerformed

    private void feeServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeServiceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_feeServiceActionPerformed

    private void serviceOfferedPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_serviceOfferedPopupMenuWillBecomeInvisible
        // TODO add your handling code here: 
        try {            
            for(int i = 0; i < servicesX.size(); i++){
                if(serviceOffered.getSelectedItem().equals(servicesX.get(i).getServiceType())){
                    feeService.setText(String.valueOf(servicesX.get(i).getServiceFee()));
                    if(servicesX.get(i).getServiceAvailable()){
                        statusService.setSelectedIndex(1);
                    } else {
                        statusService.setSelectedIndex(2);
                    }
                    break;
                }
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_serviceOfferedPopupMenuWillBecomeInvisible

    private void saveButtonExistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonExistingActionPerformed
           // TODO add your handling code here:
        try{
            if(serviceOffered.getSelectedItem().toString().equals("- List of Services Offered -")){
                JOptionPane.showMessageDialog(this, "You have not selected a service.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if(serviceOffered.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(this, "You have not selected a service.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if(feeService.getText().matches("[a-zA-Z]+")){
                JOptionPane.showMessageDialog(this, "Service fee input incorrect","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            service.setServiceType(serviceOffered.getSelectedItem().toString());
            service.setServiceFee(Double.parseDouble(feeService.getText()));
            
            try{
                if(statusService.getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(this, "Select an appropriate status", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if(statusService.getSelectedIndex() == 1){
                        service.setServiceAvailable(true);
                    } else {
                        service.setServiceAvailable(false);
                    }
                }
            }catch(Exception e){
                System.out.println("Select status error: "+e);
            }
            
            DBAccess.updateServicesData(service);
            
            saveButtonExisting.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Update Successful!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveButtonExistingActionPerformed

    private void statusServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusServiceActionPerformed

    private void serviceOfferedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceOfferedActionPerformed
        // TODO add your handling code here:
        String currentService = "";
        if(!currentService.equals(serviceOffered.getSelectedItem().toString())){
            currentService = serviceOffered.getSelectedItem().toString();
            for(int i = 0; i < servicesX.size(); i++){
                if(currentService.equals(servicesX.get(i).getServiceType())){
                    System.out.println(servicesX.get(i).getServiceID());
                    service.setServiceID(servicesX.get(i).getServiceID());
                    break;
                }
            }
        }
    }//GEN-LAST:event_serviceOfferedActionPerformed

    private void backUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpActionPerformed
        try{
            Runtime.getRuntime().exec("cmd /c start C:/Toothbytes/backupToothbytes.bat");
        }catch(Exception batchFileException){
            System.out.println("cmd exception:  " + batchFileException);
        }
    }//GEN-LAST:event_backUpActionPerformed

    private void restoreDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDBActionPerformed
        try{
            Runtime.getRuntime().exec("cmd /c start C:/Toothbytes/restoreToothbytes.bat");
        }catch(Exception batchFileException){
            System.out.println("cmd exception:  " + batchFileException);
        }
    }//GEN-LAST:event_restoreDBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SettingsWindow().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SettingsWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField accountConfirmPassword;
    private javax.swing.JPasswordField accountNewPassword;
    private javax.swing.JPasswordField accountPassword;
    private javax.swing.JTextField accountUsername;
    private javax.swing.JButton backUp;
    private javax.swing.JButton btnCancelSettings;
    private javax.swing.JButton btnSaveSettings;
    private javax.swing.ButtonGroup enableDisable;
    private javax.swing.JTextField feeService;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton resetButtonExisting;
    private javax.swing.JButton restoreDB;
    private javax.swing.JButton saveButtonExisting;
    private javax.swing.JComboBox serviceOffered;
    private javax.swing.JPanel servicesPanel;
    private javax.swing.JComboBox statusService;
    // End of variables declaration//GEN-END:variables
}
