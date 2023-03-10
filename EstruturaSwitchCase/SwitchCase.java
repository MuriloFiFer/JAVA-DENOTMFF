package EstruturaSwitchCase;

import java.util.Scanner;

public class SwitchCase { // classe = SwitchCase;
    Scanner sc = new Scanner(System.in);

    public void letras() {// metodo = letras;
        System.out.println("Digite uma letra");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":// utilizar "aspas" para letras;
                System.out.println(letra + " é vogal");
                break;
            case "e":
                System.out.println(letra + " é vogal");
                break;
            case "i":
                System.out.println(letra + " é vogal");
                break;
            case "o":
                System.out.println(letra + " é vogal");
                break;
            case "u":
                System.out.println(letra + " é vogal");
                break;
            default:
                System.out.println(letra + " é consoante");
        }

    }

    public void mes() {
        String mes1 = "";
        System.out.println("Digite o mês (número)");
        int nMes = sc.nextInt();
        switch (nMes) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
                System.out.println("O mês é Junho");
                break;
            case 7:
                System.out.println("O mês é Julho");
                break;
            case 8:
                System.out.println("O mês é Agosto");
                break;
            case 9:
                System.out.println("O mês é Setembro");
                break;
            case 10:
                System.out.println("O mês é Outubro");
                break;
            case 11:
                System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;
            default:
                System.out.println(mes1 + "NÃO IDENTIFICADO");
        }

    }

}
