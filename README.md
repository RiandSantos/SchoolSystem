# SchoolSystem
 Um sistema desenvolvido durante meu 2º Semestre(POO com Java) que faz consultas e alterações em linhas de banco de dados SQL (MySQL).

## Como rodar o sistema?
1. Faça um `clone` do projeto para sua máquina;
2. Crie um `banco de dados` chamado "empresa" (fique a vontade para usar o seu banco favorito, porém foi desenvolvido e testado somente no `MySQL`);
3. Não sabe SQL? sem problemas, todo o código necessário está no arquivo [`CODE_SQL.txt`](https://github.com/RiandSantos/SchoolSystem/blob/main/CODE_SQL.txt);
4. Dentro do SGBD crie 2 `tables`;
   1. Tabela chamada **"usuario"** com os valores:
      1. (nome_user,  email_user,  telefone_user,  login_user,  senha_user) - _Respectivamente_;
   2.  Tabela chamada **"aluno"** com os valores:
       1. (ra_aluno,  nome_aluno,  telefone_aluno,  email_aluno) - _Respectivamente_;
5. A partir do passo anterior você pode inserir os dados manualmente com `INSERT INTO` ou inserir diretamente pela própria aplicação;
6. Crie uma conta de **Usuario** e faça o login;
   1. `LEMBRETE` Atualmente apenas o sistema de alunos funciona;
7. Aproveite o sistema! :D

## Erro?
**`Erro de Acesso ao Banco`**: Se houver erro para criação de conta pelo sistema ou inserção de alunos no banco através do sistema, verifique em `universidade/dados`  nas classes com nome **DAO** se a _URL, USER, SENHA ou DRIVER_ difere do SGBD que você está usando e faça a alteração dentro das aspas("") da variavél.

Exemplo:
1. Meu banco possui senha;
2. Por padrão o sistema é configurado para acessar um banco sem senha;
3. Vá até as _classes DAO_ e coloque sua senha em `private final String SENHA = "";`

**`Erro com o connector.jar`**: Pode haver um erro com a classe que conecta no banco, você pode simplesmente direcionar a classe novamente para `Libraries`, o conector _.jar_ está dentro do projeto em [`SchoolSystem/ConnectorMySQL/`](https://github.com/RiandSantos/SchoolSystem/tree/main/connectorMySQL);
