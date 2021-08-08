package universidade.view;

import javax.swing.JOptionPane;
import universidade.dados.Usuario;
import universidade.dados.UsuarioDao;

/**
 *
 * @author Rian Santos (RiandSantos - GitHub)
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmCadastre = new javax.swing.JMenuItem();
        itmRecuperarSenha = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Universitario");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(204, 204, 204));
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        pnlLogin.setLayout(null);

        jLabel2.setText("Usuraio");
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(30, 40, 70, 20);

        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.add(txtUsuario);
        txtUsuario.setBounds(90, 40, 190, 20);

        jLabel4.setText("Senha");
        pnlLogin.add(jLabel4);
        jLabel4.setBounds(30, 80, 70, 20);

        txtSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLogin.add(txtSenha);
        txtSenha.setBounds(90, 80, 190, 20);

        btnEntrar.setBackground(new java.awt.Color(204, 204, 204));
        btnEntrar.setMnemonic('E');
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnEntrar);
        btnEntrar.setBounds(90, 160, 130, 40);

        getContentPane().add(pnlLogin);
        pnlLogin.setBounds(40, 30, 310, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidade/icons/xp.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 280);

        jMenu1.setText("Configurações");

        itmCadastre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastre.setBackground(java.awt.Color.lightGray);
        itmCadastre.setText("Cadastre-se");
        itmCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastreActionPerformed(evt);
            }
        });
        jMenu1.add(itmCadastre);

        itmRecuperarSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRecuperarSenha.setBackground(java.awt.Color.lightGray);
        itmRecuperarSenha.setText("Recuperar Senha");
        itmRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRecuperarSenhaActionPerformed(evt);
            }
        });
        jMenu1.add(itmRecuperarSenha);
        jMenu1.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setBackground(java.awt.Color.lightGray);
        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        jMenu1.add(itmSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastreActionPerformed
        TelaUsuario tela = new TelaUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_itmCadastreActionPerformed

    private void itmRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRecuperarSenhaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "<html>Essa função ainda não foi implementada,\n<html><b>Lamentamos Muito :(</b>", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_itmRecuperarSenhaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        //Verifica se os campos estão em branco
        if (txtUsuario.getText().trim().equals("") || txtSenha.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this.pnlLogin, "<html>O preenchimento de <b>todos</b> os campos são Obrigatórios", "Error", JOptionPane.ERROR_MESSAGE);
        //Se estiverem preenchidos inicia a conexão com o banco de dados
        } else {
            UsuarioDao dao = new UsuarioDao();
            boolean status = dao.conectar();
            if (status == true) { // conectou com o BD
                Usuario usu = dao.logar(txtUsuario.getText(), txtSenha.getText());
                if (usu == null) { // não achou usuário
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
                } else { // achou o usuário
                    TelaMenu tela = new TelaMenu(usu.getnome_user());
                    tela.setVisible(true);
                    dispose();
                }
            } else { // não conectou com o BD
                JOptionPane.showMessageDialog(null, "Erro na conexão");
            }
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itmSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JMenuItem itmCadastre;
    private javax.swing.JMenuItem itmRecuperarSenha;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
