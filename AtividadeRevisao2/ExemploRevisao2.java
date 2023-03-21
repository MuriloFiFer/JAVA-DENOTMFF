package AtividadeRevisao2;

import java.util.Scanner;

public class ExemploRevisao2{
    Scanner sc = new Scanner(System.in);
    public void calHoraExtra (){
        
       
        System.out.println("Informe a quantidade de horas trabalhadas:");
        double hrTrabalhadas = sc.nextDouble();
        System.out.println("Informe o valor da hora trabalhada:");
        double vlHrTrabalhada = sc.nextDouble();
        double horaCompleta = 200;
        double salMinimo = hrTrabalhadas*vlHrTrabalhada;
        double horaExt = hrTrabalhadas-horaCompleta;
        double valHrExtra = (horaExt*1.5)*vlHrTrabalhada;
       
        double calSalFinal = salMinimo+valHrExtra;
        System.out.println("O valor do salário é de" +calSalFinal);


    }
}
