
package house_cleaning_booking_system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class BOOKING extends javax.swing.JFrame {  
    
    
    
    public BOOKING() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        service = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PRICINGTXT = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Confirmbutton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        payment = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        PRICINGTXT1 = new javax.swing.JLabel();
        pricing = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOKING FORM");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 90));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TYPE OF SERVICE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        service.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        service.setForeground(new java.awt.Color(51, 51, 51));
        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC HOUSE CLEANING", "DEEP CLEANING", "LAUNDRY SERVICE", "GREEN CLEANING", "MOVE IN & MOVE OUT", "POST CONSTRUCTION CLEANING" }));
        service.setToolTipText("TYPES OF SERVICE"); // NOI18N
        service.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        service.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        service.setOpaque(false);
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        jPanel1.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 280, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FILL IN THE INFORMATION NEEDED:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PAYMENT OPTION:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 20));

        PRICINGTXT.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        PRICINGTXT.setForeground(new java.awt.Color(255, 255, 255));
        PRICINGTXT.setText("TIME: hh:mm");
        jPanel1.add(PRICINGTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SELECT DATE:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 20));

        Confirmbutton.setBackground(new java.awt.Color(255, 255, 255));
        Confirmbutton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Confirmbutton.setForeground(new java.awt.Color(51, 51, 51));
        Confirmbutton.setText("CONFIRM");
        Confirmbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Confirmbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 30));

        CancelButton.setBackground(new java.awt.Color(255, 255, 255));
        CancelButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(51, 51, 51));
        CancelButton.setText("CANCEL");
        CancelButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, 30));

        payment.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        payment.setForeground(new java.awt.Color(51, 51, 51));
        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank Transfer", "Gcash", "In Counter Payment", "Door to Door Payment" }));
        payment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 30));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DURATION:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 80, 30));

        duration.setEditable(false);
        duration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 250, 30));

        PRICINGTXT1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        PRICINGTXT1.setForeground(new java.awt.Color(255, 255, 255));
        PRICINGTXT1.setText("PRICING:");
        jPanel1.add(PRICINGTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 90, 30));

        pricing.setEditable(false);
        pricing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(pricing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 250, 30));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 670, 370));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.add(jLabel1);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
        
        
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
       menu me = new menu();
       me.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ConfirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbuttonActionPerformed

       String services = service.getSelectedItem().toString();
       String payments = payment.getSelectedItem().toString();
       String durationSelect = duration.getText();
       Date dateSelect = date.getDate();
       String pricingSelect = pricing.getText();
       String inputTime = time.getText();
       
       DateFormat timeFormat = new SimpleDateFormat("hh:mm a");
       
       try {
            // Parse the input text into a Date object
            Date parsedTime = timeFormat.parse(inputTime);

            // Format the parsed time back to string to ensure it matches the input format
            String formattedTime = timeFormat.format(parsedTime);           
            time.setText("Selected Time: " + formattedTime);
            
        } catch (ParseException ex) {          
            time.setText("Invalid Time Format");
        }
       
       if (services.isEmpty() || payments.isEmpty() || dateSelect == null) {
       JOptionPane.showMessageDialog(this, "Please fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
       } else {
        int option = JOptionPane.showConfirmDialog(this, "Please confirm the following: ", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
        BOOKING_CONFIRMATION confirm = new BOOKING_CONFIRMATION();
        confirm.setVisible(true);
               
    } else if (option == JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "Try again later");
        
        
    }
       }
    }//GEN-LAST:event_ConfirmbuttonActionPerformed

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed
       
        String selectedService = service.getSelectedItem().toString();
        switch(selectedService) {
            case "BASIC HOUSE CLEANING":
                duration.setText("4 hours");
                pricing.setText("3,500");
                break;
            case "DEEP CLEANING":
                duration.setText("6 hours");
                pricing.setText("5,500");
                break;
            case "LAUNDRY SERVICE":
                duration.setText("3 hours");
                pricing.setText("750");
                break;
            case "GREEN CLEANING":
                duration.setText("Minimum of 3 hours and 30 minutes");
                pricing.setText("5,000");
                break;
            case "MOVE IN & MOVE OUT":
                duration.setText("3 hours");
                 pricing.setText("3,200");
                break;
            case "POST CONSTRUCTION CLEANING":
                duration.setText("4 hours");
                 pricing.setText("2,200");
                break;
            default:
                pricing.setText("");
                break;
        }
    
        
    

    }//GEN-LAST:event_serviceActionPerformed

         public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOOKING().setVisible(true);
            }
        });
    }
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton Confirmbutton;
    private javax.swing.JLabel PRICINGTXT;
    private javax.swing.JLabel PRICINGTXT1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JTextField pricing;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
