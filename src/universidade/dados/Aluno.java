package universidade.dados;

/*@author Rian Santos (RiandSantos - GitHub)
*/

public class Aluno {

    private String ra_aluno;
    private String nome_aluno;
    private String telefone_aluno;
    private String email_aluno;

    public Aluno() {

    }

    public String getra_aluno() {
        return ra_aluno;
    }

    public void setra_aluno(String ra_aluno) {
        this.ra_aluno = ra_aluno;
    }

    public String getnome_aluno() {
        return nome_aluno;
    }

    public void setnome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String gettelefone_aluno() {
        return telefone_aluno;
    }

    public void settelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public String getemail_aluno() {
        return email_aluno;
    }

    public void setemail_aluno(String email_aluno) {
        this.email_aluno = email_aluno;
    }
}
