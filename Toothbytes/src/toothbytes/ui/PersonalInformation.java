package toothbytes.ui;

import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import toothbytes.database.AdditionalInfo;
import toothbytes.database.MedicalCond;
import toothbytes.database.PersonalInfo;

public class PersonalInformation extends javax.swing.JPanel {
    public JFrame ctb;
    public PersonalInfo pi;
    public AdditionalInfo ai;
    public MedicalCond mc;
    
    public PersonalInformation(JFrame ctb) {
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
        this.ctb = ctb;
        this.setVisible(true);
    }
    
    public PersonalInformation(JFrame ctb, PersonalInfo pi, AdditionalInfo ai, MedicalCond mc){
        initComponents();
        this.ctb = ctb;
        this.pi = pi;
        this.ai = ai;
        this.mc = mc;
        
        insertData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        surnameTF = new javax.swing.JTextField();
        givenNameTF = new javax.swing.JTextField();
        miTF = new javax.swing.JTextField();
        genderCB = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        monthCB = new javax.swing.JComboBox();
        dayCB = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        yearTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nationalityTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        religionTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        homeAddressTF = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        telephoneNumberTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cellphoneNumberTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        officeNumberTF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        faxNumberTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        emailAddressTF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        occupationTF = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 255, 250));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal Information");

        jLabel2.setText("Surname:");

        jLabel3.setText("Given Name:");

        jLabel4.setText("MI:");

        jLabel5.setText("Gender:");

        genderCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel6.setText("Birthdate");

        jLabel7.setText("Month:");

        jLabel8.setText("Day:");

        jLabel9.setText("Year:");

        monthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        dayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel10.setText("Age:");

        jLabel11.setText("Nationality:");

        jLabel12.setText("Religion:");

        jLabel13.setText("Home Address:");

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact Information"));

        jLabel14.setText("Telephone Number:");

        jLabel15.setText("Cellphone Number:");

        jLabel16.setText("Office Number:");

        jLabel17.setText("Fax Number:");

        jLabel18.setText("Email Address:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephoneNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(cellphoneNumberTF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeNumberTF)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faxNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addComponent(emailAddressTF))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(officeNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellphoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faxNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel19.setText("Occupation:");

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toothbytes/res/icons/btn/Next.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setToolTipText("");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toothbytes/res/icons/btn/Cancel.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(88, 88, 88)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nationalityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(religionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(occupationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(homeAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(givenNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(miTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givenNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(religionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(occupationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(cancelButton))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        grayTFBorders();
        
        if(entriesValid()){
           //move to next page of registration 
            String surname = surnameTF.getText();               //no numbers, special characters
            String givenName = givenNameTF.getText();           //no numbers, special characters
            String mi =  miTF.getText();                        //no numbers
            String gender = genderCB.getSelectedItem().toString();
            String birthYear = yearTF.getText();                //no letters
            String nationality = nationalityTF.getText();       //no numbers, special characters
            String religion = religionTF.getText();             //no numbers
            String occupation = occupationTF.getText();         //no numbers
            String homeAddress = homeAddressTF.getText();
            String telephoneNo = telephoneNumberTF.getText();
            String officeNo = officeNumberTF.getText();
            String emailAdd = emailAddressTF.getText();
            String cellphoneNo = cellphoneNumberTF.getText();
            String faxNo = faxNumberTF.getText();
            
            if(birthYear.isEmpty())
                birthYear = "0";
            
            pi = new PersonalInfo(surname, givenName, mi, gender, Integer.parseInt(birthYear), nationality, religion, occupation, homeAddress, 
                                telephoneNo, officeNo, emailAdd, cellphoneNo, faxNo);
            
            launchAdditionalInfo();
        }else{
            if(miTF.getText().isEmpty() || hasNumbers(miTF.getText()) || miTF.getText().length() < -1 || miTF.getText().length() > 2){miTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(yearTF.getText().isEmpty() || hasLetters(yearTF.getText()) || hasSpecialCharacters(yearTF.getText())){yearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(ageTF.getText().isEmpty() || hasLetters(ageTF.getText()) || hasSpecialCharacters(ageTF.getText())){ageTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(nationalityTF.getText().isEmpty() || hasNumbers(nationalityTF.getText()) || hasSpecialCharacters(nationalityTF.getText())){nationalityTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(religionTF.getText().isEmpty() || hasNumbers(religionTF.getText())){religionTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(occupationTF.getText().isEmpty() || hasNumbers(occupationTF.getText())){occupationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(surnameTF.getText().isEmpty()){surnameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(givenNameTF.getText().isEmpty()){givenNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(homeAddressTF.getText().isEmpty()){homeAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(telephoneNumberTF.getText())){telephoneNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(cellphoneNumberTF.getText())){cellphoneNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(officeNumberTF.getText())){officeNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            if(hasLetters(faxNumberTF.getText())){faxNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));}
            JOptionPane.showMessageDialog(null,"One or more fields are invalid. Please recheck inputs.");
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        ctb.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void launchAdditionalInfo(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame tb = new JFrame();
                AdditionalInformation adi = null;
                System.out.println("here");
                try{
                    if(ai.getReason().isEmpty()){
                        
                    } else {
                        adi = new AdditionalInformation(tb, pi, ai, mc);
                    }
                }catch(Exception e){
                    adi = new AdditionalInformation(tb, pi);
                }                
                tb.setSize(adi.getPreferredSize());
                System.out.println(adi.isVisible());
                tb.add(adi);
                tb.pack();
                tb.setVisible(true);
                tb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            }
        );
        ctb.dispose();
    }
    
    public void grayTFBorders(){
        miTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        yearTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        ageTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        nationalityTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        religionTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        occupationTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        surnameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        givenNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        homeAddressTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        telephoneNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        cellphoneNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        officeNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
        faxNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(201,201,201)));
    }
    
    public boolean entriesValid(){
        String surname = surnameTF.getText();               //no filter *
        String givenName = givenNameTF.getText();           //no filter *
        String mi =  miTF.getText();
        String birthYear = yearTF.getText();                //no letters 
        String age = ageTF.getText();                       //no letters 
        String nationality = nationalityTF.getText();       //no numbers, special characters 
        String religion = religionTF.getText();             //no numbers 
        String occupation = occupationTF.getText();         //no numbers 
        String homeAddress = homeAddressTF.getText();       //no filter *
        
        if(!entriesNull(surname, givenName, mi, birthYear, age, nationality, occupation, homeAddress) &&
           !hasNumbers(mi) && mi.length() > -1 && mi.length() <= 2 &&
           !hasLetters(birthYear) &&
           !hasLetters(age) &&
           !hasNumbers(nationality) && !hasSpecialCharacters(nationality) && 
           !hasNumbers(religion) &&
           !hasNumbers(occupation)){
            return true;
        }else{
            return false; // one of the entries has invalid inputs
        }
        
    }
    
    public boolean entriesNull(String surname, String givenName, String mi, String birthYear, String age, String nationality, String occupation, String homeAddress){
        if(surname.isEmpty() || givenName.isEmpty() || mi.isEmpty() || birthYear.isEmpty() || age.isEmpty() || nationality.isEmpty() || occupation.isEmpty() || homeAddress.isEmpty()){
            return true;//one or more strings are null
        }else{
            return false;
        }
    }
    
    public boolean hasNumbers(String numberlessString){
        String pattern = "[0-9]";
        if(Pattern.compile(pattern).matcher(numberlessString).find()){
            return true;//there is a number in the string
        }else{
            return false;//the string has no numbers
        }
    }
    
    public boolean hasSpecialCharacters(String specialCharacterlessString){
        String pattern = "[^A-Za-z0-9]+";
        if(Pattern.compile(pattern).matcher(specialCharacterlessString).find()){
            return true;//there is a special character in the string
        }else{
            return false;
        }
    }
    
    public boolean hasLetters(String letterlessString){
        String pattern = "[A-Za-z]";
        if(Pattern.compile(pattern).matcher(letterlessString).find()){
            return true;//there is a letter on the string
        }else{
            return false;
        }   
    }

    private void insertData(){
        surnameTF.setText(pi.getSurname());
        givenNameTF.setText(pi.getGivenName());
        miTF.setText(pi.getMI());
        
        if(pi.getGender().compareTo("Male") == 0){
            genderCB.setSelectedIndex(0);
        } else {
            genderCB.setSelectedIndex(1);
        }
        
        yearTF.setText(String.valueOf(pi.getBirthYear()));
        nationalityTF.setText(pi.getNationality());
        religionTF.setText(pi.getReligion());
        occupationTF.setText(pi.getOccupation());
        homeAddressTF.setText(pi.getHomeAddress());
        telephoneNumberTF.setText(pi.getTelephoneNo());
        officeNumberTF.setText(pi.getOfficeNo());
        emailAddressTF.setText(pi.getEmailAdd());
        faxNumberTF.setText(pi.getFaxNo());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cellphoneNumberTF;
    private javax.swing.JComboBox dayCB;
    private javax.swing.JTextField emailAddressTF;
    private javax.swing.JTextField faxNumberTF;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField miTF;
    private javax.swing.JComboBox monthCB;
    private javax.swing.JTextField nationalityTF;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField occupationTF;
    private javax.swing.JTextField officeNumberTF;
    private javax.swing.JTextField religionTF;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JTextField telephoneNumberTF;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}
