package ExercicioIfElse3;

import java.util.Scanner;

public class Exercicio3 {

    Scanner sc = new Scanner(System.in);

    public void exercicio3() {
        int senha = 1234;
        System.out.println("Digite a senha de acesso");
        int senhaDigitada = sc.nextInt();
        if (senhaDigitada == senha) {
            System.out.println("ACESSO PERMITIDO");
        }
        if (senhaDigitada != senha) {
            System.out.println("ACESSO NEGADO");
        }

    }

}