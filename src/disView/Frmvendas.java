/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disView;

import com.sun.glass.events.KeyEvent;
import disModel.Clientes;
import disDAO.ClientesDAO;
import disDAO.ProdutosDAO;
import disModel.Produtos;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adm_walan.costa
 */
public class Frmvendas extends javax.swing.JFrame {

    Clientes obj = new Clientes();
    double total, preco, subtotal, preco_de_compra, preco_de_venda;
    double lucro, desconto;
    int qtd;
    DefaultTableModel carrinho;

    public Frmvendas() {
        initComponents();
        this.getContentPane().setBackground(Color.BLUE);
        jtxdescontoo.setText("0");
        txtcpf.setText("000.000.000-00");
        txtnomeP1.setText("Cliente final");
        txtendereco.setText("final fina");
        txtnumero.setText("00");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnpesquisarC = new javax.swing.JButton();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnomeP1 = new javax.swing.JTextField();
        txtdataual1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTxcodigoP = new javax.swing.JTextField();
        jtxProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxpreco = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        BUscarProduto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtxqtd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxprecocompra = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelacompras = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtxtotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxlucro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxdescontoo = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnpagamento = new javax.swing.JButton();
        btndesconto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda Produtos ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Ponto de Vendas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Do Cliente"));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF:");

        txtendereco.setEditable(false);
        txtendereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ENDEREÇO:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DATA:");

