/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disConexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Walan
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/distribuidora","walan","359483wa@");
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
 
  }
}
   