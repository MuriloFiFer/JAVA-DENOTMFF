package ExercicioIfElse5;

import java.util.Scanner;

public class Exercicio5{
    Scanner sc = new Scanner(System.in);

    public void exercicio5()

    {
        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero");
        int num3 = sc.nextInt();
        
        if ( num1<num2<num3){
            System.out.println("Os numeros são" +num1 +num2 +num3);
    }

}
}