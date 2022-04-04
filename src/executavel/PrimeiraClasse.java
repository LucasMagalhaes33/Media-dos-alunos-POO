package executavel;

import classes.Aluno;
import classes.Disciplina;
import constantes.statusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraClasse {

    public static void main(String[] args){
        String login = JOptionPane.showInputDialog("Login: ");
        String media = JOptionPane.showInputDialog("Senha: ");

        if (login.equalsIgnoreCase("admin") && media.equalsIgnoreCase("admin")) {
            List<Aluno> alunos = new ArrayList<Aluno>();
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            for (int qtd = 1; qtd <= 6; qtd++) {
                String nome = JOptionPane.showInputDialog("Digite o nome do aluno");

                Aluno aluno2 = new Aluno();
                aluno2.setNome(nome);

                for (int pos = 1; pos <=1; pos++) {

                    String nomeDisciplina = JOptionPane.showInputDialog("Digite a disciplina: ");
                    String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina: ");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(notaDisciplina));

                    aluno2.getDisciplina().add(disciplina);

                }

                int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina?");
                if (escolha == 0) {
                    int continuarRemover = 0;
                    int posicao = 1;

                    while (continuarRemover == 0 ) {
                        String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina remover 1, 2, 3 ou 4?");
                        aluno2.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
                        posicao++;
                        continuarRemover = JOptionPane.showConfirmDialog(null, "continuar remover?");
                    }
                }

                alunos.add(aluno2);

            }

            maps.put(statusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(statusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(statusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno:
                    alunos) {
                if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADO)) {
                    maps.get(statusAluno.APROVADO).add(aluno);
                }
                else if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
                    maps.get(statusAluno.RECUPERACAO).add(aluno);
                }
                else if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.REPROVADO)) {
                    maps.get(statusAluno.REPROVADO).add(aluno);
                }

            }

            System.out.println("-------------------Lista de aprovados--------------------");
            for (Aluno aluno2:
                    maps.get(statusAluno.APROVADO)) {
                System.out.println("Resultado = " + aluno2.getNome() + " com média " + aluno2.getMediaNotas());
            }

            System.out.println("-------------------Lista de recuperação--------------------");
            for (Aluno aluno2:
                    maps.get(statusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + aluno2.getNome() + " com média " + aluno2.getMediaNotas());
            }

            System.out.println("-------------------Lista de reprovados--------------------");
            for (Aluno aluno2:
                    maps.get(statusAluno.REPROVADO)) {
                System.out.println("Resultado = " + aluno2.getNome() + " com média " + aluno2.getMediaNotas());
            }
        }
    }
}
