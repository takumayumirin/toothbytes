/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package window.forms;

import java.awt.Image;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import utilities.PersonalInfo;

/**
 *
 * @author USER
 */
public class UpdatePersonalInformation extends javax.swing.JPanel {
    
    private PersonalInfo pi;
    private String patientID;
    private boolean newPatient = true;
    private String BUTTON_DIR = "res/buttons/";
    private String PATIENTS_DIR = "res/patients/";
    
    /**
     * Creates new form UpdatePersonalInformation
     */
    public UpdatePersonalInformation() {
        initComponents();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setVisible(true);
    }
    
    public UpdatePersonalInformation(PersonalInfo pi){
        initComponents();
        this.pi = pi;
        patientID = pi.getPatientID();
        insertData();
        newPatient = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        telNoTF = new javax.swing.JTextField();
        officeNoTF = new javax.swing.JTextField();
        emailAddTF = new javax.swing.JTextField();
        cellPhoneNoTF = new javax.swing.JTextField();
        faxNoTF = new javax.swing.JTextField();
        surnameTF = new javax.swing.JTextField();
        givenNameTF = new javax.swing.JTextField();
        miTF = new javax.swing.JTextField();
        bdayMonthCB = new javax.swing.JComboBox();
        bdayDayCB = new javax.swing.JComboBox();
        occupationTF = new javax.swing.JTextField();
        civilStatusCB = new javax.swing.JComboBox();
        homeAddressTF = new javax.swing.JTextField();
        patientImage = new javax.swing.JLabel();
        addImageButton = new javax.swing.JButton();
        genderCB = new javax.swing.JComboBox();
        bdayYearTF = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nicknameTF = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jLabel15.setText("jLabel15");

        jTextField6.setText("jTextField6");

        setBackground(new java.awt.Color(250, 255, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Personal Information");

        jLabel2.setText("Surname:");

        jLabel3.setText("Given Name:");

        jLabel4.setText("Middle Initial:");

        jLabel5.setText("Gender:");

        jLabel6.setText("Birthdate:");

        jLabel7.setText("Civil Status:");

        jLabel8.setText("Occupation:");

        jLabel9.setText("Home Address:");

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel10.setText("Telephone Number:");

        jLabel11.setText("Office Number:");

        jLabel12.setText("Email Address:");

        jLabel13.setText("Cellphone Number:");

        jLabel14.setText("Fax Number:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(telNoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(cellPhoneNoTF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(faxNoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(officeNoTF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(emailAddTF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellPhoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faxNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bdayMonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        bdayDayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        civilStatusCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status", "Single", "Married", "Widowed", "Annulled" }));

        patientImage.setOpaque(true);

        addImageButton.setText("Add Image");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });

        genderCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));

        bdayYearTF.setText("Year");
        bdayYearTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdayYearTFMouseClicked(evt);
            }
        });

        saveButton.setIcon(new javax.swing.ImageIcon(BUTTON_DIR + "Save.png"));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(BUTTON_DIR + "Cancel.png"));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");

        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*");

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");

        jLabel24.setText("Nickname:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeAddressTF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(occupationTF)
                                    .addComponent(civilStatusCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bdayMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bdayDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bdayYearTF, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addComponent(surnameTF)
                                    .addComponent(givenNameTF)
                                    .addComponent(miTF)
                                    .addComponent(nicknameTF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(addImageButton)
                                        .addGap(65, 65, 65))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(patientImage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(givenNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(miTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(nicknameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientImage, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addImageButton)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bdayMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdayDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdayYearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(civilStatusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(occupationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(homeAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        grayTFBorders();
        
        if(entriesValid()){
           //move to next page of registration 
            String surname = surnameTF.getText();               //no numbers, special characters
            String givenName = givenNameTF.getText();           //no numbers, special characters
            String mi =  miTF.getText();                        //no numbers
            String gender = genderCB.getSelectedItem().toString();
            
            //birthdate
            Calendar birthdate = Calendar.getInstance();
            int month = bdayMonthCB.getSelectedIndex();
            int day = bdayDayCB.getSelectedIndex();
            int year = Integer.parseInt(bdayYearTF.getText());
            birthdate.set(year, month, day);
            
            String nickname = nicknameTF.getText();       //no numbers, special characters
            String civilStatus = civilStatusCB.getSelectedItem().toString();             //no numbers
            String occupation = occupationTF.getText();         //no numbers
            String homeAddress = homeAddressTF.getText();
            String telephoneNo = telNoTF.getText();
            String officeNo = officeNoTF.getText();
            String emailAdd = emailAddTF.getText();
            String cellphoneNo = cellPhoneNoTF.getText();
            String faxNo = faxNoTF.getText();
            
                        
            pi = new PersonalInfo(surname, givenName, mi, gender, birthdate, civilStatus, nickname, occupation, homeAddress,
            telephoneNo, officeNo, emailAdd, cellphoneNo, faxNo, null);
            
            updatePersonalInfo();
            
        }else{
            if(miTF.getText().isEmpty() || hasNumbers(miTF.getText()) || miTF.getText().length() < -1 || miTF.getText().length() > 2){miTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(bdayYearTF.getText().isEmpty() || hasLetters(bdayYearTF.getText()) || hasSpecialCharacters(bdayYearTF.getText())){bdayYearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(civilStatusCB.getSelectedItem().toString().isEmpty()){civilStatusCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(occupationTF.getText().isEmpty() || hasNumbers(occupationTF.getText())){occupationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(surnameTF.getText().isEmpty()){surnameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(givenNameTF.getText().isEmpty()){givenNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(homeAddressTF.getText().isEmpty()){homeAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(genderCB.getSelectedIndex() == 0){genderCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0 ,51)));}
            if(hasLetters(telNoTF.getText())){telNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(cellPhoneNoTF.getText())){cellPhoneNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(officeNoTF.getText())){officeNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(faxNoTF.getText())){faxNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            JOptionPane.showMessageDialog(null,"One or more fields are invalid. Please recheck inputs.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        Window w = SwingUtilities.getWindowAncestor(this);
        w.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMG", "jpg","png");
        fc.setFileFilter(filter);
        int result = fc.showOpenDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fc.getSelectedFile();
            String fileName = selectedFile.getName();
            String path = selectedFile.getAbsolutePath();
            System.out.println("You chose to open this file: " + selectedFile.getName());            
            patientImage.setIcon(ResizeImage(path));
            fileName = pi.getPatientID() + ".jpg";
            BufferedImage image;
            
            try{
                image = ImageIO.read(selectedFile);
                ImageIO.write(image, "jpg", new File(PATIENTS_DIR + fileName));
            }catch(IOException error){
                 Logger.getLogger(PersonalInformation.class.getName()).log(Level.SEVERE, null, error);                                 
            } 
        }else if (result == JFileChooser.CANCEL_OPTION){ 
            
        }
    }//GEN-LAST:event_addImageButtonActionPerformed

    private void bdayYearTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdayYearTFMouseClicked
        bdayYearTF.setText("");
    }//GEN-LAST:event_bdayYearTFMouseClicked
    
    private void updatePersonalInfo(){
        pi.UpdatePersonalInfo(patientID);
        
        Window w = SwingUtilities.getWindowAncestor(this);
        w.dispose();
    }
    
    public boolean entriesValid(){
        String surname = surnameTF.getText();               //no filter *
        String givenName = givenNameTF.getText();           //no filter *
        String mi =  miTF.getText();
        String birthYear = bdayYearTF.getText();                //no letters 
        int bdayYear = Integer.parseInt(birthYear);
        String religion = civilStatusCB.getSelectedItem().toString();
        String occupation = occupationTF.getText();         //no numbers 
        String homeAddress = homeAddressTF.getText();       //no filter *
        
        if(!entriesNull(surname, givenName, mi, birthYear, occupation, homeAddress) &&
           !hasNumbers(mi) && mi.length() > -1 && mi.length() <= 2 &&
           !hasLetters(birthYear) &&
           genderCB.getSelectedIndex() != 0 && 
           civilStatusCB.getSelectedIndex() != 0 &&
           !hasNumbers(religion) &&
           !hasNumbers(occupation) ||
           (bdayYear >= 1960) || (bdayYear != 0)){
            return true;
        }else{
            // One of the entries has invalid inputs
            return false;
        }
        
    }
    
    public boolean entriesNull(String surname, String givenName, String mi, String birthYear, String occupation, String homeAddress){
        if(surname.isEmpty() || givenName.isEmpty() || mi.isEmpty() || birthYear.isEmpty() || occupation.isEmpty() || homeAddress.isEmpty()){
            // One or more strings are null
            return true;
        }else{
            return false;
        }
    }
    
    public boolean hasNumbers(String numberlessString){
        String pattern = "[0-9]";
        if(Pattern.compile(pattern).matcher(numberlessString).find()){
            // There is a number in the string
            return true;
        }else{
            // The string has no numbers
            return false;
        }
    }
    
    public boolean hasSpecialCharacters(String specialCharacterlessString){
        String pattern = "[^A-Za-z0-9]+";
        if(Pattern.compile(pattern).matcher(specialCharacterlessString).find()){
            // There is a special character in the string
            return true;
        }else{
            return false;
        }
    }
    
    public boolean hasLetters(String letterlessString){
        String pattern = "[A-Za-z]";
        if(Pattern.compile(pattern).matcher(letterlessString).find()){
            // There is a letter on the string
            return true;
        }else{
            return false;
        }   
    }
    
    public void grayTFBorders(){
     miTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        bdayYearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        nicknameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        civilStatusCB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        occupationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        surnameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        givenNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        homeAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        telNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        cellPhoneNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        officeNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        faxNoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
    }
    
    public void insertData(){
        surnameTF.setText(pi.getGivenName());
        givenNameTF.setText(pi.getSurname());
        miTF.setText(pi.getMI());
        
        if(pi.getGender().compareTo("M") == 1){
            genderCB.setSelectedIndex(1);
        } else {
            genderCB.setSelectedIndex(2);
        }
        
        nicknameTF.setText(pi.getCivilStatus());
        civilStatusCB.setSelectedItem(pi.getNickname());
        
        //Birthdate
        Calendar birthdate = pi.getBirthDate();
        int month = birthdate.get(Calendar.MONTH)+1;
        int day = birthdate.get(Calendar.DAY_OF_MONTH);
        int year = birthdate.get(Calendar.YEAR);
        
        bdayMonthCB.setSelectedIndex(month);
        bdayDayCB.setSelectedIndex(day);
        bdayYearTF.setText(String.valueOf(year));
        
        occupationTF.setText(pi.getOccupation());
        homeAddressTF.setText(pi.getHomeAddress());
        telNoTF.setText(pi.getTelephoneNo());
        cellPhoneNoTF.setText(pi.getCellphoneNo());
        officeNoTF.setText(pi.getOfficeNo());
        emailAddTF.setText(pi.getEmailAdd());
        faxNoTF.setText(pi.getFaxNo());
        
        File f = new File("res/patients/" + pi.getPatientID() + ".jpg");
        String path = PATIENTS_DIR + pi.getPatientID() + ".jpg";
        ImageIcon croppedImg = ResizeImage(path);
        
        if (f.exists()) {
            patientImage.setIcon(croppedImg);
        }
    }
    
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(145, 145, Image.SCALE_SMOOTH);        
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImageButton;
    private javax.swing.JComboBox bdayDayCB;
    private javax.swing.JComboBox bdayMonthCB;
    private javax.swing.JTextField bdayYearTF;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cellPhoneNoTF;
    private javax.swing.JComboBox civilStatusCB;
    private javax.swing.JTextField emailAddTF;
    private javax.swing.JTextField faxNoTF;
    private javax.swing.JComboBox genderCB;
    private javax.swing.JTextField givenNameTF;
    private javax.swing.JTextField homeAddressTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField miTF;
    private javax.swing.JTextField nicknameTF;
    private javax.swing.JTextField occupationTF;
    private javax.swing.JTextField officeNoTF;
    private javax.swing.JLabel patientImage;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JTextField telNoTF;
    // End of variables declaration//GEN-END:variables
}
