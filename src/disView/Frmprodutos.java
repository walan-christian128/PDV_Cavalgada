/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disView;

import disDAO.FornecedoresDAO;
import disDAO.ProdutosDAO;
import disModel.Fornecedores;
import disModel.Produtos;
import disModel.Utilitarios;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adm_walan.costa
 */
public class Frmprodutos extends javax.swing.JFrame {
    
    //Metodo Listar na Tabela//

    public void listar() {
        
        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_de_compra(),
                c.getPreco_de_venda(),
                c.getQtd_estoque(),
                c.getFornecedor().getNome()

            });
        }
    }

    public Frmprodutos() {
        JOptionPane.showMessageDialog(null,"ATENÇÃO!!, ANTES DE CADASTRAR UM PRODUTO CERTIFIQUE-SE SE ELE JÁ NAO EXISTE CADASTRADO NO SEU ESTOQUE");
        initComponents();
        this.getContentPane().setBackground(Color.BLUE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jdados = new javax.swing.JTabbedPane();
        jPdados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxCodigo = new javax.swing.JTextField();
        jTxDecricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxprecocompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBNovo = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir1 = new javax.swing.JButton();
        pesquisar2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jcbfornecedor = new javax.swing.JComboBox();
        txtQTDEstoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxprecovenda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jtxPesquisa = new javax.swing.JTextField();
        jBpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jBNovo1 = new javax.swing.JButton();
        jBsalvar1 = new javax.swing.JButton();
        jBEditar1 = new javax.swing.JButton();
        jBExcluir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro De Produtos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Jdados.setBackground(new java.awt.Color(51, 51, 51));
        Jdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JdadosMouseClicked(evt);
            }
        });

        jPdados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código:");

        jtxCodigo.setEditable(false);
        jtxCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCodigoActionPerformed(evt);
            }
        });

        jTxDecricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descrição");

        jtxprecocompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxprecocompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxprecocompraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Preço de compra :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("QTD.Estoque:");

        jBNovo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBsalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBExcluir1.setText("Excluir");
        jBExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluir1ActionPerformed(evt);
            }
        });

        pesquisar2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisar2.setText("Pesquisar");
        pesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fornecedores:");

        jcbfornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jcbfornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jcbfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbfornecedorMouseClicked(evt);
            }
        });
        jcbfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfornecedorActionPerformed(evt);
            }
        });

        txtQTDEstoque.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtQTDEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTDEstoqueActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Preço de venda :");

        jtxprecovenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxprecovenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxprecovendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPdadosLayout = new javax.swing.GroupLayout(jPdados);
        jPdados.setLayout(jPdadosLayout);
        jPdadosLayout.setHorizontalGroup(
            jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 590, Short.MAX_VALUE))
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPdadosLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(22, 22, 22)
                                        .addComponent(jtxprecocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)))
                                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPdadosLayout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(pesquisar2)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxprecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(txtQTDEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(jTxDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBsalvar)
                        .addGap(42, 42, 42)
                        .addComponent(jBEditar)
                        .addGap(38, 38, 38)
                        .addComponent(jBExcluir1)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPdadosLayout.setVerticalGroup(
            jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar2))
                .addGap(29, 29, 29)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxprecocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtQTDEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtxprecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jcbfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBsalvar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir1))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        Jdados.addTab("Dados Do Produtos", jPdados);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nome:");

        jtxPesquisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxPesquisaActionPerformed(evt);
            }
        });
        jtxPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxPesquisaKeyPressed(evt);
            }
        });

        jBpesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        tabelaProdutos.setBackground(new java.awt.Color(255, 255, 255));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Descrição:", "Preço de compra:", "Preço de venda:", "QTD.Estoque", "Fornecedor"
            }
        ));
        tabelaProdutos.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaProdutos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaProdutosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tabelaProdutosAncestorRemoved(evt);
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        jBNovo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBNovo1.setText("Novo");
        jBNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovo1ActionPerformed(evt);
            }
        });

        jBsalvar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsalvar1.setText("Salvar");
        jBsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvar1ActionPerformed(evt);
            }
        });

        jBEditar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBEditar1.setText("Editar");
        jBEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditar1ActionPerformed(evt);
            }
        });

        jBExcluir2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBExcluir2.setText("Excluir");
        jBExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBpesquisar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jBNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBsalvar1)
                        .addGap(18, 18, 18)
                        .addComponent(jBEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir2)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo1)
                    .addComponent(jBsalvar1)
                    .addComponent(jBEditar1)
                    .addComponent(jBExcluir2))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        Jdados.addTab("Consultar Produtos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Jdados)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Jdados)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaProdutosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaProdutosAncestorAdded
        /// Carrega Lista de Clientes//
        listar();
    }//GEN-LAST:event_tabelaProdutosAncestorAdded

    private void tabelaProdutosAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaProdutosAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutosAncestorRemoved

    private void JdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JdadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JdadosMouseClicked

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        //Pega dados //
        JOptionPane.showMessageDialog(null,"ATENÇÃO!!, ANTES DE CADASTRAR UM PRODUTO CERTIFIQUE-SE SE ELE JÁ NAO ESXISTE CADASTRADO NO SEU ESTOQUE");
        Jdados.setSelectedIndex(0);
        jtxCodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
        jTxDecricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
        jtxprecocompra.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        jtxprecovenda.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        txtQTDEstoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());

        Fornecedores f = new Fornecedores();

        FornecedoresDAO dao = new FornecedoresDAO();
        f = dao.consultarFornecedores(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString());

        jcbfornecedor.removeAllItems();
        jcbfornecedor.getModel().setSelectedItem(f);

    }//GEN-LAST:event_tabelaProdutosMouseClicked
    private void txtcepkeyPressed(java.awt.event.KeyEvent evt) {

    }
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        //Botão Pesquisar//
        String nome = "%" + jtxPesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_de_compra(),
                c.getPreco_de_venda(),
                c.getQtd_estoque(),
                c.getFornecedor().getNome()

            });
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jtxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxPesquisaActionPerformed

    private void jtxPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxPesquisaKeyPressed
        String nome = "%" + jtxPesquisa.getText() + "%";

        ProdutosDAO dao = new ProdutosDAO();
        List<Produtos> lista = dao.listarProdutosPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
        dados.setNumRows(0);
        for (Produtos c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getDescricao(),
                c.getPreco_de_compra(),
                c.getPreco_de_venda(),
                c.getQtd_estoque(),
                c.getFornecedor().getNome()

            });
        }
    }//GEN-LAST:event_jtxPesquisaKeyPressed

    private void jBNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNovo1ActionPerformed

    private void jBsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalvar1ActionPerformed

    private void jBEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditar1ActionPerformed

    private void jBExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluir2ActionPerformed

    private void pesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar2ActionPerformed
        // Botão buscar cliente por nome

        String nome = jTxDecricao.getText();
        Produtos obj = new Produtos();
        ProdutosDAO dao = new ProdutosDAO();
        obj = dao.consultarPorNome(nome);
        jcbfornecedor.removeAll();
        //exibir dados do objeto na tela //
        if (obj.getDescricao() != null) {
            //Exibir os dados //
            jtxCodigo.setText(String.valueOf(obj.getId()));
            jTxDecricao.setText(obj.getDescricao());
            txtQTDEstoque.setText(String.valueOf(obj.getQtd_estoque()));
            jtxprecocompra.setText(String.valueOf(obj.getPreco_de_compra()));
            jtxprecovenda.setText(String.valueOf(obj.getPreco_de_venda()));

            Fornecedores f = new Fornecedores();
            FornecedoresDAO fdao = new FornecedoresDAO();

            f = fdao.consultarFornecedores(obj.getFornecedor().getNome());

            jcbfornecedor.getModel().setSelectedItem(f);

        } else {
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO");
        }
    }//GEN-LAST:event_pesquisar2ActionPerformed

    private void jBExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluir1ActionPerformed
        //Função Excluir//

        Produtos obj = new Produtos();

        obj.setId(Integer.parseInt(jtxCodigo.getText()));
        ProdutosDAO dao = new ProdutosDAO();

        dao.excluir(obj);
        new Utilitarios().limparTela(jPdados);
    }//GEN-LAST:event_jBExcluir1ActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        //Função editar//
       JOptionPane.showMessageDialog(null,"ATENÇÃO!!, ANTES DE CADASTRAR UM PRODUTO CERTIFIQUE-SE SE ELE JÁ NAO ESXISTE CADASTRADO NO SEU ESTOQUE");
        Produtos obj = new Produtos();
        obj.setId(Integer.parseInt(jtxCodigo.getText()));
        obj.setDescricao(jTxDecricao.getText());
        obj.setQtd_estoque(Integer.parseInt(txtQTDEstoque.getText()));
        obj.setPreco_de_compra(Double.parseDouble(jtxprecocompra.getText()));
        obj.setPreco_de_venda(Double.parseDouble(jtxprecovenda.getText()));

        //Criar um Objeto Fornecedor //
        Fornecedores f = new Fornecedores();

        f = (Fornecedores) jcbfornecedor.getSelectedItem();

        obj.setFornecedor(f);

        ProdutosDAO dao = new ProdutosDAO();

        dao.alterarProdutos(obj);

        new Utilitarios().limparTela(jPdados);
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        //Função Saalvar//
        JOptionPane.showMessageDialog(null,"ATENÇÃO!!, ANTES DE CADASTRAR UM PRODUTO CERTIFIQUE-SE SE ELE JÁ NAO ESXISTE CADASTRADO NO SEU ESTOQUE");
        Produtos obj = new Produtos();
        obj.setDescricao(jTxDecricao.getText());
        obj.setQtd_estoque(Integer.parseInt(txtQTDEstoque.getText()));
        obj.setPreco_de_compra(Double.parseDouble(jtxprecocompra.getText()));
        obj.setPreco_de_venda(Double.parseDouble(jtxprecovenda.getText()));

        //Criar um Objeto De Fornecedor//
        Fornecedores f = new Fornecedores();

        f = (Fornecedores) jcbfornecedor.getSelectedItem();
        obj.setFornecedor(f);

        ProdutosDAO dao = new ProdutosDAO();
        dao.cadastrar(obj);

        new Utilitarios().limparTela(jPdados);
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed

        new Utilitarios().limparTela(jPdados);
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jtxprecocompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxprecocompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxprecocompraActionPerformed

    private void jtxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCodigoActionPerformed

    private void txtQTDEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTDEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTDEstoqueActionPerformed

    private void jcbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jcbfornecedorAncestorAdded
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listaFornecedores();

       
    }//GEN-LAST:event_jcbfornecedorAncestorAdded

    private void jcbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbfornecedorMouseClicked
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listaFornecedores();
        jcbfornecedor.removeAll();

        for (Fornecedores f : listadefornecedores) {
            jcbfornecedor.addItem(f);
        }
    }//GEN-LAST:event_jcbfornecedorMouseClicked

    private void jtxprecovendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxprecovendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxprecovendaActionPerformed

    private void jcbfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbfornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(Frmprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmprodutos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTabbedPane Jdados;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEditar1;
    private javax.swing.JButton jBExcluir1;
    private javax.swing.JButton jBExcluir2;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBNovo1;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JButton jBsalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPdados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxDecricao;
    private javax.swing.JComboBox jcbfornecedor;
    private javax.swing.JTextField jtxCodigo;
    private javax.swing.JTextField jtxPesquisa;
    private javax.swing.JTextField jtxprecocompra;
    private javax.swing.JTextField jtxprecovenda;
    private javax.swing.JButton pesquisar2;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtQTDEstoque;
    // End of variables declaration//GEN-END:variables
}
