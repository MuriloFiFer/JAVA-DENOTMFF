package ExercicioOperadores;

import java.util.Scanner; //classe scanner já da biblioteca do JAVA;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void notaFrequencia() {
        System.out.println("Informe a nota1 do Aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota2 do Aluno:");
        int nota2 = sc.nextInt();

        // double mediaAluno = (nota1 = nota2) / 2);

        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A média do Aluno é:" + mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluino Esta Aprovado por Nota: " + mediaAprovado);
        System.out.println("Informe a Frequência do Aluno");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno Esta Aprovado por Frequência: " + frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado == true) && (frequenciaAprovado == true);
        System.out.println("O Aluno Esta Aprovado no Curso:  " + aprovacaoFinal);

    }
}
