package VetoresArray2;

import java.util.Scanner;

public class Exemplo2 {
Scanner sc = new Scanner(System.in);
public void exemplo2() {
    //criando vetores
    int valoresInt[] = new int[5];
    System.out.println("Digite 5 Nº inteiros");
    valoresInt[0]=sc.nextInt();
    valoresInt[1]=sc.nextInt();
    valoresInt[2]=sc.nextInt();
    valoresInt[3]=sc.nextInt();
    valoresInt[4]=sc.nextInt();
    System.out.println("1º Posição- índice[0]:"+valoresInt[0]);
    System.out.println("1º Posição- índice[1]:"+valoresInt[1]);
    System.out.println("1º Posição- índice[2]:"+valoresInt[2]);
    System.out.println("1º Posição- índice[3]:"+valoresInt[3]);
    System.out.println("1º Posição- índice[4]:"+valoresInt[4]);
   
    
}
}