package universidade.dados;

/*@author Rian Santos (RiandSantos - GitHub)
*/

public class Usuario {

    private String email_user;
    private String nome_user;
    private String telefone_user;
    private String login_user;
    private String senha_user;

    public Usuario() {
    }

    public String getemail_user() {
        return email_user;
    }

    public void setemail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getnome_user() {
        return nome_user;
    }

    public void setnome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String gettelefone_user() {
        return telefone_user;
    }

    public void settelefone_user(String telefone_user) {
        this.telefone_user = telefone_user;
    }

    public String getlogin_user() {
        return login_user;
    }

    public void setlogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getsenha_user() {
        return senha_user;
    }

    public void setsenha_user(String senha_user) {
        this.senha_user = senha_user;
    }
}
