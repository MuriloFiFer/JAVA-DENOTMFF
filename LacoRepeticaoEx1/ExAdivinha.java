import java.util.Scanner;

public class ExAdivinha {
    Scanner sc = new Scanner(System.in);
    public void adivinhar() {
        Random rd = new Random()
        int nSorteado = rd.nretInt(10);
        boolean tenteNovamente;
        while (tenteNovamente) {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            if (nDigitado==nSorteado){
                System,out.println("Acertou Miseravi");
                tenteNovamente = false;
            } else{
                System.out.println("Errooooou!");
                tenteNovamente=true;
            }

            }

        }
    }


