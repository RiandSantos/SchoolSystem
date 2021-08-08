package universidade.view;

import javax.swing.JOptionPane;
import universidade.dados.Aluno;
import universidade.dados.AlunoDao;

/**
 *
 * @author Rian Santos (RiandSantos - GitHub)
 */
public class TelaAlterarAluno extends javax.swing.JFrame {

    public TelaAlterarAluno(String ra, String nome, String email, String tel) {
        initComponents();
        txtRa.setText(ra);
        txtNome.setText(nome);
        txtEmail.setText(email);
        txtTelefone.setText(tel);
        txtRa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRa = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnAlterarAluno = new javax.swing.JButton();
        lblSaudacao = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Dados do Aluno");
        setResizable(false);
        getContentPane().setLayout(null);

        lblRa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa.setForeground(new java.awt.Color(255, 255, 255));
        lblRa.setText("RA");
        getContentPane().add(lblRa);
        lblRa.setBounds(10, 66, 100, 30);

        txtRa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRa);
        txtRa.setBounds(130, 66, 290, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(130, 114, 290, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 116, 100, 30);

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(10, 166, 100, 30);

        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(128, 167, 180, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(128, 217, 200, 30);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(10, 216, 100, 30);

        btnAlterarAluno.setBackground(new java.awt.Color(217, 216, 216));
        btnAlterarAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterarAluno.setText("Alterar");
        btnAlterarAluno.setToolTipText("");
        btnAlterarAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarAluno);
        btnAlterarAluno.setBounds(400, 250, 100, 40);

        lblSaudacao.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaudacao.setText("Alterar Aluno");
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(10, 11, 489, 44);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setText("<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 11, 73, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidade/icons/classroom.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 310);

        setSize(new java.awt.Dimension(533, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlunoActionPerformed
        if (btnAlterarAluno.getText().equalsIgnoreCase("Limpar")) {
            btnAlterarAluno.setText("Alterar");
        } else {   // que está escrito Salvar no botão
            // encapsular os dados do form no obj alu
            Aluno alu = new Aluno();
            alu.setra_aluno(txtRa.getText());
            alu.setnome_aluno(txtNome.getText());
            alu.settelefone_aluno(txtTelefone.getText());
            alu.setemail_aluno(txtEmail.getText());

            // Conectar com o BD
            AlunoDao dao = new AlunoDao();
            boolean status = dao.conectar();
            if (status == false) {
                JOptionPane.showMessageDialog(null, "Erro na conexão");
            } else { // status <-- true
                boolean resposta = dao.alterarAluno(alu);
                if (resposta == true) {
                    JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso");
                } else if (resposta == false) {
                    JOptionPane.showMessageDialog(null, "Esse RA já está cadastrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na gravação. Contate o administrador do sistema.");
                }
            }
        }
        TelaAluno tela = new TelaAluno();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlterarAlunoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaAluno ta = new TelaAluno();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAluno;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void LimparCamposAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
