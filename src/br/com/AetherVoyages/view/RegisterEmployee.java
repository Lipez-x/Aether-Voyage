
package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.EmployeesDAO;
import br.com.AetherVoyages.model.Employees;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RegisterEmployee extends javax.swing.JInternalFrame {
    
    
    
    public RegisterEmployee() {
        initComponents();
        jpBackgroundBnt.setVisible(false);

    }
    
       public void search(){
        var dao = new EmployeesDAO();
        List<Employees> employees = dao.searchEmp(txtNameConsultE.getText());
        DefaultTableModel dados = (DefaultTableModel) tblEmployees.getModel();
        dados.setNumRows(0);
        
        for (Employees emplos : employees) {
            dados.addRow(new Object[]{
                emplos.getId(),
                emplos.getName(),
                emplos.getCpf(),
                emplos.getOffice(),
            });
        }
           
       }
       
             public void listEmp(){
                 var dao = new EmployeesDAO();
                 List<Employees> employees = dao.listEmp();
                 DefaultTableModel dados = (DefaultTableModel) tblEmployees.getModel();
                 dados.setNumRows(0);
        
                    for (Employees emplo : employees) {
                        dados.addRow(new Object[]{
                         emplo.getId(),
                         emplo.getName(),
                         emplo.getCpf(),
                         emplo.getOffice()
             
                    });
                 }
               }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollEmployee = new javax.swing.JScrollPane();
        jpBackgroundEmployee = new javax.swing.JPanel();
        jpConsultEmployees = new javax.swing.JPanel();
        lblWarningEmployees = new javax.swing.JLabel();
        lblSearchName = new javax.swing.JLabel();
        txtNameConsultE = new javax.swing.JTextField();
        btnSearchE = new javax.swing.JButton();
        bntClearSearchE = new javax.swing.JButton();
        jpTableEmployees = new javax.swing.JPanel();
        tableEmployees = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        jpBackgroundBnt = new javax.swing.JPanel();
        bntEditE = new javax.swing.JButton();
        bntDeleteE = new javax.swing.JButton();
        lblSelect = new javax.swing.JLabel();
        jpPersonalData = new javax.swing.JPanel();
        jpPhotograph = new javax.swing.JPanel();
        imgPhotograph = new javax.swing.JLabel();
        lblNameE = new javax.swing.JLabel();
        txtNameData = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        lblYearBirth = new javax.swing.JLabel();
        txtYearBirth = new javax.swing.JFormattedTextField();
        lblOffice = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        jpAddress = new javax.swing.JPanel();
        lblRoad = new javax.swing.JLabel();
        txtRoad = new javax.swing.JTextField();
        lblBurgh = new javax.swing.JLabel();
        txtBurgh = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JFormattedTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jpContacts = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCell = new javax.swing.JLabel();
        txtCell = new javax.swing.JFormattedTextField();
        jpButtons = new javax.swing.JPanel();
        bntNew = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSaveE = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Aether Voyages - Register Employees");

        jScrollEmployee.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpConsultEmployees.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consult", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblWarningEmployees.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblWarningEmployees.setForeground(new java.awt.Color(0, 0, 0));
        lblWarningEmployees.setText("*Before making a new registration, check that the person is not already registered!");

        lblSearchName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSearchName.setForeground(new java.awt.Color(0, 0, 0));
        lblSearchName.setText("Search by name:");

        txtNameConsultE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNameConsultE.setText("Pesquisar");
        txtNameConsultE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameConsultEMouseClicked(evt);
            }
        });
        txtNameConsultE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameConsultEActionPerformed(evt);
            }
        });
        txtNameConsultE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameConsultEKeyPressed(evt);
            }
        });

        btnSearchE.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSearchE.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        btnSearchE.setText("Search");
        btnSearchE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEActionPerformed(evt);
            }
        });

        bntClearSearchE.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntClearSearchE.setForeground(new java.awt.Color(0, 0, 0));
        bntClearSearchE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        bntClearSearchE.setText("Clear Search");
        bntClearSearchE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClearSearchEActionPerformed(evt);
            }
        });

        jpTableEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CPF", "Office"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        tableEmployees.setViewportView(tblEmployees);

        javax.swing.GroupLayout jpTableEmployeesLayout = new javax.swing.GroupLayout(jpTableEmployees);
        jpTableEmployees.setLayout(jpTableEmployeesLayout);
        jpTableEmployeesLayout.setHorizontalGroup(
            jpTableEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jpTableEmployeesLayout.setVerticalGroup(
            jpTableEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        jpBackgroundBnt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bntEditE.setText("Edit");

        bntDeleteE.setText("Delete");

        lblSelect.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSelect.setForeground(new java.awt.Color(0, 0, 0));
        lblSelect.setText("*To edit or delete a record, simply select from the table and click on the desired button");

        javax.swing.GroupLayout jpBackgroundBntLayout = new javax.swing.GroupLayout(jpBackgroundBnt);
        jpBackgroundBnt.setLayout(jpBackgroundBntLayout);
        jpBackgroundBntLayout.setHorizontalGroup(
            jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundBntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntDeleteE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEditE)
                .addGap(16, 16, 16))
        );
        jpBackgroundBntLayout.setVerticalGroup(
            jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundBntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntEditE)
                    .addComponent(bntDeleteE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(lblSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultEmployeesLayout = new javax.swing.GroupLayout(jpConsultEmployees);
        jpConsultEmployees.setLayout(jpConsultEmployeesLayout);
        jpConsultEmployeesLayout.setHorizontalGroup(
            jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpBackgroundBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSearchName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                                .addComponent(lblWarningEmployees)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                                .addComponent(txtNameConsultE, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntClearSearchE, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultEmployeesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpTableEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jpConsultEmployeesLayout.setVerticalGroup(
            jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                .addComponent(lblWarningEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchE)
                    .addComponent(bntClearSearchE)
                    .addComponent(txtNameConsultE, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lblSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTableEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBackgroundBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpPersonalData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jpPhotograph.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Photograph", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        imgPhotograph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/folderyellowphoto_93332.png"))); // NOI18N
        imgPhotograph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPhotographMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpPhotographLayout = new javax.swing.GroupLayout(jpPhotograph);
        jpPhotograph.setLayout(jpPhotographLayout);
        jpPhotographLayout.setHorizontalGroup(
            jpPhotographLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPhotographLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPhotograph)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPhotographLayout.setVerticalGroup(
            jpPhotographLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPhotographLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPhotograph, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        lblNameE.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNameE.setForeground(new java.awt.Color(0, 0, 0));
        lblNameE.setText("Name:");

        txtNameData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameDataMouseClicked(evt);
            }
        });
        txtNameData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameDataKeyPressed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF:");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 0, 0));
        lblLastName.setText("Last Name:");

        txtLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLastNameMouseClicked(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
        });

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

        lblRG.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 0, 0));
        lblRG.setText("RG:");

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

        lblYearBirth.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblYearBirth.setForeground(new java.awt.Color(0, 0, 0));
        lblYearBirth.setText("Year or Birth:");

        try {
            txtYearBirth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtYearBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearBirthKeyPressed(evt);
            }
        });

        lblOffice.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblOffice.setForeground(new java.awt.Color(0, 0, 0));
        lblOffice.setText("Office:");

        javax.swing.GroupLayout jpPersonalDataLayout = new javax.swing.GroupLayout(jpPersonalData);
        jpPersonalData.setLayout(jpPersonalDataLayout);
        jpPersonalDataLayout.setHorizontalGroup(
            jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPhotograph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPersonalDataLayout.createSequentialGroup()
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(lblNameE)
                                .addGap(177, 177, 177)
                                .addComponent(lblLastName))
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(txtNameData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYearBirth)
                            .addComponent(txtYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpPersonalDataLayout.createSequentialGroup()
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addGap(125, 125, 125)
                                .addComponent(lblRG)))
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblOffice))
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPersonalDataLayout.setVerticalGroup(
            jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPhotograph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameE)
                    .addComponent(lblLastName)
                    .addComponent(lblYearBirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblRG)
                    .addComponent(lblOffice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblRoad.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRoad.setForeground(new java.awt.Color(0, 0, 0));
        lblRoad.setText("Road:");

        txtRoad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRoadKeyPressed(evt);
            }
        });

        lblBurgh.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBurgh.setForeground(new java.awt.Color(0, 0, 0));
        lblBurgh.setText("Neighborhood:");

        txtBurgh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBurghKeyPressed(evt);
            }
        });

        lblNumber.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblNumber.setText("Number:");

        try {
            txtNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumberKeyPressed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 0));
        lblCity.setText("City:");

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        lblCep.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCep.setForeground(new java.awt.Color(0, 0, 0));
        lblCep.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password:");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpAddressLayout = new javax.swing.GroupLayout(jpAddress);
        jpAddress.setLayout(jpAddressLayout);
        jpAddressLayout.setHorizontalGroup(
            jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBurgh)
                    .addComponent(txtBurgh)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpAddressLayout.createSequentialGroup()
                        .addComponent(lblCity)
                        .addGap(175, 175, 175)
                        .addComponent(lblPassword))
                    .addGroup(jpAddressLayout.createSequentialGroup()
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword))
                    .addGroup(jpAddressLayout.createSequentialGroup()
                        .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoad, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumber)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAddressLayout.setVerticalGroup(
            jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddressLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoad)
                    .addComponent(lblNumber)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBurgh)
                    .addComponent(lblCity)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBurgh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpContacts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lblCell.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCell.setForeground(new java.awt.Color(0, 0, 0));
        lblCell.setText("Cell:");

        try {
            txtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jpContactsLayout = new javax.swing.GroupLayout(jpContacts);
        jpContacts.setLayout(jpContactsLayout);
        jpContactsLayout.setHorizontalGroup(
            jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContactsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCell)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        jpContactsLayout.setVerticalGroup(
            jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContactsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblCell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jpButtons.setBackground(new java.awt.Color(0, 102, 102));
        jpButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntNew.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNew.setForeground(new java.awt.Color(0, 0, 0));
        bntNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N
        bntNew.setText("New");

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton2.setText("Delete");

        btnSaveE.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSaveE.setForeground(new java.awt.Color(0, 0, 0));
        btnSaveE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        btnSaveE.setText("Save");
        btnSaveE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButtonsLayout = new javax.swing.GroupLayout(jpButtons);
        jpButtons.setLayout(jpButtonsLayout);
        jpButtonsLayout.setHorizontalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonsLayout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(bntNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jpButtonsLayout.setVerticalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNew)
                    .addComponent(jButton2)
                    .addComponent(btnSaveE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpBackgroundEmployeeLayout = new javax.swing.GroupLayout(jpBackgroundEmployee);
        jpBackgroundEmployee.setLayout(jpBackgroundEmployeeLayout);
        jpBackgroundEmployeeLayout.setHorizontalGroup(
            jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpConsultEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPersonalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpContacts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(725, Short.MAX_VALUE))
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpBackgroundEmployeeLayout.setVerticalGroup(
            jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConsultEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPersonalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollEmployee.setViewportView(jpBackgroundEmployee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEActionPerformed
        // TODO add your handling code here:  
        jpBackgroundBnt.setVisible(true);
        btnSearchE.setVisible(true);
        var dao = new EmployeesDAO();
        List<Employees> employees = dao.searchEmp(txtNameConsultE.getText());
                 DefaultTableModel dados = (DefaultTableModel) tblEmployees.getModel();
                 dados.setNumRows(0);
        
                    for (Employees emplo : employees) {
                        dados.addRow(new Object[]{
                         emplo.getId(),
                         emplo.getName(),
                         emplo.getCpf(),
                         emplo.getOffice()
             
                    });
                 }
    }//GEN-LAST:event_btnSearchEActionPerformed

    private void bntClearSearchEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClearSearchEActionPerformed
        // TODO add your handling code here:
        
        jpBackgroundBnt.setVisible(false);
        btnSearchE.setVisible(true);
        txtNameConsultE.setText("Pesquisar");
        
    }//GEN-LAST:event_bntClearSearchEActionPerformed

    private void btnSaveEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEActionPerformed
        // TODO add your handling code here:
        
        var emplo = new Employees();
        
        emplo.setName(txtNameData.getText());
        emplo.setLastName(txtLastName.getText());
        emplo.setCpf(txtCPF.getText());
        emplo.setRg(txtRG.getText());
        emplo.setOffice(txtOffice.getText());
        emplo.setBirthDay(txtYearBirth.getText());
        emplo.setPassword(txtPassword.getText());
        
        EmployeesDAO dao = new EmployeesDAO();
        dao.saveEmp(emplo);
        
    }//GEN-LAST:event_btnSaveEActionPerformed

    private void txtNameConsultEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameConsultEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameConsultEActionPerformed

    private void txtNameConsultEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameConsultEMouseClicked
        // TODO add your handling code here:
        txtNameConsultE.setText("");
        
    }//GEN-LAST:event_txtNameConsultEMouseClicked

    private void txtNameDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameDataMouseClicked
        // TODO add your handling code here:
        txtNameData.setText("");
    }//GEN-LAST:event_txtNameDataMouseClicked

    private void txtLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseClicked
        // TODO add your handling code here:
        txtLastName.setText("");
    }//GEN-LAST:event_txtLastNameMouseClicked

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        
        txtNameData.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),1).toString());
        txtLastName.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),2).toString());
        txtYearBirth.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),3).toString());
        txtCPF.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),4).toString());
        txtRG.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),5).toString());
        txtOffice.setText(tblEmployees.getValueAt(tblEmployees.getSelectedRow(),6).toString());
        
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtNameDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameDataKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtLastName.requestFocus();
        }
    }//GEN-LAST:event_txtNameDataKeyPressed

    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtYearBirth.requestFocus();
        }
    }//GEN-LAST:event_txtLastNameKeyPressed

    private void txtYearBirthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearBirthKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtYearBirthKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRG.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtRGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRGKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtOffice.requestFocus();
        }
    }//GEN-LAST:event_txtRGKeyPressed

    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRoad.requestFocus();
        }
    }//GEN-LAST:event_txtCepKeyPressed

    private void txtRoadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoadKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtNumber.requestFocus();
        }
    }//GEN-LAST:event_txtRoadKeyPressed

    private void txtNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtBurgh.requestFocus();
        }
    }//GEN-LAST:event_txtNumberKeyPressed

    private void txtBurghKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurghKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCity.requestFocus();
        }
    }//GEN-LAST:event_txtBurghKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtCell.requestFocus();
        }
        
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtCellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                var emplo = new Employees();
        
                emplo.setName(txtNameData.getText());
                emplo.setLastName(txtLastName.getText());
                emplo.setCpf(txtCPF.getText());
                emplo.setRg(txtRG.getText());
                emplo.setOffice(txtOffice.getText());
                emplo.setBirthDay(txtYearBirth.getText());
                emplo.setPassword(txtPassword.getText());
        
                EmployeesDAO dao = new EmployeesDAO();
                dao.saveEmp(emplo);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_txtCellKeyPressed

    private void imgPhotographMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPhotographMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imgPhotographMouseClicked

    private void txtNameConsultEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameConsultEKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            var dao = new EmployeesDAO();
                List<Employees> employees = dao.searchEmp(txtNameConsultE.getText());
                 DefaultTableModel dados = (DefaultTableModel) tblEmployees.getModel();
                 dados.setNumRows(0);
        
                    for (Employees emplo : employees) {
                        dados.addRow(new Object[]{
                         emplo.getId(),
                         emplo.getName(),
                         emplo.getCpf(),
                         emplo.getOffice()
             
                    });
                 }
        }
    }//GEN-LAST:event_txtNameConsultEKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntClearSearchE;
    public javax.swing.JButton bntDeleteE;
    public javax.swing.JButton bntEditE;
    public javax.swing.JButton bntNew;
    public javax.swing.JButton btnSaveE;
    public javax.swing.JButton btnSearchE;
    private javax.swing.JLabel imgPhotograph;
    public javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollEmployee;
    public javax.swing.JPanel jpAddress;
    private javax.swing.JPanel jpBackgroundBnt;
    private javax.swing.JPanel jpBackgroundEmployee;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpConsultEmployees;
    public javax.swing.JPanel jpContacts;
    private javax.swing.JPanel jpPersonalData;
    private javax.swing.JPanel jpPhotograph;
    private javax.swing.JPanel jpTableEmployees;
    private javax.swing.JLabel lblBurgh;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCell;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNameE;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblOffice;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblSearchName;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JLabel lblWarningEmployees;
    private javax.swing.JLabel lblYearBirth;
    private javax.swing.JScrollPane tableEmployees;
    public javax.swing.JTable tblEmployees;
    public javax.swing.JTextField txtBurgh;
    public javax.swing.JFormattedTextField txtCPF;
    public javax.swing.JFormattedTextField txtCell;
    private javax.swing.JFormattedTextField txtCep;
    public javax.swing.JTextField txtCity;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtNameConsultE;
    public javax.swing.JTextField txtNameData;
    public javax.swing.JFormattedTextField txtNumber;
    public javax.swing.JTextField txtOffice;
    private javax.swing.JTextField txtPassword;
    public javax.swing.JFormattedTextField txtRG;
    public javax.swing.JTextField txtRoad;
    public javax.swing.JFormattedTextField txtYearBirth;
    // End of variables declaration//GEN-END:variables

    private File File(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
