
package Formularios;

import Classes.Dados;
import Classes.Produto;
import Classes.Usuario;
import Classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmProdutos extends javax.swing.JInternalFrame {

    private Dados msDados;
    private int ProAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPreço = new javax.swing.JTextField();
        txtIDProduto = new javax.swing.JTextField();
        txtDescrição = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbImposto = new javax.swing.JComboBox<>();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotação = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Produtos");
        setEnabled(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("ID Produto :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Descrição :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Preço :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Anotação :");

        txtPreço.setEnabled(false);

        txtIDProduto.setEnabled(false);

        txtDescrição.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Imposto :");

        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%", "20%" }));
        cmbImposto.setEnabled(false);

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next-step.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Navegar para o primeiro cadastro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow (1).png"))); // NOI18N
        btnAnterior.setToolTipText("Navegar para o cadastro anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next-step (1).png"))); // NOI18N
        btnProximo.setToolTipText("Navegar para o proximo cadastro");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow.png"))); // NOI18N
        btnUltimo.setToolTipText("Navegar para o ultimo cadsatro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar cadastro.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar cadastro");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editar cadastro.png"))); // NOI18N
        btnEditar.setToolTipText("Editar cadastro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir cadastro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pesquisar cadastro.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar cadastro");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Novo cadastro.png"))); // NOI18N
        btnNovo.setToolTipText("Adicionar novo cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adicionar-ao-carrinho.png"))); // NOI18N
        jLabel7.setText(":");

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        txtAnotação.setColumns(20);
        txtAnotação.setRows(5);
        jScrollPane2.setViewportView(txtAnotação);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescrição, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbImposto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPrimeiro)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAnterior)
                        .addComponent(btnProximo))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        //habilitar caixas de textos
        
        txtIDProduto.setEnabled(true);
        txtDescrição.setEnabled(true);
        txtPreço.setEnabled(true);
        txtAnotação.setEnabled(true);
        cmbImposto.setEnabled(true);
        
        //limpar as caixas de textos
        
        txtIDProduto.setText("");
        txtDescrição.setText("");
        txtPreço.setText("");
        txtAnotação.setText("");
        cmbImposto.setSelectedIndex(0);
        
        novo = true;
        
        txtIDProduto.requestFocus();
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIDProduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID");
            txtIDProduto.requestFocusInWindow();
            return;
        }
        
         if(cmbImposto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar um valor");
            cmbImposto.requestFocusInWindow();
            return;
        }
         
          if(txtDescrição.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma descrição");
            txtDescrição.requestFocusInWindow();
            return;
        }
          
           if(txtPreço.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar o preço");
            txtPreço.requestFocusInWindow();
            return;
        }
           
           int preco = Integer.parseInt(txtPreço.getText());
            if(preco <= 0){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um número maior que zero");
            txtPreço.requestFocusInWindow();
            return;
        }
           if(!Utilidades.isNumeric(txtPreço.getText())){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar somente números");
            txtPreço.requestFocusInWindow();
            return;
        }
                           
             int pos = msDados.posicaoProduto(txtIDProduto.getText());
             if(novo){
             if(pos!=-1){
                JOptionPane.showMessageDialog(rootPane, "ESTE PRODUTO JÁ EXISTE");
                txtIDProduto.requestFocusInWindow();
                return;
             }
             }else{
                 if(pos == -1){
                JOptionPane.showMessageDialog(rootPane, "Este produto ainda não existe");
                txtIDProduto.requestFocusInWindow();
                return;
                 }
             }
             
             Produto mProduto = new Produto(
                     txtIDProduto.getText(), 
                     txtDescrição.getText(),
                     preco,
                     cmbImposto.getSelectedIndex(),
                     txtAnotação.getText());
                     
             String msg;
             if(novo){
                 msg = msDados.adicionarProduto(mProduto);
             }else{
                 msg = msDados.editarProduto(mProduto, pos);    
                  }

                 JOptionPane.showMessageDialog(rootPane, msg);
             
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //desabilitar os campos
        
        txtIDProduto.setEnabled(false);
        txtDescrição.setEnabled(false);
        txtPreço.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtAnotação.setEnabled(false);
        
        preencherTabela();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false); 
        
        //desabilitar os campos
        
        txtIDProduto.setEnabled(false);
        txtDescrição.setEnabled(false);
        txtPreço.setEnabled(false);
        cmbImposto.setEnabled(false);
        txtAnotação.setEnabled(false);
        
        //limpar as caixas de textos
        
        txtIDProduto.setText("");
        txtDescrição.setText("");
        txtPreço.setText("");
        txtAnotação.setText("");
        cmbImposto.setSelectedIndex(0);
        
        novo = true;
        
        txtIDProduto.requestFocus();
       
        preencherTabela();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        //habilitar caixas de textos
        
        txtDescrição.setEnabled(true);
        txtPreço.setEnabled(true);
        cmbImposto.setEnabled(true);
        txtAnotação.setEnabled(true);
        
        
        novo = false;    
        txtAnotação.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        preencherTabela();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        ProAtual = 0;
        mostrarRegistro();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        ProAtual = msDados.numeroProdutos()-1;
        mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        ProAtual++;
        if(ProAtual == msDados.numeroProdutos()){
            ProAtual = 0;
        }
        
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        ProAtual --;
        if(ProAtual == -1){
            ProAtual = msDados.numeroProdutos()-1;
        }
        
        mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este cadastro?");
        if(resposta != 0){
            return;
        }
        String msg;
        msg = msDados.deletarProduto(ProAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        ProAtual = 0;
        mostrarRegistro();
        preencherTabela();
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Favor INSERIR o código do produto");
        if(produto.equals("")){
            return;
        }
        int pos = msDados.posicaoProduto(produto);
        if(pos == -1){
            JOptionPane.showMessageDialog(rootPane, "Este produto não existe");
            return;
        }
           ProAtual = pos;
           mostrarRegistro();
        
    }//GEN-LAST:event_btnPesquisarActionPerformed
    private void mostrarRegistro(){
        txtIDProduto.setText(msDados.getProdutos()[ProAtual].getIdProduto());
        txtDescrição.setText(msDados.getProdutos()[ProAtual].getDescricao());
        txtPreço.setText("" + msDados.getProdutos()[ProAtual].getPreco());
        txtAnotação.setText(msDados.getProdutos()[ProAtual].getAnotacao());
        cmbImposto.setSelectedIndex(msDados.getProdutos()[ProAtual].getImposto());
    }
    private void preencherTabela(){
        String titulos[] = {"ID Produto","Desc","Preço","Imposto","Anotação"};
        String registro[] = new String [5];
        mTabela = new DefaultTableModel(null, titulos);
        for(int i = 0; i< msDados.numeroProdutos(); i++){
            registro[0] = msDados.getProdutos()[i].getIdProduto();
            registro[1] = msDados.getProdutos()[i].getDescricao();
            registro[2] = "" + msDados.getProdutos()[i].getPreco();
            registro[3] = imposto ( msDados.getProdutos()[i].getImposto());
            registro[4] = msDados.getProdutos()[i].getAnotacao();

            
            mTabela.addRow(registro);
           
        }
        
        tblTabela.setModel(mTabela);
    }
        private String imposto (int idIMPOSTO){
            switch (idIMPOSTO){
                case 0: return "0%";
                case 1: return "10%";
                case 2: return "15%";
                case 3: return "20%";
                default: return "Não Definido";
            }
        }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextArea txtAnotação;
    private javax.swing.JTextField txtDescrição;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreço;
    // End of variables declaration//GEN-END:variables
}
