
package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.FlightDAO;
import br.com.AetherVoyages.dao.InterPassengerDAO;
import br.com.AetherVoyages.dao.PassengerDAO;
import br.com.AetherVoyages.model.Flight;
import br.com.AetherVoyages.model.InterPassenger;
import br.com.AetherVoyages.model.Passenger;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Consult extends javax.swing.JInternalFrame {

    public Consult() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jpLBL = new javax.swing.JPanel();
        lblConsults = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jpTabbed = new javax.swing.JPanel();
        tabbedConsult = new javax.swing.JTabbedPane();
        jpConsultFlights = new javax.swing.JPanel();
        jpTableF = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        lblSearcherF = new javax.swing.JLabel();
        txtFlights = new javax.swing.JTextField();
        bntSeacherF = new javax.swing.JButton();
        bntCleanF = new javax.swing.JButton();
        jpConsultPassenger = new javax.swing.JPanel();
        jpTableP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPassenger = new javax.swing.JTable();
        lblSearcherP = new javax.swing.JLabel();
        txtPassenger = new javax.swing.JTextField();
        bntSearcherP = new javax.swing.JButton();
        bntCleanP = new javax.swing.JButton();
        jpConsultInterPassenger = new javax.swing.JPanel();
        lblSearchrP = new javax.swing.JLabel();
        txtPassengerInter = new javax.swing.JTextField();
        bntSearchN = new javax.swing.JButton();
        bntCleanN = new javax.swing.JButton();
        jpTblNatio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInterPassenger = new javax.swing.JTable();
        jpButtons4 = new javax.swing.JPanel();
        bntUpdate4 = new javax.swing.JButton();
        bntDelete4 = new javax.swing.JButton();
        bntNew4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton6.setText("jButton6");

        setBorder(null);
        setClosable(true);
        setTitle("Aether Voyages - Consult");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jpLBL.setBackground(new java.awt.Color(0, 51, 153));
        jpLBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblConsults.setFont(new java.awt.Font("Mongolian Baiti", 3, 36)); // NOI18N
        lblConsults.setForeground(new java.awt.Color(255, 255, 255));
        lblConsults.setText("Aether Voyages - Consults");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpLBLLayout = new javax.swing.GroupLayout(jpLBL);
        jpLBL.setLayout(jpLBLLayout);
        jpLBLLayout.setHorizontalGroup(
            jpLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLBLLayout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConsults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpLBLLayout.setVerticalGroup(
            jpLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLBLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLBLLayout.createSequentialGroup()
                        .addComponent(lblConsults, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLBLLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpLBLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLBLLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLBLLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))))
        );

        tabbedConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedConsultMouseClicked(evt);
            }
        });

        jpConsultFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpConsultFlightsMouseClicked(evt);
            }
        });

        tblFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pilot", "Boarding", "Landing", "Time", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFlightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblFlightMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblFlight);

        javax.swing.GroupLayout jpTableFLayout = new javax.swing.GroupLayout(jpTableF);
        jpTableF.setLayout(jpTableFLayout);
        jpTableFLayout.setHorizontalGroup(
            jpTableFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        jpTableFLayout.setVerticalGroup(
            jpTableFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        lblSearcherF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSearcherF.setForeground(new java.awt.Color(0, 0, 0));
        lblSearcherF.setText("Searcher for flights:");

        txtFlights.setText(" Pesquisar");
        txtFlights.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFlightsMouseClicked(evt);
            }
        });

        bntSeacherF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSeacherF.setForeground(new java.awt.Color(0, 0, 0));
        bntSeacherF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        bntSeacherF.setText("Searcher");
        bntSeacherF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSeacherFActionPerformed(evt);
            }
        });

        bntCleanF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntCleanF.setForeground(new java.awt.Color(0, 0, 0));
        bntCleanF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        bntCleanF.setText("Clean");
        bntCleanF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCleanFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultFlightsLayout = new javax.swing.GroupLayout(jpConsultFlights);
        jpConsultFlights.setLayout(jpConsultFlightsLayout);
        jpConsultFlightsLayout.setHorizontalGroup(
            jpConsultFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTableF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpConsultFlightsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblSearcherF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSeacherF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCleanF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpConsultFlightsLayout.setVerticalGroup(
            jpConsultFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultFlightsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpConsultFlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntSeacherF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlights)
                    .addComponent(bntCleanF, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblSearcherF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jpTableF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedConsult.addTab("Flights Consult", jpConsultFlights);

        tblPassenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "CPF", "RG", "Boarding", "Destiny"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPassengerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPassenger);

        javax.swing.GroupLayout jpTablePLayout = new javax.swing.GroupLayout(jpTableP);
        jpTableP.setLayout(jpTablePLayout);
        jpTablePLayout.setHorizontalGroup(
            jpTablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        jpTablePLayout.setVerticalGroup(
            jpTablePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        lblSearcherP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSearcherP.setForeground(new java.awt.Color(0, 0, 0));
        lblSearcherP.setText("Searcher Passenger:");

        txtPassenger.setText(" Pesquisar");
        txtPassenger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassengerMouseClicked(evt);
            }
        });

        bntSearcherP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSearcherP.setForeground(new java.awt.Color(0, 0, 0));
        bntSearcherP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        bntSearcherP.setText("Searcher");
        bntSearcherP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSearcherPActionPerformed(evt);
            }
        });

        bntCleanP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntCleanP.setForeground(new java.awt.Color(0, 0, 0));
        bntCleanP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        bntCleanP.setText("Clean");
        bntCleanP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCleanPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultPassengerLayout = new javax.swing.GroupLayout(jpConsultPassenger);
        jpConsultPassenger.setLayout(jpConsultPassengerLayout);
        jpConsultPassengerLayout.setHorizontalGroup(
            jpConsultPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTableP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpConsultPassengerLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblSearcherP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntSearcherP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntCleanP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpConsultPassengerLayout.setVerticalGroup(
            jpConsultPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultPassengerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpConsultPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearcherP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSearcherP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCleanP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpTableP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedConsult.addTab("Passenger Consult", jpConsultPassenger);

        lblSearchrP.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSearchrP.setForeground(new java.awt.Color(0, 0, 0));
        lblSearchrP.setText("Passenger Search:");

        txtPassengerInter.setText(" Pesquisar");
        txtPassengerInter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassengerInter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassengerInterMouseClicked(evt);
            }
        });

        bntSearchN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSearchN.setForeground(new java.awt.Color(0, 0, 0));
        bntSearchN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        bntSearchN.setText("Search");
        bntSearchN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSearchNActionPerformed(evt);
            }
        });

        bntCleanN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntCleanN.setForeground(new java.awt.Color(0, 0, 0));
        bntCleanN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        bntCleanN.setText("Clean");
        bntCleanN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCleanNActionPerformed(evt);
            }
        });

        tblInterPassenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "CPF", "RG", "Boarding", "Destiny", "Passport"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInterPassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInterPassengerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblInterPassenger);

        javax.swing.GroupLayout jpTblNatioLayout = new javax.swing.GroupLayout(jpTblNatio);
        jpTblNatio.setLayout(jpTblNatioLayout);
        jpTblNatioLayout.setHorizontalGroup(
            jpTblNatioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jpTblNatioLayout.setVerticalGroup(
            jpTblNatioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultInterPassengerLayout = new javax.swing.GroupLayout(jpConsultInterPassenger);
        jpConsultInterPassenger.setLayout(jpConsultInterPassengerLayout);
        jpConsultInterPassengerLayout.setHorizontalGroup(
            jpConsultInterPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultInterPassengerLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(lblSearchrP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassengerInter, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntSearchN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntCleanN)
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(jpTblNatio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpConsultInterPassengerLayout.setVerticalGroup(
            jpConsultInterPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultInterPassengerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpConsultInterPassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchrP)
                    .addComponent(txtPassengerInter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSearchN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCleanN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTblNatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabbedConsult.addTab("International Passenger Consult", jpConsultInterPassenger);

        javax.swing.GroupLayout jpTabbedLayout = new javax.swing.GroupLayout(jpTabbed);
        jpTabbed.setLayout(jpTabbedLayout);
        jpTabbedLayout.setHorizontalGroup(
            jpTabbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedConsult)
        );
        jpTabbedLayout.setVerticalGroup(
            jpTabbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedConsult)
        );

        jpButtons4.setBackground(new java.awt.Color(0, 102, 102));
        jpButtons4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntUpdate4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntUpdate4.setForeground(new java.awt.Color(0, 0, 0));
        bntUpdate4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/cloudrefresh_icon-icons.com_54403.png"))); // NOI18N
        bntUpdate4.setText("Update");

        bntDelete4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDelete4.setForeground(new java.awt.Color(0, 0, 0));
        bntDelete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/recycling_recyclebin_empty_delete_trash_1771.png"))); // NOI18N
        bntDelete4.setText("Delete");

        bntNew4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNew4.setForeground(new java.awt.Color(0, 0, 0));
        bntNew4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/address_new_1271.png"))); // NOI18N
        bntNew4.setText("New");

        javax.swing.GroupLayout jpButtons4Layout = new javax.swing.GroupLayout(jpButtons4);
        jpButtons4.setLayout(jpButtons4Layout);
        jpButtons4Layout.setHorizontalGroup(
            jpButtons4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtons4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntUpdate4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNew4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDelete4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpButtons4Layout.setVerticalGroup(
            jpButtons4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtons4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpButtons4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntUpdate4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNew4)
                    .addComponent(bntDelete4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpTabbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpButtons4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpButtons4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void tabbedConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedConsultMouseClicked
        // TODO add your handling code here:
        
        listarPassenger();
        
    }//GEN-LAST:event_tabbedConsultMouseClicked

    private void tblInterPassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInterPassengerMouseClicked
        // TODO add your handling code here:
        var Screen = new CadInternational();
        Screen.setVisible(true);
        dispose();
        Screen.txtName.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 1).toString());
        Screen.txtEmail.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 2).toString());
        Screen.txtCPF.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 3).toString());
        Screen.txtRG.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 4).toString());
        Screen.txtBoarding.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 5).toString());
        Screen.txtDestiny.setText(tblInterPassenger.getValueAt(tblInterPassenger. getSelectedRow(), 6).toString());
       
        
    }//GEN-LAST:event_tblInterPassengerMouseClicked

    private void bntSearcherPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSearcherPActionPerformed
        // TODO add your handling code here:
        
        
        
        var dao = new PassengerDAO();
        List<Passenger> passes = dao.searchPassenger(txtPassenger.getText());
        DefaultTableModel dados = (DefaultTableModel) tblFlight.getModel();
        dados.setNumRows(0);
        
        for (var pass : passes) {
            dados.addRow(new Object []{
                pass.getCode(),
                pass.getName(),
                pass.getEmail(),
                pass.getCpf(),
                pass.getRg(),
                pass.getBoarding(),
                pass.getDestiny()
            });
        }
        
        
    }//GEN-LAST:event_bntSearcherPActionPerformed

    private void jpConsultFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpConsultFlightsMouseClicked
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_jpConsultFlightsMouseClicked

    private void bntSeacherFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSeacherFActionPerformed
        // TODO add your handling code here
        var dao = new FlightDAO();
        List<Flight> flies = dao.searchFlight(txtFlights.getText());
        DefaultTableModel dados = (DefaultTableModel) tblFlight.getModel();
        dados.setNumRows(0);
        
        for (Flight flight : flies) {
            dados.addRow(new Object []{
                flight.getId(),
                flight.getPilot(),
                flight.getBoarding(),
                flight.getLanding(),
                flight.getTime(),
                flight.getPrice()
            });
        }
        
    }//GEN-LAST:event_bntSeacherFActionPerformed

    private void tblFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFlightMouseClicked
        
        var Screen = new CadFlights();
        Screen.setVisible(true);
        dispose();
        Screen.txtID.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),0).toString());
        Screen.txtPilot.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),1).toString());
        Screen.txtCopilot.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),2).toString());
        Screen.txtBoardingF.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),3).toString());
        Screen.txtDestinyF.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),4).toString());
        Screen.txtTime.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),5).toString());
        Screen.txtPrice.setText(tblFlight.getValueAt(tblFlight.getSelectedRow(),6).toString());
        var screen = new MainScreen();
        screen.dispose();
      
        
    }//GEN-LAST:event_tblFlightMouseClicked

    private void tblPassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPassengerMouseClicked
        // TODO add your handling code here:
        var Screen = new CadNational();
        Screen.setVisible(true);
        Screen.txtID.setText(tblPassenger.getValueAt(tblPassenger.getSelectedRow(),0).toString());
        Screen.txtName.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 1).toString());
        Screen.txtEmail.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 2).toString());
        Screen.txtCPF.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 3).toString());
        Screen.txtRG.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 4).toString());
        Screen.txtBoardingN.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 5).toString());
        Screen.txtDestinyNatio.setText(tblPassenger.getValueAt(tblPassenger. getSelectedRow(), 6).toString());
        dispose();
        
    }//GEN-LAST:event_tblPassengerMouseClicked

    private void txtFlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlightsMouseClicked
        // TODO add your handling code here:
        txtFlights.setText("");
    }//GEN-LAST:event_txtFlightsMouseClicked

    private void txtPassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassengerMouseClicked
        // TODO add your handling code here:
        txtPassenger.setText("");
    }//GEN-LAST:event_txtPassengerMouseClicked

    private void txtPassengerInterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassengerInterMouseClicked
        // TODO add your handling code here:
        txtPassengerInter.setText("");
    }//GEN-LAST:event_txtPassengerInterMouseClicked

    private void bntCleanFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCleanFActionPerformed
        // TODO add your handling code here:
        txtFlights.setText("Pesquisar");
    }//GEN-LAST:event_bntCleanFActionPerformed

    private void bntCleanPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCleanPActionPerformed
        // TODO add your handling code here:
        txtPassenger.setText("Pesquisar");
    }//GEN-LAST:event_bntCleanPActionPerformed

    private void bntCleanNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCleanNActionPerformed
        // TODO add your handling code here:
        txtPassengerInter.setText("Pesquisar");
    }//GEN-LAST:event_bntCleanNActionPerformed

    private void bntSearchNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSearchNActionPerformed
        // TODO add your handling code here:
        
        var dao = new InterPassengerDAO();
        
        List<InterPassenger> passes = dao.searchPassenger(txtPassengerInter.getText());
        DefaultTableModel dados = (DefaultTableModel) tblFlight.getModel();
        dados.setNumRows(0);
        
        for (var pass : passes) {
            dados.addRow(new Object []{
                pass.getCode(),
                pass.getName(),
                pass.getEmail(),
                pass.getCpf(),
                pass.getRg(),
                pass.getBoarding(),
                pass.getDestiny(),
                pass.getPassport()
            });
        }
        
    }//GEN-LAST:event_bntSearchNActionPerformed

    private void tblFlightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFlightMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblFlightMouseEntered

    public void listarFlight(){
        FlightDAO dao = new FlightDAO();
        List<Flight> flights = dao.listFlight();
        DefaultTableModel dados = (DefaultTableModel) tblFlight.getModel();
        dados.setNumRows(0);
        
        for (Flight flight : flights) {
            dados.addRow(new Object []{
                flight.getId(),
                flight.getPilot(),
                flight.getBoarding(),
                flight.getLanding(),
                flight.getTime(),
                flight.getPrice()
            });
        }
    }
    
    public void listarPassenger(){
        PassengerDAO dao = new PassengerDAO();
        List<Passenger> passengers = dao.passengerList();
        DefaultTableModel dados = (DefaultTableModel) tblPassenger.getModel();
        dados.setNumRows(0);
        
        for (Passenger passenger : passengers) {
            dados.addRow(new Object []{
                passenger.getCode(),
                passenger.getName(),
                passenger.getCpf(),
                passenger.getEmail(),
                passenger.getRg(),
                passenger.getBoarding(),
                passenger.getDestiny()
            });
        }
    }
    
        public void listarInterPassenger(){
        InterPassengerDAO dao = new InterPassengerDAO();
        List<InterPassenger> passengers = dao.passengerList();
        DefaultTableModel dados = (DefaultTableModel) tblInterPassenger.getModel();
        dados.setNumRows(0);
        
            for (InterPassenger passenger : passengers) {
                dados.addRow(new Object []{
                passenger.getCode(),
                passenger.getName(),
                passenger.getCpf(),
                passenger.getEmail(),
                passenger.getRg(),
                passenger.getBoarding(),
                passenger.getDestiny(),
                passenger.getPassport()
            });
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntCleanF;
    public javax.swing.JButton bntCleanN;
    public javax.swing.JButton bntCleanP;
    public javax.swing.JButton bntDelete4;
    public javax.swing.JButton bntNew4;
    public javax.swing.JButton bntSeacherF;
    public javax.swing.JButton bntSearchN;
    public javax.swing.JButton bntSearcherP;
    public javax.swing.JButton bntUpdate4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpButtons4;
    private javax.swing.JPanel jpConsultFlights;
    private javax.swing.JPanel jpConsultInterPassenger;
    private javax.swing.JPanel jpConsultPassenger;
    private javax.swing.JPanel jpLBL;
    private javax.swing.JPanel jpTabbed;
    public javax.swing.JPanel jpTableF;
    private javax.swing.JPanel jpTableP;
    private javax.swing.JPanel jpTblNatio;
    private javax.swing.JLabel lblConsults;
    private javax.swing.JLabel lblSearcherF;
    private javax.swing.JLabel lblSearcherP;
    private javax.swing.JLabel lblSearchrP;
    private javax.swing.JTabbedPane tabbedConsult;
    private javax.swing.JTable tblFlight;
    private javax.swing.JTable tblInterPassenger;
    public javax.swing.JTable tblPassenger;
    public javax.swing.JTextField txtFlights;
    public javax.swing.JTextField txtPassenger;
    public javax.swing.JTextField txtPassengerInter;
    // End of variables declaration//GEN-END:variables
}
