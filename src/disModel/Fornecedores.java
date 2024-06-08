/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disModel;

/**
 *
 * @author Walan
 */
public class Fornecedores extends Clientes{
    private String cnpj;
    
       //atributos//
    public String getCnpj() {
        return cnpj;
    }

    //gets e stter/
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @Override
    public String toString(){
     return this.getNome();
    
    }
    
    
}
