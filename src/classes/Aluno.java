package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String numeroCpf;
    private String registroGeral;
    private String nomePai;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getIdade() == aluno.getIdade() && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getDataNascimento(), aluno.getDataNascimento()) && Objects.equals(getNumeroCpf(), aluno.getNumeroCpf()) && Objects.equals(getRegistroGeral(), aluno.getRegistroGeral()) && Objects.equals(getNomePai(), aluno.getNomePai()) && Objects.equals(getNomeEscola(), aluno.getNomeEscola()) && Objects.equals(getSerieMatriculado(), aluno.getSerieMatriculado()) && Objects.equals(getDisciplina(), aluno.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getDataNascimento(), getNumeroCpf(), getRegistroGeral(), getNomePai(), getNomeEscola(), getSerieMatriculado(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }

    public double getMediaNotas() {

        double sommaNotas = 0.0;

        for (Disciplina disciplina:
             disciplinas) {
            sommaNotas += disciplina.getNota();
        }
        return sommaNotas / disciplinas.size();
    }

    public String getAlunoAprovado() {
        media = disciplinas.getMediaNotas();

        if (media >= 50) {
            if (media >= 70) {
                return statusAluno.APROVADO;
            } else {
                return statusAluno.Recuperacao;
            }
        } else {
            return statusAluno.REPROVADO;
        }
    }
}
