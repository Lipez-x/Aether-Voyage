
package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.FlightDAO;
import br.com.AetherVoyages.dao.PassengerDAO;
import br.com.AetherVoyages.model.Flight;
import br.com.AetherVoyages.model.Passenger;
import java.awt.event.KeyEvent;
import static java.lang.Double.parseDouble;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadFlights extends javax.swing.JInternalFrame {

    
    public CadFlights() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jpConsult = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultF = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btClearS = new javax.swing.JButton();
        jpTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFlights = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bntUpdate = new javax.swing.JButton();
        bntNew = new javax.swing.JButton();
        bntDelete = new javax.swing.JButton();
        bntSave = new javax.swing.JButton();
        jpDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPilot = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtCopilot = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTime = new javax.swing.JFormattedTextField();
        lblBoardingN = new javax.swing.JLabel();
        txtBoardingF = new javax.swing.JTextField();
        lblDestinyNatio = new javax.swing.JLabel();
        txtDestinyF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeatN = new javax.swing.JTextField();
        imgBoarding = new javax.swing.JLabel();
        imgDest = new javax.swing.JLabel();
        imgName = new javax.swing.JLabel();
        imgEmail = new javax.swing.JLabel();
        imgID = new javax.swing.JLabel();
        imgCPF = new javax.swing.JLabel();
        imgRG = new javax.swing.JLabel();
        imgSeat = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setResizable(true);
        setTitle("Flights Register");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpConsult.setBackground(new java.awt.Color(255, 255, 255));
        jpConsult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consult Flights", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Destiny:");

        txtConsultF.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtConsultF.setText("Pesquisar");
        txtConsultF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsultF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultFMouseClicked(evt);
            }
        });
        txtConsultF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultFActionPerformed(evt);
            }
        });

        btSearch.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btSearch.setForeground(new java.awt.Color(0, 0, 0));
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        btClearS.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btClearS.setForeground(new java.awt.Color(0, 0, 0));
        btClearS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        btClearS.setText("CLear Search");

        tbFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pilot", "Copilot", "Landing", "Boarding", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbFlights);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultLayout = new javax.swing.GroupLayout(jpConsult);
        jpConsult.setLayout(jpConsultLayout);
        jpConsultLayout.setHorizontalGroup(
            jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultLayout.createSequentialGroup()
                .addGroup(jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultF, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpConsultLayout.setVerticalGroup(
            jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsultF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntUpdate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntUpdate.setForeground(new java.awt.Color(0, 0, 0));
        bntUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/cloudrefresh_icon-icons.com_54403.png"))); // NOI18N
        bntUpdate.setText("Update");
        bntUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntUpdateMouseClicked(evt);
            }
        });
        bntUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateActionPerformed(evt);
            }
        });

        bntNew.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNew.setForeground(new java.awt.Color(0, 0, 0));
        bntNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/address_new_1271.png"))); // NOI18N
        bntNew.setText("New");
        bntNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntNewMouseClicked(evt);
            }
        });
        bntNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNewActionPerformed(evt);
            }
        });

        bntDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDelete.setForeground(new java.awt.Color(0, 0, 0));
        bntDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/recycling_recyclebin_empty_delete_trash_1771.png"))); // NOI18N
        bntDelete.setText("Delete");
        bntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteActionPerformed(evt);
            }
        });

        bntSave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSave.setForeground(new java.awt.Color(0, 0, 0));
        bntSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        bntSave.setText("Save");
        bntSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntSaveMouseClicked(evt);
            }
        });
        bntSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNew)
                    .addComponent(bntDelete)
                    .addComponent(bntSave)
                    .addComponent(bntUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jpDados.setBackground(new java.awt.Color(255, 255, 255));
        jpDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Passenger", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pilot:");

        txtPilot.setBackground(new java.awt.Color(255, 255, 255));
        txtPilot.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtPilot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPilotActionPerformed(evt);
            }
        });
        txtPilot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPilotKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Copilot:");

        txtCopilot.setBackground(new java.awt.Color(255, 255, 255));
        txtCopilot.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtCopilot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCopilot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCopilotKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Time:");

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Price:");

        txtTime.setBackground(new java.awt.Color(255, 255, 255));
        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimeKeyPressed(evt);
            }
        });

        lblBoardingN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBoardingN.setForeground(new java.awt.Color(0, 0, 0));
        lblBoardingN.setText("Boarding:");

        txtBoardingF.setBackground(new java.awt.Color(255, 255, 255));
        txtBoardingF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBoardingF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBoardingF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBoardingFKeyPressed(evt);
            }
        });

        lblDestinyNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDestinyNatio.setForeground(new java.awt.Color(0, 0, 0));
        lblDestinyNatio.setText("Destiny:");

        txtDestinyF.setBackground(new java.awt.Color(255, 255, 255));
        txtDestinyF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDestinyF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDestinyF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinyFKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seat:");

        txtSeatN.setBackground(new java.awt.Color(255, 255, 255));
        txtSeatN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSeatN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatNKeyPressed(evt);
            }
        });

        imgBoarding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/flight-takeoff_119123.png"))); // NOI18N

        imgDest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/airplane_landing_icon_138980.png"))); // NOI18N

        imgName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/name_user_3716.png"))); // NOI18N

        imgEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/name_user_3716.png"))); // NOI18N

        imgID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/id_icon-icons.com_64188.png"))); // NOI18N

        imgCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/id_card_icon_124180.png"))); // NOI18N

        imgRG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/id_card_icon_124180.png"))); // NOI18N

        imgSeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/desk-chair_96892.png"))); // NOI18N

        javax.swing.GroupLayout jpDadosLayout = new javax.swing.GroupLayout(jpDados);
        jpDados.setLayout(jpDadosLayout);
        jpDadosLayout.setHorizontalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgName)
                    .addComponent(imgEmail)
                    .addComponent(imgID)
                    .addComponent(imgCPF)
                    .addComponent(imgRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtPilot, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(txtCopilot)
                    .addComponent(txtPrice)
                    .addComponent(txtTime, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgDest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBoardingN)
                            .addComponent(txtBoardingF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestinyNatio)
                            .addComponent(txtDestinyF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(imgSeat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSeatN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        jpDadosLayout.setVerticalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPilot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCopilot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrice)))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblBoardingN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgBoarding, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txtBoardingF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestinyNatio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgDest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDestinyF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgSeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSeatN))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultFMouseClicked
        // TODO add your handling code here:

        txtConsultF.setText("");
    }//GEN-LAST:event_txtConsultFMouseClicked

    private void txtConsultFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultFActionPerformed

    private void bntUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bntUpdateMouseClicked

    private void bntUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateActionPerformed
        // TODO add your handling code here:
        var pas = new Flight();

        pas.setPilot(txtPilot.getText());
        pas.setCopilot(txtCopilot.getText());
        pas.setBoarding(txtBoardingF.getText());
        pas.setLanding(txtDestinyF.getText());
        pas.setTime(txtTime.getText());
        pas.setPrice(parseDouble(txtPrice.getText()));

        pas.setId(Integer.parseInt(txtID.getText()));

        FlightDAO dao = new FlightDAO();
        dao.updateFlight(pas);
    }//GEN-LAST:event_bntUpdateActionPerformed

    private void bntNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntNewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bntNewMouseClicked

    private void bntNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNewActionPerformed
        // TODO add your handling code here:
        txtPilot.setText("");
        txtCopilot.setText("");
        txtDestinyF.setText("");
        txtTime.setText("");
        txtPrice.setText("");
        txtID.setText("");
    }//GEN-LAST:event_bntNewActionPerformed

    private void bntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteActionPerformed
        // TODO add your handling code here:
        var fly = new Flight();

        fly.setId(Integer.parseInt(txtID.getText()));

        var dao = new FlightDAO();
        dao.deleteOrEndFLight(fly);
    }//GEN-LAST:event_bntDeleteActionPerformed

    private void bntSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSaveMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bntSaveMouseClicked

    private void bntSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSaveActionPerformed
        // TODO add your handling code here:
        if(txtPilot.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilot field is mandatory!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtCopilot.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Copilot field is mandatory!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtBoardingF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "The boarding field is mandatory!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtDestinyF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "The landing field is mandatory!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtTime.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the time!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtPrice.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the price!", "Alert!", JOptionPane.WARNING_MESSAGE);
        }

        var fly = new Flight();
        fly.setPilot(txtPilot.getText());
        fly.setCopilot(txtCopilot.getText());
        fly.setBoarding(txtBoardingF.getText());
        fly.setLanding(txtDestinyF.getText());
        fly.setTime(txtTime.getText());
        fly.setPrice(parseDouble(txtPrice.getText()));

        FlightDAO dao = new FlightDAO();
        dao.saveFlight(fly);

    }//GEN-LAST:event_bntSaveActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPilotActionPerformed
        // TODO add your handling code her

    }//GEN-LAST:event_txtPilotActionPerformed

    private void txtPilotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPilotKeyPressed
        // TODO add your handling code here:
        //Evento do botão enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCopilot.requestFocus();
        }
    }//GEN-LAST:event_txtPilotKeyPressed

    private void txtCopilotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCopilotKeyPressed
        // TODO add your handling code here:
        //Evento do botão enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtTime.requestFocus();
        }
    }//GEN-LAST:event_txtCopilotKeyPressed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtBoardingF.requestFocus();
        }
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPrice.requestFocus();
        }
    }//GEN-LAST:event_txtTimeKeyPressed

    private void txtBoardingFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoardingFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDestinyF.requestFocus();
        }

    }//GEN-LAST:event_txtBoardingFKeyPressed

    private void txtDestinyFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinyFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtSeatN.requestFocus();
        }
    }//GEN-LAST:event_txtDestinyFKeyPressed

    private void txtSeatNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatNKeyPressed
        // TODO add your handling code here:

        int conf;

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            conf = (JOptionPane.showConfirmDialog(null, "Do you want to save the data?"));
            if(conf <= 0){
                if(txtPilot.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Name", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtCopilot.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Email!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtTime.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the CPF!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtPrice.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the RG!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtBoardingF.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtDestinyF.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                var pas = new Passenger();

                pas.setName(txtPilot.getText());
                pas.setEmail(txtCopilot.getText());
                pas.setCpf(txtTime.getText());
                pas.setRg(txtPrice.getText());
                pas.setBoarding(txtBoardingF.getText());
                pas.setDestiny(txtDestinyF.getText());

                var dao = new PassengerDAO();
                dao.savePassenger(pas);

            }else{
                JOptionPane.showInternalMessageDialog(null, "Mistake!");
            }

        }
    }//GEN-LAST:event_txtSeatNKeyPressed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        
        var dao = new FlightDAO();
        List<Flight> passes = dao.searchFlight(txtConsultF.getText());
        DefaultTableModel dados = (DefaultTableModel) tbFlights.getModel();
        dados.setNumRows(0);
        
        for (var pass : passes) {
            dados.addRow(new Object []{
                pass.getId(),
                pass.getPilot(),
                pass.getCopilot(),
                pass.getLanding(),
                pass.getTime(),
                pass.getBoarding(),
                pass.getPrice()
            });
        }
        
    }//GEN-LAST:event_btSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntDelete;
    public javax.swing.JButton bntNew;
    public javax.swing.JButton bntSave;
    public javax.swing.JButton bntUpdate;
    private javax.swing.JButton btClearS;
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel imgBoarding;
    private javax.swing.JLabel imgCPF;
    private javax.swing.JLabel imgDest;
    private javax.swing.JLabel imgEmail;
    private javax.swing.JLabel imgID;
    private javax.swing.JLabel imgName;
    private javax.swing.JLabel imgRG;
    private javax.swing.JLabel imgSeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpConsult;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpTable;
    private javax.swing.JLabel lblBoardingN;
    private javax.swing.JLabel lblDestinyNatio;
    public javax.swing.JTable tbFlights;
    public javax.swing.JTextField txtBoardingF;
    private javax.swing.JTextField txtConsultF;
    public javax.swing.JTextField txtCopilot;
    public javax.swing.JTextField txtDestinyF;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtPilot;
    public static javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JTextField txtSeatN;
    public static javax.swing.JFormattedTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
