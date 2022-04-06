package classes;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

    protected String registroEducacao;
    protected  int tempoDirecao;
    protected String titulacao;

    private String login;
    private String senha;

    public Diretor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Diretor() {

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacao='" + registroEducacao + '\'' +
                ", tempoDirecao=" + tempoDirecao +
                ", titulacao='" + titulacao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }

    public double salario() {
        return 3900.78;
    }

    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }

    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }
}
