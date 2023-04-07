package LacoRepeticao;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        int iteracao = 0;
        while (iteracao<1000) {
            iteracao +=1;
            System.out.println("O nº da iteração é " +iteracao);   
        }
    }


    public void exemplo2(){           
        Random rd = new Random();
        System.out.println("==============================");
        int numeroAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C a qualquer momento para parar.");
        while (tenteNovamente){
            System.out.println("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            tenteNovamente = numeroAleatorio != numero;
            if (tenteNovamente){
                System.out.println("Errado!");
            }
            System.out.println("Parabéns! Você adivinhou. Era o número" +numeroAleatorio + "mesmo.");
            System.out.println("Fim!");         
            System.out.println("============================"); 
        }
        }

        public void exemplo3(){
            // Ler5 nº inteiros e printar na ordem, criar um vetor com while
            int vetor[] = new int[5];
            int i=0;
            while(i<5){
                System.out.println("Digite o valor para o vetor["+i+"]");
                vetor[i]=sc.nextInt();
                i++;
            }   
            i=0;
                while(i<5){
                System.out.println("O valor do vetor["+i+"] é "+vetor[i]);
                i++;
            }
        }
        }

    



