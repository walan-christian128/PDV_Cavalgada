
package disView;

import disModel.Clientes;
import disDAO.ItemVendaDAO;
import disDAO.ProdutosDAO;
import disDAO.VendasDAO;
import disModel.ItemVendas;
import disModel.Produtos;
import disModel.Utilitarios;
import disModel.Vendas;
import disRel.RelNotaVenda;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;


/**
 *
 * @author Walan
 */
public class frmpagamentos extends javax.swing.JFrame {

    Clientes cliente = new Clientes();
    DefaultTableModel carrinho;

    public frmpagamentos() {
        initComponents();
        txtcartao1.setText("0");
        txtdinheiro.setText("0");
        txtcheque.setText("0");
        txttroco.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdinehrio3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        txtobs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aresobs = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tplucro = new javax.swing.JTextField();
        txtdesconto1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcartao1 = new javax.swing.JTextField();

        txtdinehrio3.setEditable(false);
        txtdinehrio3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtdinehrio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdinehrio3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cheque:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamentos");

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("PAGAMENTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dinheiro:");

        txtdinheiro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtdinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdinheiroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cartão De Credito:");

        txtcheque.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtcheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchequeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cartão De Debito:");

        txttroco.setEditable(false);
        txttroco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txttroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrocoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Troco:");

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total:");

        btnFinalizar.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        btnFinalizar.setText("Finalizar Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        txtobs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtobs.setForeground(new java.awt.Color(0, 0, 0));
        txtobs.setText("Observações:");

        aresobs.setColumns(20);
        aresobs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        aresobs.setRows(5);
        jScrollPane1.setViewportView(aresobs);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lucro:");

        tplucro.setEditable(false);
        tplucro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tplucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tplucroActionPerformed(evt);
            }
        });

        txtdesconto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtdesconto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesconto1ActionPerformed(evt);
            }
        });
        txtdesconto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdesconto1KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Desconto:");

        txtcartao1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtcartao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcartao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcartao1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tplucro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtobs)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtobs))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcartao1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tplucro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdinheiroActionPerformed

    private void txtchequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchequeActionPerformed

    private void txtdinehrio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdinehrio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdinehrio3ActionPerformed

    private void txttrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrocoActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        double pcartao, pcheque, pdinheiro, totalpago, totalvenda, troco, lucro, desconto;
        pcartao = Double.parseDouble(txtcartao1.getText());
        pcheque = Double.parseDouble(txtcheque.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());
        lucro = Double.parseDouble(tplucro.getText());
        desconto = Double.parseDouble(txtdesconto1.getText());

        //Imprimir relatorio da venda realizada//
        totalvenda = Double.parseDouble(txttotal.getText());

        //Calcular total e troco e desconto( de se tiver) //
        totalpago = pcartao + pcheque + pdinheiro;

        //calcular troco da venda 
        troco = totalpago - totalvenda;
        txttroco.setText(String.valueOf(troco));
        tplucro.setText(String.valueOf(lucro));
        txtdesconto1.setText(String.valueOf(desconto));

        Vendas objv = new Vendas();

        //dados do cliente//
        objv.setCliente(cliente);
        
        //pega a data da venda//

        Date agora = new Date();
        SimpleDateFormat dataEUA = new SimpleDateFormat("yyyy-MM-dd");
        String datamysql = dataEUA.format(agora);
        objv.setData_venda(datamysql);

        //total da venda e obs//
        objv.setTotal_venda(totalvenda);
        objv.setObs(aresobs.getText());
        objv.setLucro(lucro);
        objv.setDesconto(desconto);


        VendasDAO dao_v = new VendasDAO();
        dao_v.cadastrarVenda(objv);

        //Retornar o ID da ultima venda realizada//
        objv.setId(dao_v.retornaUltimaVenda());

        //Cadastrando os produtos na tabela iten vendas//
         for (int i = 0; i < carrinho.getRowCount(); i++) {

            int qtd_estoque , qtd_comprada, qtd_atualizada;
            Produtos objp = new Produtos();
            ProdutosDAO dao_produto = new ProdutosDAO();
          
            ItemVendas item = new ItemVendas();
            item.setVenda(objv);

            objp.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(objp);
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
                        
            //Baixa no estoque
            qtd_estoque = dao_produto.retornaEstoqueAtual(objp.getId());
            qtd_comprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            qtd_atualizada = qtd_estoque - qtd_comprada;
            
            dao_produto.baixarEstoque(objp.getId(), qtd_atualizada);         

            ItemVendaDAO daoitem = new ItemVendaDAO();
            daoitem.cadastraItem(item);
            
          
             
         }
           JOptionPane.showMessageDialog(null, "VENDA REGISTRADA COM SUCESSO!");
     try {
            new RelNotaVenda().gerar("src/Relatorios2/Cavalgada.jrxml",objv.getId());
       } catch (JRException ex) {
           Logger.getLogger(frmpagamentos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           Logger.getLogger(frmpagamentos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmpagamentos.class.getName()).log(Level.SEVERE, null, ex);
       }
                 new Utilitarios().limparTela(jPanel1);
                 this.dispose();
       
   
        
       

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tplucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tplucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tplucroActionPerformed

    private void txtdesconto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesconto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesconto1ActionPerformed

    private void txtdesconto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesconto1KeyPressed

    }//GEN-LAST:event_txtdesconto1KeyPressed

    private void txtcartao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcartao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcartao1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmpagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpagamentos().setVisible(true);
            }
        });
    }

   

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aresobs;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField tplucro;
    private javax.swing.JTextField txtcartao1;
    private javax.swing.JTextField txtcheque;
    public javax.swing.JTextField txtdesconto1;
    private javax.swing.JTextField txtdinehrio3;
    private javax.swing.JTextField txtdinheiro;
    private javax.swing.JLabel txtobs;
    public javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttroco;
    // End of variables declaration//GEN-END:variables
}
