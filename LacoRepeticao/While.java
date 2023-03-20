package LacoRepeticao;

import java.util.Scanner;

public class While {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        int iteracao = 0;
        while (iteracao<=10) {
            System.out.println("O nº da iteração é "
            +iteracao);
            iteracao +=1;
        }
    }
}

