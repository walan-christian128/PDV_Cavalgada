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
public class Produtos {
    private int id;
    private String descricao;
    private int qtd_estoque;
    private Fornecedores fornecedor;
    private double preco_de_compra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco_de_compra() {
        return preco_de_compra;
    }

    public void setPreco_de_compra(double preco_de_compra) {
        this.preco_de_compra = preco_de_compra;
    }

    public double getPreco_de_venda() {
        return preco_de_venda;
    }

    public void setPreco_de_venda(double preco_de_venda) {
        this.preco_de_venda = preco_de_venda;
    }
    private double preco_de_venda;

    
    
}
