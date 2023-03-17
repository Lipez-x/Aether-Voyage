
package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.PassengerDAO;
import br.com.AetherVoyages.model.Passenger;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadNational extends javax.swing.JInternalFrame {

    public CadNational() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBoardingNatio = new javax.swing.JLabel();
        jscNatio = new javax.swing.JScrollPane();
        jpSCR = new javax.swing.JPanel();
        jpConsult = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultN = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btClearS = new javax.swing.JButton();
        jpTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNational = new javax.swing.JTable();
        jpDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblBoardingN = new javax.swing.JLabel();
        txtBoardingN = new javax.swing.JTextField();
        lblDestinyNatio = new javax.swing.JLabel();
        txtDestinyNatio = new javax.swing.JTextField();
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
        jpBnt = new javax.swing.JPanel();
        bntUpdateNatio = new javax.swing.JButton();
        bntNewNatio = new javax.swing.JButton();
        bntDeleteNatio = new javax.swing.JButton();
        bntSaveNatio = new javax.swing.JButton();

        lblBoardingNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBoardingNatio.setForeground(new java.awt.Color(0, 0, 0));
        lblBoardingNatio.setText("Boarding:");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setResizable(true);
        setTitle("National Flights");

        jscNatio.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpConsult.setBackground(new java.awt.Color(255, 255, 255));
        jpConsult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consult Passenger", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");

        txtConsultN.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtConsultN.setText("Pesquisar");
        txtConsultN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsultN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultNMouseClicked(evt);
            }
        });
        txtConsultN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultNActionPerformed(evt);
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

        tbNational.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CPF", "RG", "Boarding", "Destiny"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbNational);
        if (tbNational.getColumnModel().getColumnCount() > 0) {
            tbNational.getColumnModel().getColumn(0).setResizable(false);
            tbNational.getColumnModel().getColumn(1).setResizable(false);
            tbNational.getColumnModel().getColumn(2).setResizable(false);
            tbNational.getColumnModel().getColumn(3).setResizable(false);
            tbNational.getColumnModel().getColumn(4).setResizable(false);
            tbNational.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultLayout = new javax.swing.GroupLayout(jpConsult);
        jpConsult.setLayout(jpConsultLayout);
        jpConsultLayout.setHorizontalGroup(
            jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultLayout.createSequentialGroup()
                .addGroup(jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultN, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpConsultLayout.setVerticalGroup(
            jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsultN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        jLabel3.setText("Name:");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CPF:");

        txtRG.setBackground(new java.awt.Color(255, 255, 255));
        txtRG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRGKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RG:");

        txtCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });

        lblBoardingN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBoardingN.setForeground(new java.awt.Color(0, 0, 0));
        lblBoardingN.setText("Boarding:");

        txtBoardingN.setBackground(new java.awt.Color(255, 255, 255));
        txtBoardingN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBoardingN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBoardingN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBoardingNKeyPressed(evt);
            }
        });

        lblDestinyNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDestinyNatio.setForeground(new java.awt.Color(0, 0, 0));
        lblDestinyNatio.setText("Destiny:");

        txtDestinyNatio.setBackground(new java.awt.Color(255, 255, 255));
        txtDestinyNatio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDestinyNatio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDestinyNatio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinyNatioKeyPressed(evt);
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

        imgEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/socialemailcircularbutton_80177.png"))); // NOI18N

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
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addComponent(txtEmail)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 276, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgDest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgSeat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDestinyNatio, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeatN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(imgBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBoardingN)
                            .addComponent(txtBoardingN, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestinyNatio))))
                .addGap(61, 61, 61))
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
                            .addComponent(txtName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRG)))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblBoardingN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgBoarding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBoardingN, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestinyNatio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgDest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDestinyNatio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgSeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSeatN))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpBnt.setBackground(new java.awt.Color(0, 102, 102));
        jpBnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntUpdateNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntUpdateNatio.setForeground(new java.awt.Color(0, 0, 0));
        bntUpdateNatio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        bntUpdateNatio.setText("Update");
        bntUpdateNatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateNatioActionPerformed(evt);
            }
        });

        bntNewNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNewNatio.setForeground(new java.awt.Color(0, 0, 0));
        bntNewNatio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N
        bntNewNatio.setText("New");
        bntNewNatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNewNatioActionPerformed(evt);
            }
        });

        bntDeleteNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDeleteNatio.setForeground(new java.awt.Color(0, 0, 0));
        bntDeleteNatio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        bntDeleteNatio.setText("Delete");
        bntDeleteNatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteNatioActionPerformed(evt);
            }
        });

        bntSaveNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSaveNatio.setForeground(new java.awt.Color(0, 0, 0));
        bntSaveNatio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        bntSaveNatio.setText("Save");
        bntSaveNatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSaveNatioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBntLayout = new javax.swing.GroupLayout(jpBnt);
        jpBnt.setLayout(jpBntLayout);
        jpBntLayout.setHorizontalGroup(
            jpBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBntLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntUpdateNatio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNewNatio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDeleteNatio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSaveNatio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBntLayout.setVerticalGroup(
            jpBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBntLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntUpdateNatio)
                    .addComponent(bntNewNatio)
                    .addComponent(bntDeleteNatio)
                    .addComponent(bntSaveNatio))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpSCRLayout = new javax.swing.GroupLayout(jpSCR);
        jpSCR.setLayout(jpSCRLayout);
        jpSCRLayout.setHorizontalGroup(
            jpSCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSCRLayout.createSequentialGroup()
                .addGroup(jpSCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpSCRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpSCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpSCRLayout.setVerticalGroup(
            jpSCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSCRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jscNatio.setViewportView(jpSCR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscNatio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscNatio, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        setBounds(0, 0, 845, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultNActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtBoardingNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoardingNKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDestinyNatio.requestFocus();
        }
        
    }//GEN-LAST:event_txtBoardingNKeyPressed

    private void bntUpdateNatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateNatioActionPerformed
        // TODO add your handling code here:
        
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Name", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Email!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the CPF!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtRG.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the RG!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtBoardingN.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtDestinyNatio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        var pas = new Passenger();

        pas.setName(txtName.getText());
        pas.setEmail(txtEmail.getText());
        pas.setCpf(txtCPF.getText());
        pas.setRg(txtRG.getText());
        pas.setBoarding(txtBoardingN.getText());
        pas.setDestiny(txtDestinyNatio.getText());

        pas.setCode(Integer.parseInt(txtID.getText()));

        PassengerDAO dao = new PassengerDAO();
        dao.passengerUpdate(pas);
       
    }//GEN-LAST:event_bntUpdateNatioActionPerformed

    private void bntNewNatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNewNatioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bntNewNatioActionPerformed

    private void bntDeleteNatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteNatioActionPerformed
        // TODO add your handling code here:
        //Botão de excluir
        var pas = new Passenger();

        pas.setCode(Integer.parseInt(txtID.getText()));

        PassengerDAO dao = new PassengerDAO();
        dao.deletePassenger(pas);
        
    }//GEN-LAST:event_bntDeleteNatioActionPerformed

    private void bntSaveNatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSaveNatioActionPerformed
        // TODO add your handling code here:

        //Estrutura de campo obrigatório
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Name", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Email!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the CPF!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtRG.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the RG!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtBoardingN.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtDestinyNatio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         var pas = new Passenger();

        pas.setName(txtName.getText());
        pas.setEmail(txtEmail.getText());
        pas.setCpf(txtCPF.getText());
        pas.setRg(txtRG.getText());
        pas.setBoarding(txtBoardingN.getText());
        pas.setDestiny(txtDestinyNatio.getText());

        PassengerDAO dao = new PassengerDAO();
        dao.savePassenger(pas);
        
    }//GEN-LAST:event_bntSaveNatioActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code her
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        //Evento do botão enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        //Evento do botão enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRG.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtBoardingN.requestFocus();
        }
    }//GEN-LAST:event_txtRGKeyPressed

    private void txtDestinyNatioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinyNatioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtSeatN.requestFocus();
        }
    }//GEN-LAST:event_txtDestinyNatioKeyPressed

    private void txtSeatNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatNKeyPressed
        // TODO add your handling code here:
        
        int conf;
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          
          conf = (JOptionPane.showConfirmDialog(null, "Do you want to save the data?"));
          if(conf <= 0){
            if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Name", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
            }
            if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Email!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
            }
             if(txtCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the CPF!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
             }
            if(txtRG.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the RG!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
             }
             if(txtBoardingN.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
            }
            if(txtDestinyNatio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
            }
        
             var pas = new Passenger();

              pas.setName(txtName.getText());
              pas.setEmail(txtEmail.getText());
              pas.setCpf(txtCPF.getText());
              pas.setRg(txtRG.getText());
              pas.setBoarding(txtBoardingN.getText());
              pas.setDestiny(txtDestinyNatio.getText());

              PassengerDAO dao = new PassengerDAO();
              dao.savePassenger(pas);
            
          }else{
              JOptionPane.showInternalMessageDialog(null, "Mistake!");
          }
            
        }
    }//GEN-LAST:event_txtSeatNKeyPressed

    private void txtConsultNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultNMouseClicked
        // TODO add your handling code here:
        
        txtConsultN.setText("");
    }//GEN-LAST:event_txtConsultNMouseClicked

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
      
       var dao = new PassengerDAO();
        List<Passenger> passes = dao.searchPassenger(txtConsultN.getText());
        DefaultTableModel dados = (DefaultTableModel) tbNational.getModel();
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
        
    }//GEN-LAST:event_btSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntDeleteNatio;
    public javax.swing.JButton bntNewNatio;
    public javax.swing.JButton bntSaveNatio;
    public javax.swing.JButton bntUpdateNatio;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBnt;
    private javax.swing.JPanel jpConsult;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpSCR;
    private javax.swing.JPanel jpTable;
    public javax.swing.JScrollPane jscNatio;
    private javax.swing.JLabel lblBoardingN;
    private javax.swing.JLabel lblBoardingNatio;
    private javax.swing.JLabel lblDestinyNatio;
    public javax.swing.JTable tbNational;
    public javax.swing.JTextField txtBoardingN;
    public static javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtConsultN;
    public javax.swing.JTextField txtDestinyNatio;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    public static javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtSeatN;
    // End of variables declaration//GEN-END:variables
}
