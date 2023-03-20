package VetoresArray;

import java.util.Scanner;

public class Vetores {
Scanner sc = new Scanner(System.in);
public void exemplo1() {
    //criando um vetor
    double[] valores = new double[]{10.5,29.7,30.6,40.4};
    System.out.println("1º Posição- índice[0]:"+valores[0]);
    System.out.println("1º Posição- índice[1]:"+valores[1]);
    System.out.println("1º Posição- índice[2]:"+valores[2]);
    System.out.println("1º Posição- índice[3]:"+valores[3]);
    //Mudando valores de uma posição definida
    valores[0] = 15.6; //Mudando o valor do índice [0]
    System.out.println("1º Posição- índice[0]:"+valores[0]);
}   
}
