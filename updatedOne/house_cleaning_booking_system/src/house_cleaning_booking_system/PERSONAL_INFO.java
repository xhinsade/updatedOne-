package house_cleaning_booking_system;

 
public final class PERSONAL_INFO extends javax.swing.JFrame {

    private String fullname;
    private String username;
    private String address;
    private String number;
    private String email;
    private String age;
    private String birthdate;
    private String gender;
    
    
    
    public PERSONAL_INFO(String fullname, String username, String address, String number, String email, String age, String birthdate, String gender) {
        initComponents();
        this.fullname = fullname;
        this.username = username;
        this.address = address;
        this.number = number;
        this.email = email;
        this.age = age;
        this.birthdate = birthdate;
        this.gender = gender;
        
        displayPersonalInfo();
    }

    public PERSONAL_INFO(){
        initComponents();
        
}
    
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        t1_txtname = new javax.swing.JLabel();
        t1_txtusername = new javax.swing.JLabel();
        t1_txtaddress = new javax.swing.JLabel();
        t1_txtphonenumber = new javax.swing.JLabel();
        t1_txtemail = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t1_txtage = new javax.swing.JLabel();
        t1_txtgender = new javax.swing.JLabel();
        t1_txtbirthdate = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        updatebutton1 = new javax.swing.JButton();
        pi_birthdate = new javax.swing.JLabel();
        pi_name = new javax.swing.JLabel();
        pi_username = new javax.swing.JLabel();
        pi_address = new javax.swing.JLabel();
        pi_number = new javax.swing.JLabel();
        pi_email = new javax.swing.JLabel();
        pi_age = new javax.swing.JLabel();
        pi_gender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSONAL INFORMATION");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 781, 99));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1_txtname.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtname.setText("NAME:");
        jPanel1.add(t1_txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 93, 20));

        t1_txtusername.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtusername.setText("USERNAME:");
        jPanel1.add(t1_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 93, 20));

        t1_txtaddress.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtaddress.setText("ADDRESS:");
        jPanel1.add(t1_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 93, 21));

        t1_txtphonenumber.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtphonenumber.setText("PHONE NUMBER:");
        jPanel1.add(t1_txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 26));

        t1_txtemail.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtemail.setText("EMAIL:");
        jPanel1.add(t1_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 21));

        jLabel15.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel15.setText("ADDITIONAL INFO:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, -1));

        t1_txtage.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtage.setText("AGE:");
        jPanel1.add(t1_txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 90, 20));

        t1_txtgender.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtgender.setText("GENDER:");
        jPanel1.add(t1_txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 90, 20));

        t1_txtbirthdate.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        t1_txtbirthdate.setText("BIRTHDATE:");
        jPanel1.add(t1_txtbirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, 20));

        backbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 30));

        updatebutton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updatebutton1.setText("UPDATE");
        updatebutton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 100, 30));

        pi_birthdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 250, 30));

        pi_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 30));

        pi_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 30));

        pi_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 30));

        pi_number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, 30));

        pi_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 30));

        pi_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 250, 30));

        pi_gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pi_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 250, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 680, 360));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void displayPersonalInfo() {
        pi_name.setText(fullname);
        pi_username.setText(username);
        pi_address.setText(address);
        pi_number.setText(number);
        pi_email.setText(email);
        pi_age.setText(age);
        pi_gender.setText(gender);
        pi_birthdate.setText(birthdate);
    
        
    }
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
      menu men = new menu();
      men.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void updatebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebutton1ActionPerformed
    
    }//GEN-LAST:event_updatebutton1ActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            new PERSONAL_INFO().setVisible(true);
        }
    });
}

      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JLabel pi_address;
    public javax.swing.JLabel pi_age;
    public javax.swing.JLabel pi_birthdate;
    public javax.swing.JLabel pi_email;
    public javax.swing.JLabel pi_gender;
    public javax.swing.JLabel pi_name;
    public javax.swing.JLabel pi_number;
    public javax.swing.JLabel pi_username;
    private javax.swing.JLabel t1_txtaddress;
    private javax.swing.JLabel t1_txtage;
    private javax.swing.JLabel t1_txtbirthdate;
    private javax.swing.JLabel t1_txtemail;
    private javax.swing.JLabel t1_txtgender;
    private javax.swing.JLabel t1_txtname;
    private javax.swing.JLabel t1_txtphonenumber;
    private javax.swing.JLabel t1_txtusername;
    private javax.swing.JButton updatebutton1;
    // End of variables declaration//GEN-END:variables

   
}