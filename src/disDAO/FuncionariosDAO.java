/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disDAO;

import disModel.Funcionarios;
import disConexao.ConnectionFactory;
import disView.Frmmenuinicial;
import disView.Frmtelalogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adm_walan.costa
 */
public class FuncionariosDAO {

    // conexao//
    private Connection con;

    public FuncionariosDAO() {
        this.con = new ConnectionFactory().getConnection();

    }

    ///Metodo Cadastrar//
    public void cadastrarFuncionarios(Funcionarios obj) {
        //comando SQL//
        try {
            String sql = "INSERT INTO tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "                    VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //Organização SQL e Conexão // 
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNA());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            //Execução//
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "CADASTRADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "HOUVE UM ERRO CONFIRA O SQL" + erro);
        }

    }

    //metodo alterar funcionario//
    public void alterarFuncionarios(Funcionarios obj) {
        try {
            String sql = "UPDATE tb_funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?"
                    + ",endereco=?,numero=?,complemento=?,bairro=?,cidade=?,estado=? WHERE ID=?";

            //Organização SQL e Conexão // 
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNA());
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            stmt.setInt(17, obj.getId());

            //Execução//
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "ALTERADO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "HOUVE UM ERRO CONFIRA O SQL" + erro);

        }
    }

    //metodo excluir funcionarios//
    public void excluirFucionarios(Funcionarios obj) {
        try {
            String sql = "DELETE FROM tb_funcioanrios where id = ?";
            //Organização SQL e Conexão // 
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            //Execução//
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "EXCLUIDO COM SUCESSO!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "HOUVE UM ERRO" + erro);
        }

    }

    public Funcionarios consultarFuncionarios(String nome) {
        try {
            String sql = "select*from tb_funcionarios where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            Funcionarios obj = new Funcionarios();

            if (rs.next()) {

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNA(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("Numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

            }
            return obj;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO" + erro);
            return null;
        }
    }

    //Metodo pesquisar cliente pela barra de pesquisa// 
    public List<Funcionarios> BuscarFuncionariosPorNome(String nome) {
        try {
            List<Funcionarios> lista = new ArrayList<>();

            //criando sql//
            String sql = "SELECT * FROM tb_funcionarios WHERE nome LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNA(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("Numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);

            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
    }

    //Metodo listrar tods os funcionarios //
    public List<Funcionarios> listaFuncionarios() {
        try {
            List<Funcionarios> lista = new ArrayList<>();

            //criando sql//
            String sql = "SELECT * FROM tb_funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNA(rs.getString("nivel_acesso"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("Numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);

            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }
    }
    //METODO EFETUA lOGIN//

    public void efetuarLogin(String nome, String senha) {
        try {
            // 1 passo- SQL//
            String sql = "select * from tb_funcionarios where nome = ? and senha = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //Usuario Logou//
                //caso o ususario sejaa do tipo adm//
                if (rs.getString("nivel_acesso").equals("ADMIN")) {

                    JOptionPane.showMessageDialog(null, "USUARIO LOGADO COM SUCESSO");
                    Frmmenuinicial tela = new Frmmenuinicial();
                    tela.usuarioLogado = rs.getString("nome");
                    tela.setVisible(true);

                } //caso nao seja ususario adm//
                else if (rs.getString("nivel_acesso").equals("USUARIO")) {

                    JOptionPane.showMessageDialog(null, "USUARIO LOGADO COM SUCESSO");
                    Frmmenuinicial tela = new Frmmenuinicial();

                    tela.usuarioLogado = rs.getString("nome");
                    tela.setVisible(true);

                    // desabiliatr menus //
                    tela.funci.setEnabled(false);
                    tela.Config.setEnabled(false);

                    tela.setVisible(true);
                }

            } else {
                //dados incorretos//
                JOptionPane.showMessageDialog(null, "DADOS INCORRETOS");
                new Frmtelalogin().setVisible(true);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erros SQL" + erro);
        }

    }

}
