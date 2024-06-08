/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disView;



import com.sun.glass.events.KeyEvent;
import disDAO.FornecedoresDAO;
import disModel.Fornecedores;
import disModel.Utilitarios;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author adm_walan.costa
 */
public class Frmfornecedores extends javax.swing.JFrame {
    //Metodo Listar na Tabela//

    public void listar() {
        FornecedoresDAO dao = new FornecedoresDAO();
        List< Fornecedores> lista = dao.listaFornecedores();
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for ( Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }

    public Frmfornecedores() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jdados = new javax.swing.JTabbedPane();
        jPdados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxCodigo = new javax.swing.JTextField();
        jTxNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxcel = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxCEP = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxendereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxnumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxbairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxcidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxcomplemento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcbuf = new javax.swing.JComboBox<>();
        lbCnpj = new javax.swing.JLabel();
        jtxcnpj = new javax.swing.JFormattedTextField();
        jBNovo = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir1 = new javax.swing.JButton();
        pesquisar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jtxPesquisa = new javax.swing.JTextField();
        jBpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        jBNovo1 = new javax.swing.JButton();
        jBsalvar1 = new javax.swing.JButton();
        jBEditar1 = new javax.swing.JButton();
        jBExcluir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro De Fornecedor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        Jdados.setBackground(new java.awt.Color(51, 51, 51));
        Jdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JdadosMouseClicked(evt);
            }
        });

        jPdados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código:");

        jtxCodigo.setEditable(false);
        jtxCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCodigoActionPerformed(evt);
            }
        });

        jTxNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        jtxemail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxemailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cel:");

        try {
            jtxcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxcel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tel");

        try {
            jtxtel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxtel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CEP:");

        try {
            jtxCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxCEP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCEPActionPerformed(evt);
            }
        });
        jtxCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxCEPKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Endereço:");

        jtxendereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("N°");

        jtxnumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Bairro:");

        jtxbairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Cidade:");

        jtxcidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Complemento ");

        jtxcomplemento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("UF:");

        jcbuf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", " " }));

        lbCnpj.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbCnpj.setForeground(new java.awt.Color(0, 0, 0));
        lbCnpj.setText("CNPJ:");

        try {
            jtxcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxcnpj.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jBNovo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBsalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBExcluir1.setText("Excluir");
        jBExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluir1ActionPerformed(evt);
            }
        });

        pesquisar2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pesquisar2.setText("Pesquisar");
        pesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPdadosLayout = new javax.swing.GroupLayout(jPdados);
        jPdados.setLayout(jPdadosLayout);
        jPdadosLayout.setHorizontalGroup(
            jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdadosLayout.createSequentialGroup()
                                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(22, 22, 22)
                                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPdadosLayout.createSequentialGroup()
                                        .addComponent(jtxCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addComponent(jtxemail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pesquisar2)
                                    .addGroup(jPdadosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxcel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jTxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addComponent(lbCnpj)
                        .addGap(28, 28, 28)
                        .addComponent(jtxcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdadosLayout.createSequentialGroup()
                        .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPdadosLayout.createSequentialGroup()
                                .addComponent(jtxbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBsalvar)
                .addGap(18, 18, 18)
                .addComponent(jBEditar)
                .addGap(18, 18, 18)
                .addComponent(jBExcluir1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPdadosLayout.setVerticalGroup(
            jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdadosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar2))
                .addGap(29, 29, 29)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtxcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtxendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtxnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtxcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtxcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jcbuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpj)
                    .addComponent(jtxcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPdadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBsalvar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir1))
                .addGap(61, 61, 61))
        );

        Jdados.addTab("Dados Do Fornecedor", jPdados);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nome:");

        jtxPesquisa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtxPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxPesquisaActionPerformed(evt);
            }
        });
        jtxPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxPesquisaKeyPressed(evt);
            }
        });

        jBpesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        tabelaFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Nome:", "CNPJ:", "E-mail:", "Telefone:", "Celular:", "Cep:", "Endereço", "N°:", "Comp:", "Bairro:", "Cidade:", "UF:"
            }
        ));
        tabelaFornecedores.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaFornecedores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaFornecedoresAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tabelaFornecedoresAncestorRemoved(evt);
            }
        });
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        jBNovo1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBNovo1.setText("Novo");
        jBNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovo1ActionPerformed(evt);
            }
        });

        jBsalvar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsalvar1.setText("Salvar");
        jBsalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvar1ActionPerformed(evt);
            }
        });

        jBEditar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBEditar1.setText("Editar");
        jBEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditar1ActionPerformed(evt);
            }
        });

        jBExcluir2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBExcluir2.setText("Excluir");
        jBExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jBpesquisar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jBNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBsalvar1)
                        .addGap(18, 18, 18)
                        .addComponent(jBEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir2)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo1)
                    .addComponent(jBsalvar1)
                    .addComponent(jBEditar1)
                    .addComponent(jBExcluir2))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        Jdados.addTab("Consultar Fornecedor", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Jdados)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jdados))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxemailActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        //Função Saalvar//

        Fornecedores obj = new Fornecedores();
        obj.setNome(jTxNome.getText());
        obj.setCnpj(jtxcnpj.getText());
        obj.setEmail(jtxemail.getText());
        obj.setTelefone(jtxtel.getText());
        obj.setCelular(jtxcel.getText());
        obj.setCep(jtxCEP.getText());
        obj.setEndereco(jtxendereco.getText());
        obj.setNumero(Integer.parseInt(jtxnumero.getText()));
        obj.setComplemento(jtxcomplemento.getText());
        obj.setBairro(jtxbairro.getText());
        obj.setCidade(jtxcidade.getText());
        obj.setUf(jcbuf.getSelectedItem().toString());

        FornecedoresDAO dao = new FornecedoresDAO();

        dao.cadastrarFornecedores(obj);
        new Utilitarios().limparTela(jPdados);

    }//GEN-LAST:event_jBsalvarActionPerformed

    private void tabelaFornecedoresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaFornecedoresAncestorAdded
        /// Carrega Lista de Clientes//
        listar();
    }//GEN-LAST:event_tabelaFornecedoresAncestorAdded

    private void tabelaFornecedoresAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaFornecedoresAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaFornecedoresAncestorRemoved

    private void JdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JdadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JdadosMouseClicked

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        //Pega dados //
        Jdados.setSelectedIndex(0);

        jtxCodigo.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 0).toString());
        jTxNome.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 1).toString());
        jtxcnpj.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 2).toString());
        jtxemail.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 3).toString());
        jtxtel.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 4).toString());
        jtxcel.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 5).toString());
        jtxCEP.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 6).toString());
        jtxendereco.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 7).toString());
        jtxnumero.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 8).toString());
        jtxcomplemento.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 9).toString());
        jtxbairro.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 10).toString());
        jtxcidade.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 11).toString());
        jcbuf.setSelectedItem(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(), 12).toString());

    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        //Função editar//

        Fornecedores obj = new Fornecedores();
        obj.setNome(jTxNome.getText());
        obj.setCnpj(jtxcnpj.getText());
        obj.setEmail(jtxemail.getText());
        obj.setTelefone(jtxtel.getText());
        obj.setCelular(jtxcel.getText());
        obj.setCep(jtxCEP.getText());
        obj.setEndereco(jtxendereco.getText());
        obj.setNumero(Integer.parseInt(jtxnumero.getText()));
        obj.setComplemento(jtxcomplemento.getText());
        obj.setBairro(jtxbairro.getText());
        obj.setCidade(jtxcidade.getText());
        obj.setUf(jcbuf.getSelectedItem().toString());
        obj.setId(Integer.parseInt(jtxCodigo.getText()));

       FornecedoresDAO dao = new  FornecedoresDAO();

        dao.alterarFornecedores(obj);
        new Utilitarios().limparTela(jPdados);

    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluir1ActionPerformed
        //Função Excluir//

        Fornecedores obj = new Fornecedores();

        obj.setId(Integer.parseInt(jtxCodigo.getText()));
        FornecedoresDAO dao = new FornecedoresDAO();

        dao.excluirFornecedores(obj);
        new Utilitarios().limparTela(jPdados);
       


    }//GEN-LAST:event_jBExcluir1ActionPerformed

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        
        new Utilitarios().limparTela(jPdados);

    }//GEN-LAST:event_jBNovoActionPerformed
    private void txtcepkeyPressed(java.awt.event.KeyEvent evt) {
        String nome = "%" + jtxPesquisa.getText() + "%";
    }
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        //Botão Pesquisar//
        String nome = "%" + jtxPesquisa.getText() + "%";

        FornecedoresDAO dao = new  FornecedoresDAO();
        List<Fornecedores> lista = dao.BuscarFornecedoresPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jtxPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxPesquisaActionPerformed

    private void jtxPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxPesquisaKeyPressed
        String nome = "%" + jtxPesquisa.getText() + "%";

         FornecedoresDAO dao = new  FornecedoresDAO();
        List<Fornecedores> lista = dao.BuscarFornecedoresPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFornecedores.getModel();
        dados.setNumRows(0);
        for (Fornecedores c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }//GEN-LAST:event_jtxPesquisaKeyPressed

    private void jtxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCodigoActionPerformed

    private void pesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar2ActionPerformed
        // Botão buscar fornecedor  por CNPJ

        String cnpj = jtxcnpj.getText();
        Fornecedores obj = new Fornecedores();
        FornecedoresDAO dao = new FornecedoresDAO();
        obj = dao.consultarFornecedores(cnpj);
        
        //exibir dados do objeto na tela //
        jtxCodigo.setText(String.valueOf(obj.getId()));
        jTxNome.setText(obj.getNome());
        jtxcnpj.setText(obj.getCnpj());
        jtxemail.setText(obj.getEmail());
        jtxcel.setText(obj.getCelular());
        jtxtel.setText(obj.getTelefone());
        jtxCEP.setText(obj.getCep());
        jtxendereco.setText(obj.getEndereco());
        jtxnumero.setText(String.valueOf(obj.getNumero()));
        jtxcomplemento.setText(obj.getComplemento());
        jtxbairro.setText(obj.getBairro());
        jtxcidade.setText(obj.getCidade());
        jcbuf.setSelectedItem(obj.getUf());


    }//GEN-LAST:event_pesquisar2ActionPerformed

    private void jtxCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxCEPKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
	
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = jtxCEP.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
			SAXReader xml = new SAXReader();
			 Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					jtxcidade.setText(element.getText());
                                }
					if (element.getQualifiedName().equals("bairro")) {
						jtxbairro.setText(element.getText());
					}
					if (element.getQualifiedName().equals("uf")) {
						jcbuf.setSelectedItem(element.getText());
					}
                                        if (element.getQualifiedName().equals("tipo_logradouro")) {
						tipoLogradouro = element.getText();
					}
                                        if (element.getQualifiedName().equals("logradouro")) {
						logradouro = element.getText();
                                        }
                                        if (element.getQualifiedName().equals("resultado")) {
						resultado = element.getText();
                                                if(resultado.equals("1")){
                                                
                                                }else{
                                                    JOptionPane.showMessageDialog(null, "CEP NÃO ENCONTRADO");
                                           
                                                }
                                                
                                        }
                                        

			}
                        jtxendereco.setText(tipoLogradouro+" "+logradouro);
			
			
			
		} catch (Exception e) {
			System.out.print(e);
		}

        }
        

    }//GEN-LAST:event_jtxCEPKeyPressed

    private void jBNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNovo1ActionPerformed

    private void jBsalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalvar1ActionPerformed

    private void jBEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEditar1ActionPerformed

    private void jBExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluir2ActionPerformed

    private void jtxCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCEPActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmfornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmfornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmfornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmfornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmfornecedores().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Jdados;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBEditar1;
    private javax.swing.JButton jBExcluir1;
    private javax.swing.JButton jBExcluir2;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBNovo1;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JButton jBsalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPdados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxNome;
    private javax.swing.JComboBox<String> jcbuf;
    private javax.swing.JFormattedTextField jtxCEP;
    private javax.swing.JTextField jtxCodigo;
    private javax.swing.JTextField jtxPesquisa;
    private javax.swing.JTextField jtxbairro;
    private javax.swing.JFormattedTextField jtxcel;
    private javax.swing.JTextField jtxcidade;
    private javax.swing.JFormattedTextField jtxcnpj;
    private javax.swing.JTextField jtxcomplemento;
    private javax.swing.JTextField jtxemail;
    private javax.swing.JTextField jtxendereco;
    private javax.swing.JTextField jtxnumero;
    private javax.swing.JFormattedTextField jtxtel;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JButton pesquisar2;
    private javax.swing.JTable tabelaFornecedores;
    // End of variables declaration//GEN-END:variables
}
