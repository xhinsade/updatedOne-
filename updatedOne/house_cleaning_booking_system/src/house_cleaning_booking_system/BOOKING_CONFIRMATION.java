
package house_cleaning_booking_system;

public class BOOKING_CONFIRMATION extends javax.swing.JFrame {
    
   
    
    public BOOKING_CONFIRMATION() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ca_txtfullname = new javax.swing.JLabel();
        ca_fullname = new javax.swing.JTextField();
        ca_txtemail = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        ca_txtemail1 = new javax.swing.JLabel();
        ca_phonenumber = new javax.swing.JTextField();
        ca_txtaddress = new javax.swing.JLabel();
        ca_address = new javax.swing.JPasswordField();
        servicetxt = new javax.swing.JLabel();
        paymenttxt = new javax.swing.JLabel();
        timetxt = new javax.swing.JLabel();
        AMOUNTTXT = new javax.swing.JLabel();
        service = new javax.swing.JTextField();
        DATE = new javax.swing.JTextField();
        confirmbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        DATETXT = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        durationtxt1 = new javax.swing.JLabel();
        AMOUNT = new javax.swing.JTextField();
        time1 = new javax.swing.JTextField();
        payment1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOKING CONFIRMATION");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ca_txtfullname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtfullname.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtfullname.setText("FULLNAME:");
        jPanel1.add(ca_txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        ca_fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, 219, 30));

        ca_txtemail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail.setText("EMAIL:");
        jPanel1.add(ca_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 73, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, 30));

        ca_txtemail1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail1.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail1.setText("PHONE NO:");
        jPanel1.add(ca_txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        ca_phonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 30));

        ca_txtaddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtaddress.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtaddress.setText("ADDRESS:");
        jPanel1.add(ca_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        ca_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        servicetxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        servicetxt.setForeground(new java.awt.Color(255, 255, 255));
        servicetxt.setText("TYPE OF SERVICE:");
        jPanel1.add(servicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 20));

        paymenttxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        paymenttxt.setForeground(new java.awt.Color(255, 255, 255));
        paymenttxt.setText("PAYMENT OPTION:");
        jPanel1.add(paymenttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 20));

        timetxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        timetxt.setForeground(new java.awt.Color(255, 255, 255));
        timetxt.setText("SELECT TIME:");
        jPanel1.add(timetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, 20));

        AMOUNTTXT.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AMOUNTTXT.setForeground(new java.awt.Color(255, 255, 255));
        AMOUNTTXT.setText("TOTAL AMOUNT:");
        jPanel1.add(AMOUNTTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 130, 20));

        service.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 210, 30));

        DATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 30));

        confirmbutton.setBackground(new java.awt.Color(255, 255, 255));
        confirmbutton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        confirmbutton.setForeground(new java.awt.Color(51, 51, 51));
        confirmbutton.setText("CONFIRM");
        confirmbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 283, 130, 30));

        backbutton.setBackground(new java.awt.Color(255, 255, 255));
        backbutton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backbutton.setForeground(new java.awt.Color(51, 51, 51));
        backbutton.setText("BACK");
        backbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 283, 110, 30));

        DATETXT.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        DATETXT.setForeground(new java.awt.Color(255, 255, 255));
        DATETXT.setText("SELECT DATE:");
        jPanel1.add(DATETXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 110, 20));

        duration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 210, 30));

        durationtxt1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        durationtxt1.setForeground(new java.awt.Color(255, 255, 255));
        durationtxt1.setText("DURATION:");
        jPanel1.add(durationtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 20));

        AMOUNT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 210, 30));

        time1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 210, 30));

        payment1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 210, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        BOOKING booking = new BOOKING();
        booking.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
       HomePage1 home = new HomePage1();
       home.setVisible(true);
    }//GEN-LAST:event_confirmbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(BOOKING_CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOKING_CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOKING_CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOKING_CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOKING_CONFIRMATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JLabel AMOUNTTXT;
    private javax.swing.JTextField DATE;
    private javax.swing.JLabel DATETXT;
    private javax.swing.JButton backbutton;
    private javax.swing.JPasswordField ca_address;
    private javax.swing.JTextField ca_fullname;
    private javax.swing.JTextField ca_phonenumber;
    private javax.swing.JLabel ca_txtaddress;
    private javax.swing.JLabel ca_txtemail;
    private javax.swing.JLabel ca_txtemail1;
    private javax.swing.JLabel ca_txtfullname;
    private javax.swing.JButton confirmbutton;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel durationtxt1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField payment1;
    private javax.swing.JLabel paymenttxt;
    private javax.swing.JTextField service;
    private javax.swing.JLabel servicetxt;
    private javax.swing.JTextField time1;
    private javax.swing.JLabel timetxt;
    // End of variables declaration//GEN-END:variables
}
