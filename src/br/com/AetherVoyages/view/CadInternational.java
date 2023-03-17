
package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.InterPassengerDAO;
import br.com.AetherVoyages.model.InterPassenger;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadInternational extends javax.swing.JInternalFrame {

   
    public CadInternational() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jscInternational = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jpConsult = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtConsultI = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btClearS = new javax.swing.JButton();
        jpTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInternational = new javax.swing.JTable();
        jpButtons = new javax.swing.JPanel();
        bntUpdateInter = new javax.swing.JButton();
        bntNewInter = new javax.swing.JButton();
        bntDeleteInter = new javax.swing.JButton();
        bntSaveInter = new javax.swing.JButton();
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
        txtBoarding = new javax.swing.JTextField();
        lblDestinyNatio = new javax.swing.JLabel();
        txtDestiny = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeat = new javax.swing.JTextField();
        imgBoarding = new javax.swing.JLabel();
        imgDest = new javax.swing.JLabel();
        imgName = new javax.swing.JLabel();
        imgEmail = new javax.swing.JLabel();
        imgID = new javax.swing.JLabel();
        imgCPF = new javax.swing.JLabel();
        imgRG = new javax.swing.JLabel();
        imgSeat = new javax.swing.JLabel();
        jCBPassportCheck = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setResizable(true);
        setTitle("International Flight");

        jscInternational.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpConsult.setBackground(new java.awt.Color(255, 255, 255));
        jpConsult.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consult Passenger", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");

        txtConsultI.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtConsultI.setText("Pesquisar");
        txtConsultI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsultI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultIMouseClicked(evt);
            }
        });
        txtConsultI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultIActionPerformed(evt);
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
        btClearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearSActionPerformed(evt);
            }
        });

        tbInternational.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbInternational);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtConsultI, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jpConsultLayout.setVerticalGroup(
            jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtConsultI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpButtons.setBackground(new java.awt.Color(0, 102, 102));
        jpButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntUpdateInter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntUpdateInter.setForeground(new java.awt.Color(0, 0, 0));
        bntUpdateInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        bntUpdateInter.setText("Update");
        bntUpdateInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateInterActionPerformed(evt);
            }
        });

        bntNewInter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNewInter.setForeground(new java.awt.Color(0, 0, 0));
        bntNewInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N
        bntNewInter.setText("New");

        bntDeleteInter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDeleteInter.setForeground(new java.awt.Color(0, 0, 0));
        bntDeleteInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        bntDeleteInter.setText("Delete");
        bntDeleteInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteInterActionPerformed(evt);
            }
        });

        bntSaveInter.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSaveInter.setForeground(new java.awt.Color(0, 0, 0));
        bntSaveInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        bntSaveInter.setText("Save");
        bntSaveInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSaveInterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButtonsLayout = new javax.swing.GroupLayout(jpButtons);
        jpButtons.setLayout(jpButtonsLayout);
        jpButtonsLayout.setHorizontalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntUpdateInter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDeleteInter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntNewInter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSaveInter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpButtonsLayout.setVerticalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntUpdateInter)
                    .addComponent(bntNewInter)
                    .addComponent(bntDeleteInter)
                    .addComponent(bntSaveInter))
                .addContainerGap(22, Short.MAX_VALUE))
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

        txtBoarding.setBackground(new java.awt.Color(255, 255, 255));
        txtBoarding.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBoarding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBoarding.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBoardingKeyPressed(evt);
            }
        });

        lblDestinyNatio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDestinyNatio.setForeground(new java.awt.Color(0, 0, 0));
        lblDestinyNatio.setText("Destiny:");

        txtDestiny.setBackground(new java.awt.Color(255, 255, 255));
        txtDestiny.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDestiny.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDestiny.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDestinyKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seat:");

        txtSeat.setBackground(new java.awt.Color(255, 255, 255));
        txtSeat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeatKeyPressed(evt);
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

        jCBPassportCheck.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jCBPassportCheck.setForeground(new java.awt.Color(0, 0, 0));
        jCBPassportCheck.setText("Passport Checked");

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
                        .addGap(0, 251, Short.MAX_VALUE)))
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
                            .addComponent(txtDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBPassportCheck)))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(imgBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBoardingN)
                            .addComponent(txtBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(imgBoarding, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(txtBoarding))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDestinyNatio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgDest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDestiny))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgSeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSeat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBPassportCheck)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jpDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jscInternational.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscInternational)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscInternational, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsultIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultIMouseClicked
        // TODO add your handling code here:

        txtConsultI.setText("");
    }//GEN-LAST:event_txtConsultIMouseClicked

    private void txtConsultIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultIActionPerformed

    private void bntUpdateInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateInterActionPerformed
        // TODO add your handling code here:
        var inPas = new InterPassenger();

        if (jCBPassportCheck.isSelected()){
            inPas.setPassport("Sim");
        } else {
            inPas.setPassport("Não");
        }
        inPas.setName(txtName.getText());
        inPas.setEmail(txtEmail.getText());
        inPas.setCpf(txtCPF.getText());
        inPas.setRg(txtRG.getText());
        inPas.setBoarding(txtBoarding.getText());
        inPas.setDestiny(txtDestiny.getText());

        inPas.setCode(Integer.parseInt(txtID.getText()));

        InterPassengerDAO dao = new InterPassengerDAO();
        dao.passengerUpdate(inPas);
    }//GEN-LAST:event_bntUpdateInterActionPerformed

    private void bntDeleteInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteInterActionPerformed
        // TODO add your handling code here:
        var intPas = new InterPassenger();

        intPas.setCode(Integer.parseInt(txtID.getText()));

        InterPassengerDAO dao = new InterPassengerDAO();
        dao.deleteInterPassenger(intPas);
    }//GEN-LAST:event_bntDeleteInterActionPerformed

    private void bntSaveInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSaveInterActionPerformed
        // TODO add your handling code here:

        //Estrutura de campo obrigatório
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Name!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Email!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the CPF!", "Alert!", JOptionPane.WARNING_MESSAGE);
        }
        if(txtRG.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the RG!", "Alert!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtBoarding.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
        }
        if(txtDestiny.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
        }

        var inPas = new InterPassenger();

        if (jCBPassportCheck.isSelected()){
            inPas.setPassport("Sim");
        } else {
            inPas.setPassport("Não");
        }
        inPas.setName(txtName.getText());
        inPas.setEmail(txtEmail.getText());
        inPas.setCpf(txtCPF.getText());
        inPas.setRg(txtRG.getText());
        inPas.setBoarding(txtBoarding.getText());
        inPas.setDestiny(txtDestiny.getText());

        InterPassengerDAO dao = new InterPassengerDAO();
        dao.savePassenger(inPas);
    }//GEN-LAST:event_bntSaveInterActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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

    private void txtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtBoarding.requestFocus();
        }
    }//GEN-LAST:event_txtRGKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRG.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtBoardingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoardingKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtDestiny.requestFocus();
        }

    }//GEN-LAST:event_txtBoardingKeyPressed

    private void txtDestinyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinyKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtSeat.requestFocus();
        }
    }//GEN-LAST:event_txtDestinyKeyPressed

    private void txtSeatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatKeyPressed
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
                if(txtBoarding.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Boarding!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(txtDestiny.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Inform the Destiny!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                var pas = new InterPassenger();

                pas.setName(txtName.getText());
                pas.setEmail(txtEmail.getText());
                pas.setCpf(txtCPF.getText());
                pas.setRg(txtRG.getText());
                pas.setBoarding(txtBoarding.getText());
                pas.setDestiny(txtDestiny.getText());

                var dao = new InterPassengerDAO();
                dao.savePassenger(pas);

            }else{
                JOptionPane.showInternalMessageDialog(null, "Mistake!");
            }

        }
    }//GEN-LAST:event_txtSeatKeyPressed

    private void btClearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearSActionPerformed
        // TODO add your handling code here:
        txtConsultI.setText("");
    }//GEN-LAST:event_btClearSActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        
       var dao = new InterPassengerDAO();
        List<InterPassenger> passes = dao.searchPassenger(txtConsultI.getText());
        DefaultTableModel dados = (DefaultTableModel) tbInternational.getModel();
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
    public javax.swing.JButton bntDeleteInter;
    public javax.swing.JButton bntNewInter;
    public javax.swing.JButton bntSaveInter;
    public javax.swing.JButton bntUpdateInter;
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
    public javax.swing.JCheckBox jCBPassportCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpConsult;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpTable;
    private javax.swing.JScrollPane jscInternational;
    private javax.swing.JLabel lblBoardingN;
    private javax.swing.JLabel lblDestinyNatio;
    public javax.swing.JTable tbInternational;
    public javax.swing.JTextField txtBoarding;
    public static javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtConsultI;
    public javax.swing.JTextField txtDestiny;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    public static javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtSeat;
    // End of variables declaration//GEN-END:variables
}
