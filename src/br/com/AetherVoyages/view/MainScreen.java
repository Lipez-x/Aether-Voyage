
package br.com.AetherVoyages.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class MainScreen extends javax.swing.JFrame {


    
    public MainScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBottom = new javax.swing.JPanel();
        jSepBottom = new javax.swing.JSeparator();
        lblDate = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpSide = new javax.swing.JPanel();
        lblAetherVoyages = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        img = new javax.swing.JLabel();
        sBackgroundScreen = new javax.swing.JDesktopPane();
        jpBackground = new javax.swing.JPanel();
        imgBackground = new javax.swing.JLabel();
        jMBarMain = new javax.swing.JMenuBar();
        jMRegistration = new javax.swing.JMenu();
        jMEmployees = new javax.swing.JMenu();
        jMIRegister = new javax.swing.JMenuItem();
        jMFlightsC = new javax.swing.JMenu();
        jMIFlight = new javax.swing.JMenuItem();
        jMIConsultF = new javax.swing.JMenuItem();
        jMFlights = new javax.swing.JMenu();
        jMINationalFlights = new javax.swing.JMenuItem();
        jMIInternationalFlights = new javax.swing.JMenuItem();
        jMPromotions = new javax.swing.JMenu();
        jMIPromoNati = new javax.swing.JMenuItem();
        jMIPromoInter = new javax.swing.JMenuItem();
        jmOptions = new javax.swing.JMenu();
        jmBack = new javax.swing.JMenu();
        jmRemoveB = new javax.swing.JMenuItem();
        jmPutB = new javax.swing.JMenuItem();
        jMExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aether Voyages");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/masculine-avatar-user-with-suit_icon-icons.com_68296.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblUser.setText("user");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Google_Calendar_icon-icons.com_75710 (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/clock_icon-icons.com_54407.png"))); // NOI18N

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSepBottom, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jSepBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(lblHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBottomLayout.createSequentialGroup()
                        .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(lblUser))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpSide.setBackground(new java.awt.Color(0, 51, 153));
        jpSide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAetherVoyages.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 24)); // NOI18N
        lblAetherVoyages.setForeground(new java.awt.Color(255, 255, 255));
        lblAetherVoyages.setText("Aether Voyages");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Airplane_Grey_icon-icons.com_54909 (1).png"))); // NOI18N

        javax.swing.GroupLayout jpSideLayout = new javax.swing.GroupLayout(jpSide);
        jpSide.setLayout(jpSideLayout);
        jpSideLayout.setHorizontalGroup(
            jpSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jpSideLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jpSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAetherVoyages)
                    .addGroup(jpSideLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(img)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpSideLayout.setVerticalGroup(
            jpSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSideLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAetherVoyages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Aether Project (1).png"))); // NOI18N
        imgBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(imgBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        sBackgroundScreen.setLayer(jpBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout sBackgroundScreenLayout = new javax.swing.GroupLayout(sBackgroundScreen);
        sBackgroundScreen.setLayout(sBackgroundScreenLayout);
        sBackgroundScreenLayout.setHorizontalGroup(
            sBackgroundScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sBackgroundScreenLayout.setVerticalGroup(
            sBackgroundScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/User_icon-icons.com_76524.png"))); // NOI18N
        jMRegistration.setText("Registration   |");
        jMRegistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/customer_person_people_man_user_client_16px.png"))); // NOI18N
        jMEmployees.setText("Employees");

        jMIRegister.setText("Register");
        jMIRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegisterActionPerformed(evt);
            }
        });
        jMEmployees.add(jMIRegister);

        jMRegistration.add(jMEmployees);

        jMFlightsC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/flight.png"))); // NOI18N
        jMFlightsC.setText("Flights");

        jMIFlight.setText("Register");
        jMIFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFlightActionPerformed(evt);
            }
        });
        jMFlightsC.add(jMIFlight);

        jMIConsultF.setText("Consult");
        jMIConsultF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultFActionPerformed(evt);
            }
        });
        jMFlightsC.add(jMIConsultF);

        jMRegistration.add(jMFlightsC);

        jMBarMain.add(jMRegistration);

        jMFlights.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/icon13_101141.png"))); // NOI18N
        jMFlights.setText("Flights   |");
        jMFlights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMINationalFlights.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/flight.png"))); // NOI18N
        jMINationalFlights.setText("National Flights");
        jMINationalFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINationalFlightsActionPerformed(evt);
            }
        });
        jMFlights.add(jMINationalFlights);

        jMIInternationalFlights.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/flight.png"))); // NOI18N
        jMIInternationalFlights.setText("International Flights");
        jMIInternationalFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInternationalFlightsActionPerformed(evt);
            }
        });
        jMFlights.add(jMIInternationalFlights);

        jMBarMain.add(jMFlights);

        jMPromotions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/1486395291-08-sales_80583.png"))); // NOI18N
        jMPromotions.setText("Promotions   |");
        jMPromotions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIPromoNati.setText("Promo - National");
        jMIPromoNati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPromoNatiActionPerformed(evt);
            }
        });
        jMPromotions.add(jMIPromoNati);

        jMIPromoInter.setText("Promo - International");
        jMIPromoInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPromoInterActionPerformed(evt);
            }
        });
        jMPromotions.add(jMIPromoInter);

        jMBarMain.add(jMPromotions);

        jmOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/2799204-management_99783.png"))); // NOI18N
        jmOptions.setText("Options  |");

        jmBack.setText("Background");

        jmRemoveB.setText("Remove Background");
        jmRemoveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRemoveBActionPerformed(evt);
            }
        });
        jmBack.add(jmRemoveB);

        jmPutB.setText("Put Background");
        jmPutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPutBActionPerformed(evt);
            }
        });
        jmBack.add(jmPutB);

        jmOptions.add(jmBack);

        jMBarMain.add(jmOptions);

        jMExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Logout_37127.png"))); // NOI18N
        jMExit.setText("Exit  ");
        jMExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMExitMouseClicked(evt);
            }
        });
        jMBarMain.add(jMExit);

        setJMenuBar(jMBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sBackgroundScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sBackgroundScreen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 902, 544);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegisterActionPerformed
       // TODO add your handling code here:
       var screen = new RegisterEmployee();
       sBackgroundScreen.add(screen);
       screen.setVisible(true);
       screen.search();
    }//GEN-LAST:event_jMIRegisterActionPerformed

    private void jMIConsultFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultFActionPerformed
        // TODO add your handling code here:
        var screen = new Consult();
        sBackgroundScreen.add(screen);
        screen.setVisible(true);
        screen.listarFlight();
        
    }//GEN-LAST:event_jMIConsultFActionPerformed

    private void jMINationalFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINationalFlightsActionPerformed
        // TODO add your handling code here:
       var screen = new CadNational();
       sBackgroundScreen.add(screen);
       screen.setVisible(true);
        
    }//GEN-LAST:event_jMINationalFlightsActionPerformed

    private void jMIInternationalFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInternationalFlightsActionPerformed
        // TODO add your handling code here:
        var Screen = new CadInternational();
        sBackgroundScreen.add(Screen);
        Screen.setVisible(true);
        
    }//GEN-LAST:event_jMIInternationalFlightsActionPerformed

    private void jMExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMExitMouseClicked
        // TODO add your handling code here:
        int answe;
        answe = (JOptionPane.showConfirmDialog(null, "Do you want to close the software?"));
        
         if(answe<=0){
            var log = new Login();
            log.setVisible(true);
            
            setVisible(false);
            dispose();
            
          }else{
            var log = new Login();
            log.setVisible(false);
            setVisible(true);
            
         }
         
    }//GEN-LAST:event_jMExitMouseClicked

    private void jMIFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFlightActionPerformed
        // TODO add your handling code here:
        var Screen = new CadFlights();
        sBackgroundScreen.add(Screen);
        Screen.setVisible(true);
        
    }//GEN-LAST:event_jMIFlightActionPerformed

    private void jMIPromoNatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPromoNatiActionPerformed
        // TODO add your handling code here:
        var Screen = new PromoNational();
        sBackgroundScreen.add(Screen);
        Screen.setVisible(true);
        
    }//GEN-LAST:event_jMIPromoNatiActionPerformed

    private void jMIPromoInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPromoInterActionPerformed
        // TODO add your handling code here:
        var Screen = new PromoInternational();
        sBackgroundScreen.add(Screen);
        Screen.setVisible(true);
        
    }//GEN-LAST:event_jMIPromoInterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        //Date
        Date dateSystem = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        lblDate.setText(format.format(dateSystem));
        
        //Hour
        Timer timer = new Timer(1000, new hour());
        timer.start();
        
    }//GEN-LAST:event_formWindowOpened

    private void jmRemoveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRemoveBActionPerformed
        // TODO add your handling code here:
        imgBackground.setVisible(false);
    }//GEN-LAST:event_jmRemoveBActionPerformed

    private void jmPutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPutBActionPerformed
        // TODO add your handling code here:
        imgBackground.setVisible(true);
    }//GEN-LAST:event_jmPutBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JMenuBar jMBarMain;
    public static javax.swing.JMenu jMEmployees;
    private javax.swing.JMenu jMExit;
    private javax.swing.JMenu jMFlights;
    public static javax.swing.JMenu jMFlightsC;
    private javax.swing.JMenuItem jMIConsultF;
    private javax.swing.JMenuItem jMIFlight;
    private javax.swing.JMenuItem jMIInternationalFlights;
    private javax.swing.JMenuItem jMINationalFlights;
    private javax.swing.JMenuItem jMIPromoInter;
    private javax.swing.JMenuItem jMIPromoNati;
    private javax.swing.JMenuItem jMIRegister;
    private javax.swing.JMenu jMPromotions;
    public static javax.swing.JMenu jMRegistration;
    private javax.swing.JSeparator jSepBottom;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu jmBack;
    private javax.swing.JMenu jmOptions;
    private javax.swing.JMenuItem jmPutB;
    private javax.swing.JMenuItem jmRemoveB;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpSide;
    private javax.swing.JLabel lblAetherVoyages;
    public javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblHour;
    public javax.swing.JLabel lblUser;
    public javax.swing.JDesktopPane sBackgroundScreen;
    // End of variables declaration//GEN-END:variables

    class hour implements ActionListener{
        public void actionPerformed(ActionEvent e){
            DateFormat format = new SimpleDateFormat("HH:mm:ss");
            Calendar now = Calendar.getInstance();
            lblHour.setText(format.format(now.getTime()));
        }
    }

    class Screen {

        public Screen() {
        }
    }
    
}//The End class main
