package disRel;

import disConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class RelNotaVenda {

    private Connection con;

    public RelNotaVenda() {
        this.con = new ConnectionFactory().getConnection();
    }

    public void gerar(String layout, int vendaID) throws JRException, SQLException, ClassNotFoundException {
//gerando o jasper design
        JasperDesign desenho = JRXmlLoader.load(layout);

//compila o relatório
        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

//estabelece conexão
        Statement stm = con.createStatement();

        String sql =" SELECT itens_vendas.produto_id AS codigo, "
                + " produto.descricao AS decricao, "
                + " 1 AS quantidade, "
                + " vendas.id as codigo_venda, "
                + " produto.preco_de_venda as preco "
                + " FROM tb_itensvendas AS itens_vendas "
                + " INNER JOIN tb_vendas AS vendas ON itens_vendas.venda_id = vendas.id "
                + " INNER JOIN tb_produtos AS produto ON produto.id = itens_vendas.produto_id "
                + " INNER JOIN series ON series.n <= itens_vendas.qtd "
                + " WHERE vendas.id = '" + vendaID + "' ";

        ResultSet rs = stm.executeQuery(sql);

//implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

//executa o relatório
        Map parametros = new HashMap();
        parametros.put("cavalgada", new Integer(10));
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);

//exibe o resultado
        JasperViewer viewer = new JasperViewer(impressao, true);
        viewer.show();
        
    }

}
