package house_cleaning_booking_system;


public class SERVICE_OFFER extends javax.swing.JFrame {

    
    public SERVICE_OFFER() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        updatebutton = new javax.swing.JButton();
        border = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERVICE OFFER");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        updatebutton.setText("BACK");
        updatebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 100, 30));

        border.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.add(border, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 770, 370));

        jScrollPane3.setOpaque(false);

        jTextPane1.setEditable(false);
        jTextPane1.setText("[BASIC HOUSE CLEANING]\nINCLUSION: DUSTING, VACUUMING, SWEEPING , MOPPING, CLEANING\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 3,500\nDURATION: 4 HOURS\n\n[DEEP CLEANING]\nINCLUSION: HAND WASHING CABINETS, APPLIANCES CLEANING, POLISHING WOODS\n\n AREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 5,500                            \nDURATION: 6 HOURS\n\n[LAUNDRY SERVICE]\nINCLUSION: WASHING, FOLDING & DRYING\n\nDURATION:3 HOURS\nPRICING: 150 PER BASKET\n\n[GREEN CLEANING]\nINCLUSION: ECO FRIENDLY AND NON - TOXIC PRODUCTS\nRecommend: (FOR ALLERGIC TO CLEANING PRODUCTS & BABIES under 1-3 yrs. old)\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 5,000\nDURATION: minumum of 3 HOURS and 30 MINUTES\n\n[MOVE IN & MOVE OUTCLEANING]\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\nBASEMENT \nGARAGE\n\nPRICING: 3200\nDURATION: 3 HOURS\n\nPOST CONSTRUCTION CLEANING]\n\nAREA COVER:\nBEDROOM\nBATHROOM\nLIVING ROOM\nDINING ROOM\nKITCHEN\nHOME OFFICE \nNURSERY ROOM\n\nPRICING: 2200\nDURATION: 4 HOURS");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextPane1.setOpaque(false);
        jScrollPane3.setViewportView(jTextPane1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 730, 290));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
      menu men = new menu();
      men.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_updatebuttonActionPerformed
        
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
            java.util.logging.Logger.getLogger(SERVICE_OFFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVICE_OFFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVICE_OFFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVICE_OFFER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SERVICE_OFFER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JLabel border;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
