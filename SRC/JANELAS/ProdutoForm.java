/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import produto.GerenciarProduto;
import produto.Produto;

/**
 *
 * @author IFPR
 */
public class ProdutoForm extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoForm
     * @param parent
     * @param modal
     */
    public ProdutoForm(java.awt.Frame parent, boolean modal, GerenciarProduto gerProduto){
        //super(parent, modal);
        initComponents();
        this.gerProduto = gerProduto;
        mensagemLB.setVisible(false);
       sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeLB = new javax.swing.JLabel();
        dataFabricacaoLB = new javax.swing.JLabel();
        validadeLB = new javax.swing.JLabel();
        quantidadeLB = new javax.swing.JLabel();
        precoLB = new javax.swing.JLabel();
        salvarBT = new javax.swing.JButton();
        cancelarBT = new javax.swing.JButton();
        validadeTF = new javax.swing.JTextField();
        quantidadeTF = new javax.swing.JTextField();
        precoTF = new javax.swing.JTextField();
        dataFabricacaoTF = new javax.swing.JFormattedTextField();
        mensagemLB = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/48x48.png"))); // NOI18N
        jLabel1.setText("Dados do Produto");

        nomeLB.setText("Nome:");

        dataFabricacaoLB.setText("Data de Fabricação:");

        validadeLB.setText("Validade:");

        quantidadeLB.setText("Quantidade:");

        precoLB.setText("Preço:");

        salvarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/filesave.png"))); // NOI18N
        salvarBT.setText("Salvar");
        salvarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBTActionPerformed(evt);
            }
        });

        cancelarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel.png"))); // NOI18N
        cancelarBT.setText("Cancelar");
        cancelarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTActionPerformed(evt);
            }
        });

        try {
            dataFabricacaoTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFabricacaoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFabricacaoTFActionPerformed(evt);
            }
        });

        mensagemLB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mensagemLB.setForeground(new java.awt.Color(255, 51, 51));
        mensagemLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/agt_update_critical.png"))); // NOI18N
        mensagemLB.setText("Campo(s) com preenchimento incorreto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(salvarBT)
                .addGap(18, 18, 18)
                .addComponent(cancelarBT)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataFabricacaoLB)
                            .addComponent(nomeLB))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataFabricacaoTF)
                            .addComponent(nomeTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validadeLB)
                            .addComponent(quantidadeLB)
                            .addComponent(precoLB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validadeTF)
                            .addComponent(precoTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantidadeTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mensagemLB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelarBT, salvarBT});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFabricacaoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFabricacaoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validadeLB)
                    .addComponent(validadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLB)
                    .addComponent(quantidadeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLB)
                    .addComponent(precoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(mensagemLB)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBT)
                    .addComponent(cancelarBT))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dataFabricacaoTF, precoTF, quantidadeTF, validadeTF});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTActionPerformed
        // TODO add your handling code here:
        limpar();
        dispose();
    }//GEN-LAST:event_cancelarBTActionPerformed

    private void limpar(){
        nomeTF.setText("");
        nomeLB.setForeground(Color.BLACK);
        
        dataFabricacaoTF.setText("");
        dataFabricacaoLB.setForeground(Color.BLACK);
        
        quantidadeTF.setText("");
        quantidadeLB.setForeground(Color.BLACK);
        
        validadeTF.setText("");
        validadeLB.setForeground(Color.BLACK);
        
        precoTF.setText("");
        precoLB.setForeground(Color.BLACK);
        
        mensagemLB.setVisible(false);
    }
    
    private void salvarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBTActionPerformed
        // TODO add your handling code here:
        if(validarForm()){
            produto.setNome(nomeTF.getText().trim());
            Date dataFab;
            try{
                dataFab = sdf.parse(dataFabricacaoTF.getText().trim());
                produto.setDataFabricacao(dataFab);
            }catch(ParseException ex){
                //data invalida
                //mortrar msg de erro na data 
            }
            int qtd = Integer.parseInt((quantidadeTF.getText().trim()));
            produto.setQuantidade(qtd);
            int validade = Integer.parseInt(validadeTF.getText().trim());
            produto.setValidade(validade);
            BigDecimal preco = new BigDecimal(precoTF.getText().trim());
            produto.setPreco(preco);

            if(produto.getId() > 0 ){
                gerProduto.update(produto);
            }else{
            gerProduto.create(produto);
            }
            limpar();
            dispose();
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso");
            
        }else{
            
            mensagemLB.setVisible(true);
            //msg erro
        }
    }//GEN-LAST:event_salvarBTActionPerformed

    private void dataFabricacaoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFabricacaoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFabricacaoTFActionPerformed
        public void objectToForm(){
        
         nomeTF.setText(produto.getNome());
         dataFabricacaoTF.setText(sdf.format(produto.getDataFabricacao()));
         validadeTF.setText(""+produto.getValidade());
         quantidadeTF.setText(""+produto.getQuantidade());
         precoTF.setText(produto.getPreco().toString());
        
        }
        private boolean validarForm(){
           boolean isValid = true;
            
           if(nomeTF.getText().trim().equals("")){
               
               isValid = false;
               nomeLB.setForeground(Color.RED);
           }else{
               nomeLB.setForeground(Color.BLACK);
           }
           if(dataFabricacaoTF.getText().trim().length() != 10){
               isValid = false;
               dataFabricacaoLB.setForeground(Color.RED);
           }else{
               dataFabricacaoLB.setForeground(Color.BLACK);
           }
           if(validadeTF.getText().trim().equals("")){
               isValid = false;
               validadeLB.setForeground(Color.RED);
           }else{
               validadeLB.setForeground(Color.BLACK);
           }
           if(quantidadeTF.getText().trim().equals("")){
            isValid = false;
            quantidadeLB.setForeground(Color.RED);       
           
           }else{
               quantidadeLB.setForeground(Color.BLACK);
           }
            if(precoTF.getText().trim().equals("")){
            isValid = false;
            precoLB.setForeground(Color.RED);       
           }else{
               precoLB.setForeground(Color.BLACK);
            }
           return isValid;
        }
            public void setProduto(Produto produto) {
                this.produto = produto;
                }
        
        
        
        private GerenciarProduto gerProduto;
        private Produto produto;
        SimpleDateFormat sdf;
        
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBT;
    private javax.swing.JLabel dataFabricacaoLB;
    private javax.swing.JFormattedTextField dataFabricacaoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mensagemLB;
    private javax.swing.JLabel nomeLB;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JLabel precoLB;
    private javax.swing.JTextField precoTF;
    private javax.swing.JLabel quantidadeLB;
    private javax.swing.JTextField quantidadeTF;
    private javax.swing.JButton salvarBT;
    private javax.swing.JLabel validadeLB;
    private javax.swing.JTextField validadeTF;
    // End of variables declaration//GEN-END:variables
}