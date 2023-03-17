package VetoresArray3;

import java.util.Scanner;

public class Exercicio3 {
    Scanner sc = new Scanner(System.in);
    public void exemplo3() {
        //criando vetores
        double valoresDbl[] = new double [10];
        System.out.println("Digite 10 Nº reais");
        valoresDbl[0]=sc.nextDouble();
        valoresDbl[1]=sc.nextDouble();
        valoresDbl[2]=sc.nextDouble();
        valoresDbl[2]=sc.nextDouble();
        valoresDbl[3]=sc.nextDouble();
        valoresDbl[4]=sc.nextDouble();
        valoresDbl[5]=sc.nextDouble();
        valoresDbl[6]=sc.nextDouble();
        valoresDbl[7]=sc.nextDouble();
        valoresDbl[8]=sc.nextDouble();
        System.out.println("1º Posição- índice[0]:"+valoresDbl[0]);
        System.out.println("1º Posição- índice[1]:"+valoresDbl[1]);
        System.out.println("1º Posição- índice[2]:"+valoresDbl[2]);
        System.out.println("1º Posição- índice[3]:"+valoresDbl[3]);
        System.out.println("1º Posição- índice[4]:"+valoresDbl[4]);
        System.out.println("1º Posição- índice[5: "+valoresDbl[5]);
        System.out.println("1º Posição- índice[6: "+valoresDbl[6]);
        System.out.println("1º Posição- índice[7: "+valoresDbl[7]);
        System.out.println("1º Posição- índice[8]:"+valoresDbl[8]);
        System.out.println("1º Posição- índice[9]:"+valoresDbl[9]);            
    }
    }