        btnpesquisarC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnpesquisarC.setText("Pesquisar");
        btnpesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarCActionPerformed(evt);
            }
        });

        txtcpf.setEditable(false);
        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });
        txtcpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpfKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("NOME:");

        txtnomeP1.setEditable(false);
        txtnomeP1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnomeP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeP1ActionPerformed(evt);
            }
        });

        txtdataual1.setEditable(false);
        txtdataual1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtdataual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdataual1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("N°:");

        txtnumero.setEditable(false);
        txtnumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnomeP1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdataual1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisarC))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnomeP1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdataual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnpesquisarC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Dos Produtos"));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CODIGO:");

        jTxcodigoP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTxcodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxcodigoPActionPerformed(evt);
            }
        });
        jTxcodigoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxcodigoPKeyPressed(evt);
            }
        });

        jtxProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PRODUTO:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PREÇO");

        jtxpreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        add.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add.setText("Adicionar Item");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        BUscarProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BUscarProduto.setText("Pesquisar");
        BUscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUscarProdutoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("QTD:");

        jtxqtd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PREÇO");
        jLabel14.setEnabled(false);

        jtxprecocompra.setEditable(false);
        jtxprecocompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxcodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(BUscarProduto))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(jtxprecocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(jtxpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addComponent(jtxqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BUscarProduto)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTxcodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jtxpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jtxqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtxprecocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinhos de Compras"));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        Tabelacompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo:", "Produto:", "Quantidade:", "Preço:", "Subtotal:"
            }
        ));
        jScrollPane1.setViewportView(Tabelacompras);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 194, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Da Venda"));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("TOTAL DA VENDA :");

        jtxtotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtxtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtotalActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DESCONTO:");

        jtxlucro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtxlucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxlucroActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("LUCRO:");

        jtxdescontoo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtxdescontoo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtxdescontooAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtxdescontoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxdescontooActionPerformed(evt);
            }
        });
        jtxdescontoo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxdescontooKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(2, 2, 2)
                        .addComponent(jtxlucro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxdescontoo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtxtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxlucro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxdescontoo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btncancelar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btncancelar.setText("CANCELAR VENDA ");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnpagamento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnpagamento.setText("PAGAMENTO");
        btnpagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagamentoActionPerformed(evt);
            }
        });

        btndesconto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btndesconto.setText("DESCONTO ");
        btndesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndescontoActionPerformed(evt);
            }
        });
        btndesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndescontoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnpagamento)
                        .addGap(42, 42, 42)
                        .addComponent(btncancelar)
                        .addGap(41, 41, 41)
                        .addComponent(btndesconto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        qtd = Integer.parseInt(jtxqtd.getText());
        preco = Double.parseDouble(jtxpreco.getText());
        preco_de_compra = Double.parseDouble(jtxpreco.getText());
        preco_de_venda = Double.parseDouble(jtxprecocompra.getText());

        //calcular subTotal e lucro em cada venda //
        subtotal = qtd * preco;

        total += subtotal;
        lucro += (preco_de_compra - preco_de_venda) * qtd;
        jtxtotal.setText(String.valueOf(total));
        jtxlucro.setText(String.valueOf(lucro));

        //Adicionar o produto no carrinho//
        carrinho = (DefaultTableModel) Tabelacompras.getModel();

        carrinho.addRow(new Object[]{
            jTxcodigoP.getText(),
            jtxProduto.getText(),
            jtxqtd.getText(),
            jtxpreco.getText(),
            subtotal
                

        });

        jTxcodigoP.setText(null);
        jtxProduto.setText(null);
        jtxqtd.setText(null);
        jtxpreco.setText(null);
        jtxprecocompra.setText(null);
          


    }//GEN-LAST:event_addActionPerformed

    private void BUscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUscarProdutoActionPerformed
        //Pesquisar Prescionando o Enter//
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        obj = dao.consultarPorCodigo(Integer.parseInt(jTxcodigoP.getText()));

        jtxProduto.setText(obj.getDescricao());
        jtxprecocompra.setText(String.valueOf(obj.getPreco_de_compra()));
        jtxpreco.setText(String.valueOf(obj.getPreco_de_venda()));

    }//GEN-LAST:event_BUscarProdutoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //carrega a data atual do sistema//

        Date agora = new Date();
        SimpleDateFormat dataBr = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = dataBr.format(agora);
        txtdataual1.setText(dataformatada);


    }//GEN-LAST:event_formWindowActivated

    private void jTxcodigoPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxcodigoPKeyPressed
        // Buscar Produto por codigo//
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Produtos obj = new Produtos();
            ProdutosDAO dao = new ProdutosDAO();
            obj = dao.consultarPorCodigo(Integer.parseInt(jTxcodigoP.getText()));

            jtxProduto.setText(obj.getDescricao());
            jtxpreco.setText(String.valueOf(obj.getPreco_de_venda()));
            jtxprecocompra.setText(String.valueOf(obj.getPreco_de_compra()));

        }
    }//GEN-LAST:event_jTxcodigoPKeyPressed

    private void jtxtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtotalActionPerformed

    private void btnpagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagamentoActionPerformed
        frmpagamentos telap = new frmpagamentos();
        telap.txttotal.setText(String.valueOf(total));
        telap.tplucro.setText(String.valueOf(lucro));
        telap.txtdesconto1.setText(String.valueOf(desconto));
        telap.cliente = obj;
        telap.carrinho = carrinho;
        telap.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btnpagamentoActionPerformed

    private void jtxlucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxlucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxlucroActionPerformed

    private void jtxdescontooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxdescontooActionPerformed

    }//GEN-LAST:event_jtxdescontooActionPerformed

    private void jtxdescontooKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxdescontooKeyPressed

    }//GEN-LAST:event_jtxdescontooKeyPressed

    private void jtxdescontooAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtxdescontooAncestorAdded

    }//GEN-LAST:event_jtxdescontooAncestorAdded

    private void btndescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndescontoActionPerformed
        try {
            total = total - desconto;
            lucro = lucro - desconto;
            desconto = Double.parseDouble(jtxdescontoo.getText());
            total = Double.parseDouble(jtxtotal.getText());
            lucro = Double.parseDouble(jtxlucro.getText());
            jtxdescontoo.setText(String.valueOf(desconto));
            jtxtotal.setText(String.valueOf(total));
            jtxlucro.setText(String.valueOf(lucro));

            JOptionPane.showMessageDialog(null, " O DESCONTO FOI :" + desconto);
        } catch (Exception e) {
            desconto = total;
            JOptionPane.showMessageDialog(null, "IMPOSSIVEL SER EFETUADO O DESCONTO:" + e);
        }

    }//GEN-LAST:event_btndescontoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
          
        try {
           
              JOptionPane.showConfirmDialog(null, "DESEJA CANCELAR ESSA VENDA ? ");
              this.dispose();
        } catch (Exception e) {
        }
           
           
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnomeP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeP1ActionPerformed

    private void txtcpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpfKeyPressed
        //busca clientes por cpf//
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ClientesDAO dao = new ClientesDAO();
            obj = dao.consultarClientesPorcpf(txtcpf.getText());

            txtnomeP1.setText(obj.getNome());
            txtendereco.setText(obj.getEndereco());
            txtnumero.setText(String.valueOf(obj.getNumero()));
          
        }

    }//GEN-LAST:event_txtcpfKeyPressed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void btnpesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarCActionPerformed

        Clientes obj = new Clientes();
        ClientesDAO dao = new ClientesDAO();
        obj = dao.consultarClientesPorcpf(txtcpf.getText());

        txtnomeP1.setText(obj.getNome());
        txtendereco.setText(obj.getEndereco());
        txtnumero.setText(String.valueOf(obj.getNumero()));
    }//GEN-LAST:event_btnpesquisarCActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

    private void txtdataual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdataual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdataual1ActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void btndescontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndescontoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndescontoKeyPressed

    private void jTxcodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxcodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxcodigoPActionPerformed
    private void txtcepkeyPressed(java.awt.event.KeyEvent evt) {

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Frmvendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmvendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmvendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmvendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmvendas().setVisible(true);
            }
        });
    }

   
        
                
                
                


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUscarProduto;
    private javax.swing.JTable Tabelacompras;
    private javax.swing.JButton add;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndesconto;
    private javax.swing.JButton btnpagamento;
    private javax.swing.JButton btnpesquisarC;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxcodigoP;
    private javax.swing.JTextField jtxProduto;
    public javax.swing.JTextField jtxdescontoo;
    public javax.swing.JTextField jtxlucro;
    private javax.swing.JTextField jtxpreco;
    public javax.swing.JTextField jtxprecocompra;
    private javax.swing.JTextField jtxqtd;
    private javax.swing.JTextField jtxtotal;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtdataual1;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnomeP1;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
