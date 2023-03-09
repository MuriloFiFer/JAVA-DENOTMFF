package ExercicioIfElse5;

import java.util.Scanner;

public class main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os valores inteiros do usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        // Verifica qual é o menor valor e o coloca em primeiro lugar
        int menor, meio, maior;

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }
              // Imprime os números em ordem crescente
              System.out.println(menor + " " + meio + " " + maior);
    }
}
    
