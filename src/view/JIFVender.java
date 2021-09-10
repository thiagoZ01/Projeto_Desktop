/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.ClienteData;
import data.ProdutoData;
import data.VendaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.VendaProduto;

/**
 *
 * @author Thiago
 */
public class JIFVender extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFVender
     */
    private ProdutoData DAOProduto;
    private ClienteData DAOCliente;
    private VendaData DAOVenda;
    private Venda obj;
    
    public JIFVender() throws SQLException {
        
        initComponents();
        try {
            DAOVenda = new VendaData();
            DAOCliente = new ClienteData();
            DAOProduto = new ProdutoData();
            jbRemover.setEnabled(false);
            jbComprar.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JIFVender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlIconePiano = new javax.swing.JLabel();
        jlIconeSaxofone = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlCodigoProduto = new javax.swing.JLabel();
        jlNomeProduto = new javax.swing.JLabel();
        jlPrecoProduto = new javax.swing.JLabel();
        jlCodigoVenda = new javax.swing.JLabel();
        jlCodigoCliente = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JTextField();
        jtfNomeProduto = new javax.swing.JTextField();
        jtfPrecoProduto = new javax.swing.JTextField();
        jtfCodigoVenda = new javax.swing.JTextField();
        jtfCodigoCliente = new javax.swing.JTextField();
        jtfNomeCliente = new javax.swing.JTextField();
        jbAdicionar = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jbComprar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlIconePiano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/piano-de-cauda.png"))); // NOI18N
        getContentPane().add(jlIconePiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 73, 79));

        jlIconeSaxofone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/saxofone.png"))); // NOI18N
        getContentPane().add(jlIconeSaxofone, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 72, 79));

        jlTitulo.setFont(new java.awt.Font("SimSun", 3, 56)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 102, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("MUSIC SHOP");
        getContentPane().add(jlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 342, 61));

        jlCodigoProduto.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlCodigoProduto.setText("Código do Produto");
        getContentPane().add(jlCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jlNomeProduto.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlNomeProduto.setText("Nome do Produto");
        getContentPane().add(jlNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jlPrecoProduto.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlPrecoProduto.setText("Preço do Produto");
        getContentPane().add(jlPrecoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 150, -1));

        jlCodigoVenda.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlCodigoVenda.setText("Código da Venda");
        getContentPane().add(jlCodigoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jlCodigoCliente.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlCodigoCliente.setText("Código do Cliente");
        getContentPane().add(jlCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 160, -1));

        jlNomeCliente.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jlNomeCliente.setText("Nome do Cliente");
        getContentPane().add(jlNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 134, -1, 20));

        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyReleased(evt);
            }
        });
        getContentPane().add(jtfCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 153, -1));

        jtfNomeProduto.setEditable(false);
        getContentPane().add(jtfNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 120, -1));

        jtfPrecoProduto.setEditable(false);
        getContentPane().add(jtfPrecoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 140, -1));
        getContentPane().add(jtfCodigoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, -1));

        jtfCodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoClienteKeyReleased(evt);
            }
        });
        getContentPane().add(jtfCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 140, -1));

        jtfNomeCliente.setEditable(false);
        getContentPane().add(jtfNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, -1));

        jbAdicionar.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cesta.png"))); // NOI18N
        jbAdicionar.setText("Adicionar Produto");
        jbAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 190, 100));

        jbRemover.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jbRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remover-do-carrinho.png"))); // NOI18N
        jbRemover.setText("Remover Produto");
        jbRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jbRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 190, 100));

        jbComprar.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jbComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar-ao-carrinho.png"))); // NOI18N
        jbComprar.setText("VENDER");
        jbComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbComprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });
        getContentPane().add(jbComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 186, 100));

        jbSair.setFont(new java.awt.Font("SimSun", 0, 22)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, 70));

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Produto", "Nome do Produto", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 520, 106));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        if(validaItem()){
            JOptionPane.showMessageDialog(this, "ITEM JA ADICIONADO", "MEU SISTEMA", JOptionPane.WARNING_MESSAGE);
            jtfCodigoProduto.setText("");
            jtfNomeProduto.setText("");
            jtfPrecoProduto.setText("");
            return;
        }
        DefaultTableModel mp = (DefaultTableModel)jtbDados.getModel();
        mp.addRow(new String[] {jtfCodigoProduto.getText(),jtfNomeProduto.getText(),jtfPrecoProduto.getText()});
        jbComprar.setEnabled(true);
        jtfCodigoProduto.setText("");
        jtfNomeProduto.setText("");
        jtfPrecoProduto.setText("");
        
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jtfCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyReleased
        try {
            Produto pesquisaP = DAOProduto.produto(Integer.parseInt(jtfCodigoProduto.getText()));
            if(pesquisaP == null){
                jtfNomeProduto.setText("");
                jtfPrecoProduto.setText("");
            }
            else{
                jtfNomeProduto.setText(pesquisaP.getNome());
                jtfPrecoProduto.setText(String.valueOf(pesquisaP.getPreco()));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtfCodigoProdutoKeyReleased

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed
        try {
            if(preencherObjeto()){
                DAOVenda.incluir(obj);
                JOptionPane.showMessageDialog(this, "VENDIDO COM SUCESSO", "MEU SISTEMA", JOptionPane.INFORMATION_MESSAGE);
                jtfCodigoVenda.setText("");
                jtfCodigoCliente.setText("");
                jtfNomeCliente.setText("");
                jtfCodigoProduto.setText("");
                jtfNomeProduto.setText("");
                jtfPrecoProduto.setText("");
                DefaultTableModel mp = (DefaultTableModel)jtbDados.getModel();
                mp.setRowCount(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO NO SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbComprarActionPerformed

    private void jtfCodigoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoClienteKeyReleased
        try {
            Cliente pesquisaCli = DAOCliente.pesquisaCli(Integer.parseInt(jtfCodigoCliente.getText()));
            if(pesquisaCli == null){
                jtfNomeCliente.setText("");
                }
            else{
                jtfNomeCliente.setText(pesquisaCli.getNome());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jtfCodigoClienteKeyReleased

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        int linha = jtbDados.getSelectedRow();
        if(linha>-1){
             jbRemover.setEnabled(true);
        }
        else{
            jbRemover.setEnabled(false);
        }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        int linha = jtbDados.getSelectedRow();
        if(linha>-1){
            DefaultTableModel mp = (DefaultTableModel)jtbDados.getModel();
            mp.removeRow(linha);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private boolean preencherObjeto()throws Exception{
        obj = new Venda();
        obj.setCodigo_vendas(Integer.parseInt(jtfCodigoVenda.getText()));
        obj.setCodigo_cliente(Integer.parseInt(jtfCodigoCliente.getText()));
        obj.setNome_cliente(jtfNomeCliente.getText());
        for(int i =0; i<jtbDados.getRowCount();i++){
            VendaProduto item = new VendaProduto();
            item.setCodigo_produto(Integer.parseInt(jtbDados.getValueAt(i, 0).toString()));
            item.setNome_produto(jtbDados.getValueAt(i, 1).toString());
            item.setPreco_produto(Double.parseDouble(jtbDados.getValueAt(i, 2).toString()));
            obj.addItem(item);
        }
        return true;
    }
    private boolean validaItem(){
        for(int i =0; i<jtbDados.getRowCount();i++){
            String codigo = jtbDados.getValueAt(i, 0).toString();
            if(jtfCodigoProduto.getText().equals(codigo))
                return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlCodigoCliente;
    private javax.swing.JLabel jlCodigoProduto;
    private javax.swing.JLabel jlCodigoVenda;
    private javax.swing.JLabel jlIconePiano;
    private javax.swing.JLabel jlIconeSaxofone;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlPrecoProduto;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtbDados;
    private javax.swing.JTextField jtfCodigoCliente;
    private javax.swing.JTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfCodigoVenda;
    private javax.swing.JTextField jtfNomeCliente;
    private javax.swing.JTextField jtfNomeProduto;
    private javax.swing.JTextField jtfPrecoProduto;
    // End of variables declaration//GEN-END:variables

}