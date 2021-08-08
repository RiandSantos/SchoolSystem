package universidade.dados;

/*@author Rian Santos (RiandSantos - GitHub)
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlunoDao {
    
    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;
    private final String URL = "jdbc:mysql://localhost:3306/empresa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER = "root";
    private final String SENHA = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public boolean conectar() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, SENHA);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public int salvarAluno(Aluno alu) {
        try {
            String sql = "INSERT INTO ALUNO VALUES (?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, alu.getra_aluno());
            st.setString(2, alu.getnome_aluno());
            st.setString(3, alu.gettelefone_aluno());
            st.setString(4, alu.getemail_aluno());
            st.executeUpdate(); // executa o INSERT
            return 1; // salvou
        } catch (SQLException x) {
            if (x.getErrorCode() == 1062) {
                return 1062; // duplicação de chave
            } else {
                return 1000; //erro qualquer             
            }
        }
    }

    public Aluno consultarAluno(String ra) {
        try {
            String sql = "SELECT * FROM aluno WHERE ra_aluno=?";
            st = conn.prepareStatement(sql);
            st.setString(1, ra);
            rs = st.executeQuery();
            if (rs.next()) { // se encontrou o RA
                Aluno alu = new Aluno();
                alu.setnome_aluno(rs.getString("nome_aluno"));
                alu.setemail_aluno(rs.getString("email_aluno"));
                alu.settelefone_aluno(rs.getString("telefone_aluno"));
                return alu;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public boolean ExcluirAluno(String ra) {
        try {
            String sql = "DELETE FROM aluno WHERE ra_aluno=?";
            st = conn.prepareStatement(sql);
            st.setString(1, ra);
            st.executeUpdate();
            return true;
        } catch (SQLException x) {
            return false;
        }
    }

    public boolean alterarAluno(Aluno alu) {
        try {
            String sql = "UPDATE aluno SET nome_aluno=?, telefone_aluno=?, email_aluno=? WHERE ra_aluno=?";
            st = conn.prepareStatement(sql);
            st.setString(1, alu.getnome_aluno());
            st.setString(2, alu.gettelefone_aluno());
            st.setString(3, alu.getemail_aluno());
            st.setString(4, alu.getra_aluno());
            st.executeUpdate(); // executa o update
            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar:" + ex, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
}