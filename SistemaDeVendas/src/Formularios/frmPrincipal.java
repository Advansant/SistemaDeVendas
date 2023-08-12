
package Formularios;

import Classes.BackGround;
import Classes.Dados;


public class frmPrincipal extends javax.swing.JFrame {
        private Dados msDados;
        private int perfil;
        private String senha;
        private String usuario;
        
        
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
        
                
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setDados(Dados msDados){
        this.msDados = msDados;
    }
    
    public void setPerfil(int perfil){
        this.perfil = perfil;
    }
    
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoTrocarSenha = new javax.swing.JMenuItem();
        mnuArquivoTrocarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosNovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRLdeVendas = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnDesk.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        mnuArquivo.setForeground(new java.awt.Color(0, 0, 51));
        mnuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Arquivos.png"))); // NOI18N
        mnuArquivo.setText("Arquivo");

        mnuArquivoClientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clientes.png"))); // NOI18N
        mnuArquivoClientes.setText("Cientes");
        mnuArquivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoClientesActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Produtos.png"))); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoProdutosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Usuarios.png"))); // NOI18N
        mnuArquivoUsuarios.setText("Usuarios");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);
        mnuArquivo.add(jSeparator1);

        mnuArquivoTrocarSenha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Trocar Senha.png"))); // NOI18N
        mnuArquivoTrocarSenha.setText("Trocar Senha");
        mnuArquivoTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarSenhaActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarSenha);

        mnuArquivoTrocarUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Trocar Usuario.png"))); // NOI18N
        mnuArquivoTrocarUsuario.setText("Trocar Usuario");
        mnuArquivoTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoTrocarUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoTrocarUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sair.png"))); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setForeground(new java.awt.Color(0, 0, 51));
        mnuMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Movimentos.png"))); // NOI18N
        mnuMovimentos.setText("Movimentos");

        mnuMovimentosNovaVenda.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuMovimentosNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nova Venda.png"))); // NOI18N
        mnuMovimentosNovaVenda.setText("Nova Venda");
        mnuMovimentosNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentosNovaVendaActionPerformed(evt);
            }
        });
        mnuMovimentos.add(mnuMovimentosNovaVenda);

        mnuMovimentosRLdeVendas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuMovimentosRLdeVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Relatorio de Venda.png"))); // NOI18N
        mnuMovimentosRLdeVendas.setText("Relatório de Vendas");
        mnuMovimentos.add(mnuMovimentosRLdeVendas);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setForeground(new java.awt.Color(0, 0, 51));
        mnuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ajuda.png"))); // NOI18N
        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sobre.png"))); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaSobreActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mnuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Informacao.png"))); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAjudaAjudaActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
        frmUsuarios mUsuarios = new frmUsuarios();
        mUsuarios.setDados(msDados);
         dpnDesk.add(mUsuarios);
         mUsuarios.show();
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

    private void mnuArquivoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoProdutosActionPerformed
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados(msDados);
         dpnDesk.add(msProdutos);
         msProdutos.show();
    }//GEN-LAST:event_mnuArquivoProdutosActionPerformed

    private void mnuArquivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoClientesActionPerformed
        frmClientes msClientes = new frmClientes();
        msClientes.setDados(msDados);
         dpnDesk.add(msClientes);
         msClientes.show();
    }//GEN-LAST:event_mnuArquivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround)dpnDesk).setImagen("/Images/LogoSemFundo.jpeg");
        
        if(perfil == 2){
            mnuArquivoClientes.setEnabled(false);
            mnuArquivoProdutos.setEnabled(false);
            mnuArquivoUsuarios.setEnabled(false);  
            mnuMovimentosRLdeVendas.setEnabled(false);
           
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        msDados.salvarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuArquivoTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarUsuarioActionPerformed
        this.setVisible(false);
        frmLogin mLogin = new frmLogin();
        mLogin.setDados(msDados);
        mLogin.setLocationRelativeTo(null);
        mLogin.setVisible(true);
    }//GEN-LAST:event_mnuArquivoTrocarUsuarioActionPerformed

    private void mnuArquivoTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoTrocarSenhaActionPerformed
        frmTrocarSenha msSenha = new frmTrocarSenha(this, rootPaneCheckingEnabled);
        msSenha.setLocationRelativeTo(null);
        msSenha.setSenha(senha);
        msSenha.setUsuario(usuario);
        msSenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuArquivoTrocarSenhaActionPerformed

    private void mnuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaSobreActionPerformed
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAjudaSobreActionPerformed

    private void mnuAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAjudaAjudaActionPerformed
        frmAjuda mAjuda = new frmAjuda(this, rootPaneCheckingEnabled);
        mAjuda.setLocationRelativeTo(this);
        mAjuda.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAjudaAjudaActionPerformed

    private void mnuMovimentosNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentosNovaVendaActionPerformed
        frmFatura mFatura = new frmFatura();
        mFatura.setDados(msDados);
        dpnDesk.add(mFatura);
        mFatura.show();
    }//GEN-LAST:event_mnuMovimentosNovaVendaActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoTrocarSenha;
    private javax.swing.JMenuItem mnuArquivoTrocarUsuario;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosNovaVenda;
    private javax.swing.JMenuItem mnuMovimentosRLdeVendas;
    // End of variables declaration//GEN-END:variables
}
