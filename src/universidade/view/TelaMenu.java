package universidade.view;

/**
 *
 * @author Rian Santos (RiandSantos - GitHub)
 */
public class TelaMenu extends javax.swing.JFrame {

    public String nomeUsuario;
    
    public TelaMenu(String nomeUsuario) {
        initComponents();
        lblSaudacao.setText("Olá "+ nomeUsuario +", seja bem-vindo(a)");
        this.nomeUsuario = nomeUsuario;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        btnNotas = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnProfessores = new javax.swing.JButton();
        lblWall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal de Acesso");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        lblSaudacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(0, 20, 478, 25);

        btnNotas.setText("Controle de Notas");
        getContentPane().add(btnNotas);
        btnNotas.setBounds(120, 240, 256, 36);

        btnCursos.setText("Controle de Cursos");
        getContentPane().add(btnCursos);
        btnCursos.setBounds(120, 190, 256, 30);

        btnAlunos.setText("Controle de Alunos");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlunos);
        btnAlunos.setBounds(120, 100, 256, 38);

        btnProfessores.setText("Controle de Professores");
        getContentPane().add(btnProfessores);
        btnProfessores.setBounds(120, 150, 256, 32);

        lblWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidade/icons/classroom.jpg"))); // NOI18N
        getContentPane().add(lblWall);
        lblWall.setBounds(0, 0, 490, 370);

        setSize(new java.awt.Dimension(494, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        TelaAluno ta = new TelaAluno();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlunosActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnProfessores;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JLabel lblWall;
    // End of variables declaration//GEN-END:variables
}
