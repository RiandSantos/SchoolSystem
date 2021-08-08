package universidade.view;

import javax.swing.JOptionPane;
import universidade.dados.Aluno;
import universidade.dados.AlunoDao;

/**
 *
 * @author Rian Santos (RiandSantos - GitHub)
 */
public class TelaAluno extends javax.swing.JFrame {
    
    private String nomeUsuario2;

    public TelaAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundo = new javax.swing.JLabel();
        lblRa = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnExcluirAluno = new javax.swing.JButton();
        btnSalvarAluno = new javax.swing.JButton();
        btnAlterarAluno = new javax.swing.JButton();
        btnConsultarAluno = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblWall = new javax.swing.JLabel();

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidade/icons/classroom.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Alunos");
        setResizable(false);
        getContentPane().setLayout(null);

        lblRa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRa.setForeground(new java.awt.Color(255, 255, 255));
        lblRa.setText("RA");
        getContentPane().add(lblRa);
        lblRa.setBounds(10, 53, 100, 30);

        txtRa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRa);
        txtRa.setBounds(130, 53, 290, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(130, 101, 290, 30);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(10, 103, 110, 30);

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(10, 153, 100, 30);

        txtTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(128, 154, 180, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(128, 204, 200, 30);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(10, 203, 100, 30);

        btnExcluirAluno.setBackground(new java.awt.Color(217, 216, 216));
        btnExcluirAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirAluno.setText("Excluir");
        btnExcluirAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluirAluno.setEnabled(false);
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirAluno);
        btnExcluirAluno.setBounds(128, 252, 100, 40);

        btnSalvarAluno.setBackground(new java.awt.Color(217, 216, 216));
        btnSalvarAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvarAluno.setText("Salvar");
        btnSalvarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAluno);
        btnSalvarAluno.setBounds(10, 252, 100, 40);

        btnAlterarAluno.setBackground(new java.awt.Color(217, 216, 216));
        btnAlterarAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterarAluno.setText("Alterar");
        btnAlterarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterarAluno.setEnabled(false);
        btnAlterarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarAluno);
        btnAlterarAluno.setBounds(399, 252, 100, 40);

        btnConsultarAluno.setBackground(new java.awt.Color(217, 216, 216));
        btnConsultarAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarAluno.setText("Consultar");
        btnConsultarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarAluno);
        btnConsultarAluno.setBounds(281, 252, 100, 40);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setText("<");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(10, 11, 59, 31);

        lblTitle.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Consulta de Alunos");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(264, 10, 240, 30);

        lblWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidade/icons/classroom.jpg"))); // NOI18N
        getContentPane().add(lblWall);
        lblWall.setBounds(0, 0, 520, 320);

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

    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        String ra = txtRa.getText();
        AlunoDao dao = new AlunoDao();
        boolean status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro na conexão");
        } else { // status <-- true
            boolean resposta = dao.ExcluirAluno(ra);
            if (resposta == true) {
                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso");
                LimparCamposAluno();
                btnExcluirAluno.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro na exclusão");
            }
        }
        limparCamposAluno();
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        if (btnSalvarAluno.getText().equalsIgnoreCase("Limpar")) {
            limparCamposAluno();
            btnSalvarAluno.setText("Salvar");
            btnExcluirAluno.setEnabled(false);
            btnAlterarAluno.setEnabled(false);
        } else {  // que está escrito Salvar no botão
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
                int resposta = dao.salvarAluno(alu);
                if (resposta == 1) {
                    JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso");
                } else if (resposta == 1062) {
                    JOptionPane.showMessageDialog(null, "Esse RA já está cadastrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na gravação. Contate o administrador do sistema.");
                }
                limparCamposAluno();
            }
        }
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed
    private void limparCamposAluno() {
        txtRa.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }
    private void btnAlterarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAlunoActionPerformed
        // TODO add your handling code here:

        TelaAlterarAluno tela = new TelaAlterarAluno(txtRa.getText(), txtNome.getText(), txtEmail.getText(), txtTelefone.getText());
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAlterarAlunoActionPerformed

    private void btnConsultarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAlunoActionPerformed
        AlunoDao dao = new AlunoDao();
        boolean status = dao.conectar();
        if (status == true) { // conectou com o BD
            Aluno alu = dao.consultarAluno(txtRa.getText());
            if (alu == null) { // não achou o aluno
                JOptionPane.showMessageDialog(null, "Aluno não localizado");
            } else { // achou o usuário
                txtNome.setText(alu.getnome_aluno());
                txtEmail.setText(alu.getemail_aluno());
                txtTelefone.setText(alu.gettelefone_aluno());
                btnExcluirAluno.setEnabled(true);
                btnAlterarAluno.setEnabled(true);
                //btnSalvarAluno.setEnabled(false);
                btnSalvarAluno.setText("Limpar");
            }
        } else { // não conectou com o BD
            JOptionPane.showMessageDialog(null, "Erro na conexão");
        }


    }//GEN-LAST:event_btnConsultarAlunoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
       TelaMenu tm = new TelaMenu("");
       tm.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAluno;
    private javax.swing.JButton btnConsultarAluno;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRa;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWall;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void LimparCamposAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
