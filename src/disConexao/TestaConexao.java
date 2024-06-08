 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disConexao;

import javax.swing.JOptionPane;

/**
 *
 * @author Walan
 */
public class TestaConexao {
    public static void main(String[] args) {
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado Com Sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Ops Não Conectou" + erro);
        }
    }
}
