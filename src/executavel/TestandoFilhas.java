package executavel;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
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
        secretario.setNome("João");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);


        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("salário é igual a " + aluno.salario());
        System.out.println("salário é igual a " + diretor.salario());
        System.out.println("salário é igual a " + secretario.salario());

        teste(aluno);
        teste(secretario);
        teste(diretor);
    }

    public static void teste(Pessoa pessoa) {
        System.out.println("Essa pessoa é demais " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
    }
}
