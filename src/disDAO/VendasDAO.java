/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disDAO;

import com.lowagie.text.pdf.codec.wmf.MetaPen;
import disModel.Clientes;
import disConexao.ConnectionFactory;

import disModel.Vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Walan
 */
public class VendasDAO {

    private Connection con;

    public VendasDAO() {
        this.con = new ConnectionFactory().getConnection();

    }
    //Cadastrar Venda//

    public void cadastrarVenda(Vendas obj) {
        try {

            String sql = "insert into tb_vendas(cliente_id,data_venda,total_venda,lucro,observacoes,desconto)values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setDouble(4, obj.getLucro());
            stmt.setString(5, obj.getObs());
            stmt.setDouble(6, obj.getDesconto());

            stmt.execute();

            stmt.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO" + erro);
        }

    }
    //Retorna a Ultima venda//

    public int retornaUltimaVenda() {

        try {
            int idvenda = 0;

            String sql = "select max(id)id from tb_vendas";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Vendas p = new Vendas();
                p.setId(rs.getInt("id"));

                idvenda = p.getId();

            }
            return idvenda;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //Metodo que filtra venda por datas //
    public List<Vendas> listarVendasPorPeriodo(LocalDate data_inicio, LocalDate data_fim) {
        try {

            //1 passo criar lista de Vendas//
            List<Vendas> lista = new ArrayList<>();

            String sql = "select v.id,date_format(v.data_venda,'%d/%m/%Y')as data_formatada,c.nome,v.total_venda,v.observacoes,v.lucro,v.desconto from tb_vendas as v "
                    + "inner join tb_clientes as c on(v.cliente_id = c.id)where v.data_venda BETWEEN? AND?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vendas obj = new Vendas();
                Clientes c = new Clientes();

                obj.setId(rs.getInt("v.id"));
                obj.setData_venda(rs.getString("data_formatada"));
                c.setNome(rs.getString("c.nome"));
                obj.setTotal_venda(rs.getDouble("v.total_venda"));
                obj.setObs(rs.getString("v.observacoes"));
                obj.setLucro(rs.getDouble("v.lucro"));
                obj.setDesconto(rs.getDouble("v.desconto"));

                obj.setCliente(c);

                lista.add(obj);

            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO!" + e);
            return null;

        }

    }

    public double totalPorPeriodo(LocalDate data_inicio, LocalDate data_fim) {
        try {
            double totalPeriodo = 0;

            String sql = "select sum(total_venda)as total_periodo,date_format(data_venda,'%d/%m/%Y')"
                    + " as data_formatada from tb_vendas where data_venda BETWEEN? AND? ";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_inicio.toString());
            stmt.setString(2, data_fim.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
            
            totalPeriodo = rs.getDouble("total_periodo");
            
            
            }
            return totalPeriodo;
            
        } catch (Exception e) {
        }
        return 0;

    }

    //Metodo que calcula total da vendaa por data//
    public double retornaTotalVendaPorData(LocalDate data_venda) {
        try {
            double totalvenda = 0;

            String sql = "select sum(total_venda)as total from tb_vendas where data_venda = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, data_venda.toString());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                totalvenda = rs.getDouble("total");

            }
            return totalvenda;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    

}
