package ExercicioIfElse6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        // Solicita a entrada da altura e do sexo
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();
        System.out.print("Digite seu sexo: 1 para feminino ou 2 para masculino: ");
        int sexo = input.nextInt();
        
        // Verifica o sexo e calcula o peso ideal
        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido!");
        }
    }
}
