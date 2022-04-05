package executavel;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class TestandoFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Alex");
        aluno.setNomeEscola("JDev Treinamento");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123412321");
        diretor.setNome("Egídio");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("32134123123123");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());
    }
}
