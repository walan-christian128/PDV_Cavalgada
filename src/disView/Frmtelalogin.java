/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disView;


import disDAO.FuncionariosDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author adm_walan.costa
 */
public class Frmtelalogin extends javax.swing.JFrame {

    /**
     * Creates new form Frmtelalogin
     */
    public Frmtelalogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlusuario = new javax.swing.JLabel();
        txtemail3 = new javax.swing.JTextField();
        jlbsenha = new javax.swing.JLabel();
        txtsenha3 = new javax.swing.JPasswordField();
        jbsair = new javax.swing.JButton();
        lbentrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA DBS");

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("DBS Usuários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jlusuario.setBackground(new java.awt.Color(255, 255, 255));
        jlusuario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlusuario.setForeground(new java.awt.Color(0, 0, 0));
        jlusuario.setText("Usuario:");

        txtemail3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtemail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemail3ActionPerformed(evt);
            }
        });

        jlbsenha.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jlbsenha.setForeground(new java.awt.Color(0, 0, 0));
        jlbsenha.setText("Senha:");

        txtsenha3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jbsair.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jbsair.setText("SAIR");
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });

        lbentrar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lbentrar.setText("ENTRAR");
        lbentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbentrarActionPerformed(evt);
            }
        });
        lbentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbentrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsenha3, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtemail3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbentrar)
                .addGap(123, 123, 123)
                .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenha3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsenha))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbsair, lbentrar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemail3ActionPerformed

    private void lbentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbentrarActionPerformed
        // Entrar//
        try {
            String usuario, senha;
            usuario = txtemail3.getText();
            senha = txtsenha3.getText();
            
            FuncionariosDAO dao = new FuncionariosDAO();
            
            
            dao.efetuarLogin(usuario, senha);
            this.dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro" + erro);
            
        }
    }//GEN-LAST:event_lbentrarActionPerformed

    private void lbentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbentrarKeyPressed
     
    }//GEN-LAST:event_lbentrarKeyPressed

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsairActionPerformed
int op;
        op = JOptionPane.showConfirmDialog(null, "TEM CERTEZA QUE DESEJA SAIR ?");

        if (op == 0) {
            System.exit(0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jbsairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmtelalogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbsair;
    private javax.swing.JLabel jlbsenha;
    private javax.swing.JLabel jlusuario;
    private javax.swing.JButton lbentrar;
    private javax.swing.JTextField txtemail3;
    private javax.swing.JPasswordField txtsenha3;
    // End of variables declaration//GEN-END:variables
}
