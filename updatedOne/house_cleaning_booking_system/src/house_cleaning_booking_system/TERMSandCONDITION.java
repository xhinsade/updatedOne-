package house_cleaning_booking_system;

import javax.swing.JOptionPane;


public class TERMSandCONDITION extends javax.swing.JFrame {

    
    public TERMSandCONDITION() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TERMS & CONDITION");
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

        backbutton.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 130, 30));

        jTextPane3.setText("1. Definitions\n\n\"Company\" refers to HOUSE CLEANING BOOKING SYSTEM , a professional house cleaning service.\n\"Cleaner\" refers to any employee or subcontractor of the Company who provides cleaning services.\n\"Client\" refers to any person or entity who hires the Company to provide cleaning services.\n\"Service\" refers to the cleaning services provided by the Company.\n\"Cleaning Visit\" refers to a single visit by a Cleaner to the Client's home to perform the Service.\n2. Contract\n\nThe Client agrees to the Company's terms and conditions by using the Company's services.\nThese terms and conditions take precedence over any other terms put forward by the Client.\n3. Payment\n\nThe Client will be invoiced for the Service after each Cleaning Visit.\nPayment is due within 7 days of the invoice date.\nLate payments may incur a late fee of $10 or 5% of the invoice total, whichever is greater.\nThe Company reserves the right to charge interest on late payments at a rate of 2% per month.\nThe Client is responsible for any expenses incurred by the Company during the Cleaning Visit, such as parking fees or the cost of replacement materials.\n4. Equipment\n\nThe Company will provide all necessary cleaning equipment and materials, unless otherwise agreed.\nThe Client is responsible for ensuring that all equipment and materials provided by the Client are in good working order.\nThe Company cannot accept liability for any damage to equipment or materials provided by the Client.\n5. Checklists\n\nThe Cleaner will use a checklist to ensure that all cleaning tasks are completed.\nThe Client may request a copy of the checklist at any time.\n6. Refunds\n\nThe Company does not offer refunds for unsatisfactory Service, except in exceptional circumstances.\nIf the Client is not satisfied with the Service, they must notify the Company within 24 hours of the Cleaning Visit.\nThe Company will make reasonable efforts to rectify any issues raised by the Client.\n7. Cancellation\n\nThe Client must give at least 24 hours' notice to cancel a Cleaning Visit.\nIf the Client cancels with less than 24 hours' notice, they will be charged for the full cost of the Cleaning Visit.\nThe Company reserves the right to cancel a Cleaning Visit at any time, in which case the Client will not be charged.\n8. Liability\n\nThe Company cannot accept liability for any loss or damage to the Client's property, except in cases of gross negligence or willful misconduct.\nThe Client is responsible for ensuring that the Cleaner has access to all areas of the home that require cleaning.\nThe Client is responsible for ensuring that any pets are kept under control during the Cleaning Visit.\n9. Confidentiality\n\nThe Company will treat all information about the Client and their home as confidential.\nThe Cleaner will not disclose any information about the Client or their home to any third party, except with the Client's written consent.\n10. Dispute Resolution\n\nAny disputes between the Company and the Client will be resolved through mediation or arbitration, as agreed by both parties.\nThe Company and the Client will make reasonable efforts to resolve any disputes through informal negotiation.\n11. Governing Law\n\nThese terms and conditions are governed by the laws of the state in which the Company is based.");
        jScrollPane1.setViewportView(jTextPane3);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 700, 280));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 750, 368));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed
        
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
            java.util.logging.Logger.getLogger(TERMSandCONDITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TERMSandCONDITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TERMSandCONDITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TERMSandCONDITION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TERMSandCONDITION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
