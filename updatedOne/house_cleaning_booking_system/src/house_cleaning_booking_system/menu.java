
package house_cleaning_booking_system;


public class menu extends javax.swing.JFrame {

    
     public menu() {
        initComponents();
    }

   
        
     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pi = new javax.swing.JButton();
        schedule = new javax.swing.JButton();
        BOOKINGS = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        so1 = new javax.swing.JButton();
        bh = new javax.swing.JButton();
        tc1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "MY ACCOUNT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255))));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HOUSE CLEANING BOOKING SYSTEM");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "WELCOME TO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 8, 760, 80));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        jPanel2.setBackground(new java.awt.Color(233, 108, 108));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pi.setText("PERSONAL INFO");
        pi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        jPanel2.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 190, 30));

        schedule.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        schedule.setText("SCHEDULE");
        schedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });
        jPanel2.add(schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 190, 30));

        BOOKINGS.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BOOKINGS.setText("BOOKING");
        BOOKINGS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOOKINGS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKINGSActionPerformed(evt);
            }
        });
        jPanel2.add(BOOKINGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 190, 30));

        log_out.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        log_out.setText("LOG - OUT");
        log_out.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        jPanel2.add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 150, 30));

        so1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        so1.setText("SERVICE OFFER");
        so1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel2.add(so1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 190, 30));

        bh.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bh.setText("BOOKINGS HISTORY");
        bh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhActionPerformed(evt);
            }
        });
        jPanel2.add(bh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 190, 30));

        tc1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tc1.setText("TERMS & CONDITION");
        tc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc1ActionPerformed(evt);
            }
        });
        jPanel2.add(tc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 190, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "MY ACCOUNT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 240, 380));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Experienced and trustworthy cleaners");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OUR SERVICE OFFERS:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customizable cleaning plans");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eco-friendly cleaning products");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Affordable pricing");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Satisfaction guaranteed");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("WHY CHOOSE US?");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BASIC HOUSE CLEANING");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DEEP CLEANING SERVICE");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LAUNDRY CLEANING SERVICE");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("GREEN CLEANING SERVICE");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MOVE IN - MOVE OUT SERVICE");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 210, 20));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("POST CONSTRUCTION CLEANING");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, 30));
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 30));
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 30));
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 30));
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 370));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleActionPerformed
   MY_SCHEDULE sched = new MY_SCHEDULE();
   sched.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_scheduleActionPerformed

    private void BOOKINGSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKINGSActionPerformed
    BOOKING book = new BOOKING();
    book.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_BOOKINGSActionPerformed

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
       SERVICE_OFFER offer= new SERVICE_OFFER();
       offer.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_so1ActionPerformed
      
    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
                                    
    String fullname = "";
    String username = "";
    String address = "";
    String number = "";
    String email = "";
    String age = "";
    String birthdate = "";
    String gender = "";
    
    PERSONAL_INFO info = new PERSONAL_INFO(fullname, username, address, number, email, age, birthdate, gender);
    info.displayPersonalInfo();


    }//GEN-LAST:event_piActionPerformed

    private void bhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhActionPerformed
     BOOKING_HISTORY history = new BOOKING_HISTORY();
     history.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_bhActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        System.exit(0);
    }//GEN-LAST:event_log_outActionPerformed

    private void tc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc1ActionPerformed
      TERMSandCONDITION tc = new TERMSandCONDITION();
      tc.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_tc1ActionPerformed
       
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOKINGS;
    private javax.swing.JButton bh;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton pi;
    private javax.swing.JButton schedule;
    private javax.swing.JButton so1;
    private javax.swing.JButton tc1;
    // End of variables declaration//GEN-END:variables

    }
