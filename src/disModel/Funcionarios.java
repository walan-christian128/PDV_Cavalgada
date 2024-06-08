/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disModel;

/**
 *
 * @author adm_walan.costa
 */
public class Funcionarios extends Clientes {
    //atributos//
    private String senha;
    private String cargo;
    private String NA;
    
    
    ///get e stes ///
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNA() {
        return NA;
    }

    public void setNA(String NA) {
        this.NA = NA;
    }
}
