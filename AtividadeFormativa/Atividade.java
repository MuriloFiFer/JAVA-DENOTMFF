package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // EXERCICIO 1

    public void exercicio1() {

        System.out.print("Digite o número de linhas: ");
        int linha = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }

        System.out.println();
        System.out.println("Sua matriz com numeros aleatórios de 0 a 9:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // substituição
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j)
                    matriz[i][j] = 1;
                else if (i == j)
                    matriz[i][j] = 0;
                else
                    matriz[i][j] = 2;
            }
        }

        System.out.println();
        System.out.println("Sua matriz com a substituição com 0,1 e 2:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // EXERCICIO 2

    public void exercicio2() {

        int numeroSorteado = (int) (Math.random() * 1001);
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número entre 0 e 1000.");

        System.out.print("Digite seu palpite: ");
        palpite = sc.nextInt();
        tentativas++;

        while (palpite != numeroSorteado) {
            if (palpite < numeroSorteado) {
                System.out.println("O palpite é menor do que o número sorteado.");
            } else {
                System.out.println("O palpite é maior do que o número sorteado.");
            }

            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;
        }

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        sc.close();
    }


    //EXERCICIO 3

    public void exercicio3() {
    
        int sorteio = rd.nextInt(901) + 100; // 

        
        int vetor[] = new int[sorteio];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[sorteio]);
        }
     
        
        //  números aleatórios de 1 a 100 
        System.out.println("Vetor completo:");
        for (int i = 0; i < sorteio; i++) {
            vetor[i] = rd.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor completo:");
        for (int i = 0; i < sorteio; i++) {
            vetor[i] = rd.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

    }

}

