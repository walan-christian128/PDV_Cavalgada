/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disDAO;

import disConexao.ConnectionFactory;
import disModel.Fornecedores;
import disModel.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Walan
 */
public class ProdutosDAO {

    private Connection con;

    public ProdutosDAO() {
        this.con = new ConnectionFactory().getConnection();

    }

    //metodo cadastra produtos//
    public void cadastrar(Produtos obj) {
        try {

            String sql = "insert into tb_produtos(descricao,qtd_estoque,for_id,preco_de_compra,preco_de_venda)values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setInt(2, obj.getQtd_estoque());
            stmt.setInt(3, obj.getFornecedor().getId());
            stmt.setDouble(4, obj.getPreco_de_compra());
            stmt.setDouble(5, obj.getPreco_de_venda());

            stmt.execute();

            stmt.close();

            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO" + erro);
        }

    }

    public List<Produtos> listarProdutos() {
        try {

            //1 passo criar lista de produtos//
            List<Produtos> lista = new ArrayList<>();

            String sql = "select p.id,p.descricao,p.qtd_estoque,p.preco_de_compra,p.preco_de_venda,f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id=f.id)";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                obj.setPreco_de_compra(rs.getDouble("p.preco_de_compra"));
                obj.setPreco_de_venda(rs.getDouble("p.preco_de_venda"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);

                lista.add(obj);

            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO!" + e);
            return null;

        }

    }

    public void alterarProdutos(Produtos obj) {
        try {
            String sql = "UPDATE tb_produtos set descricao=?,qtd_estoque=?,for_id=?,preco_de_compra=?,preco_de_venda=? where id=?";

            //Organização SQL e Conexão // 
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, obj.getDescricao());
            stmt.setInt(2, obj.getQtd_estoque());
            stmt.setInt(3, obj.getFornecedor().getId());
            stmt.setDouble(4, obj.getPreco_de_compra());
            stmt.setDouble(5, obj.getPreco_de_venda());

            stmt.setInt(6, obj.getId());

            //Execução//
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, " PRODUTO ALTERADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "HOUVE UM ERRO CONFIRA O SQL" + erro);

        }
    }

    public void excluir(Produtos obj) {
        try {
            String sql = "delete from tb_produtos where id=?";
            //Organização SQL//

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "PRODUTO APAGADO COM SUCESSO");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NOS DADOS" + e);
        }

    }

    public Produtos consultarPorNome(String nome) {
        try {

            //1 passo criar lista de produtos//
            String sql = "select p.id,p.descricao,p.qtd_estoque,p.preco_de_compra,p.preco_de_venda,f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id=f.id) where p.descricao=?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                obj.setPreco_de_compra(rs.getDouble("p.preco_de_compra"));
                obj.setPreco_de_venda(rs.getDouble("p.preco_de_venda"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);

            }

            return obj;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!" + e);
            return null;

        }

    }

    public Produtos consultarPorCodigo(int id) {
        try {

            //1 passo criar lista de produtos//
            String sql = "select*from tb_produtos where id=?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();

            if (rs.next()) {

                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                obj.setPreco_de_compra(rs.getDouble("preco_de_compra"));
                obj.setPreco_de_venda(rs.getDouble("preco_de_venda"));

            }

            return obj;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO!" + e);
            return null;

        }

    }

    public List<Produtos> listarProdutosPorNome(String nome) {
        try {

            //1 passo criar lista de produtos//
            List<Produtos> lista = new ArrayList<>();

            String sql = "select p.id,p.descricao,p.qtd_estoque,p.preco_de_compra,p.preco_de_venda,f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id=f.id))where p.descricao like ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                obj.setPreco_de_compra(rs.getDouble("p.preco_de_compra"));
                obj.setPreco_de_venda(rs.getDouble("p.preco_de_venda"));

                f.setNome(rs.getString(("f.nome")));

                obj.setFornecedor(f);

                lista.add(obj);

            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO!" + e);
            return null;

        }

    }

    //METODO DE DAR BAIXO NO ESTOQUE //
    public void baixarEstoque(int id, int qtd_nova) {

        try {
            String sql = "update tb_produtos set qtd_estoque=? where id=?";
            // 2 Passo - conectar o banco de dados e organizar o comando sql//

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
        }

    }

    //Metodo Retorna Estoque Atual de um produto//
    public int retornaEstoqueAtual(int id) {
        try {
            int qtd_estoque = 0;
            String sql = "select qtd_estoque from tb_produtos where id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                qtd_estoque = (rs.getInt("qtd_estoque"));

            }

            return qtd_estoque;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void adicionarEstoque(int id, int qtd_nova) {

        try {
            String sql = "update tb_produtos set qtd_estoque=? where id=?";
            // 2 Passo - conectar o banco de dados e organizar o comando sql//

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro" + e);
        }

    }

}
