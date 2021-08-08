package universidade.dados;

/*@author Rian Santos (RiandSantos - GitHub)
*/

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class UsuarioDao {

    private Connection conn;
    private PreparedStatement st;
    private ResultSet rs;
    private final String URL = "jdbc:mysql://localhost/empresa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER = "root";
    private final String SENHA = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public boolean conectar() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, SENHA);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            /*JOptionPane.showMessageDialog(null, ex.getMessage());Retorna o erro*/
            return false;
        }
    }

    public int salvarUsuario(Usuario usu) {
        try {
            String sql = "INSERT INTO USUARIO VALUES (?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, usu.getemail_user());
            st.setString(2, usu.getnome_user());
            st.setString(3, usu.gettelefone_user());
            st.setString(4, usu.getlogin_user());
            st.setString(5, usu.getsenha_user());
            st.executeUpdate();//Executa o INSERT
            return 1;
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, x.getErrorCode());
            if (x.getErrorCode() == 1062) {
                return 1062;//duplicação de chave
            } else {
                return 1000;//erro qualquer
            }
        }
    }

    public Usuario logar(String u, String s) {
        try {
            String sql = "SELECT nome_user FROM usuario WHERE login_user=? AND senha_user=?";
            st = conn.prepareStatement(sql);
            st.setString(1, u);
            st.setString(2, s);
            rs = st.executeQuery();
            if (rs.next()) {
                Usuario usu = new Usuario();
                usu.setnome_user(rs.getString("nome_user"));
                return usu;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }
}
