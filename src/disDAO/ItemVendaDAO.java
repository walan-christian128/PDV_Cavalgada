package disDAO;

import disConexao.ConnectionFactory;
import disModel.ItemVendas;
import disModel.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ItemVendaDAO {

    private Connection con;

    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();

    }

    // Metodo que Cadastra Itens //
    public void cadastraItem(ItemVendas obj) {
        try {

            String sql = "insert into tb_itensvendas(venda_id,produto_id,qtd,subtotal)values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
          

            stmt.execute();

            stmt.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO" + erro);
        }

    }

    //Metodo que lista vendidos de uma venda em detalhes //
    public List<ItemVendas> listarItensPorVendao(int venda_id) {
        try {

            //1 passo criar lista de Vendas//
            List<ItemVendas> lista = new ArrayList<>();

            String sql = "select i.id, p.descricao, i.qtd, p.preco_de_venda, i.subtotal from tb_itensvendas as i"
                    + " inner join tb_produtos as p on(i.produto_id = p.id)where i.venda_id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda_id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ItemVendas item = new ItemVendas();
                Produtos prod =  new Produtos();
                
                item.setId(rs.getInt("i.id"));
                prod.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                prod.setPreco_de_venda(rs.getDouble("p.preco_de_venda"));
                item.setSubtotal(rs.getDouble("i.subtotal"));
             
                
                item.setProduto(prod);
                
                lista.add(item);

            }

            return lista;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO!" + e);
            return null;

        }

    }
}
