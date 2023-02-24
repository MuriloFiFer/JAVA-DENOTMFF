package EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisao {
    Scanner sc = new Scanner(System.in);

    public void decisaoIf() {
        System.out.println("Qual oPreço do Produto:");
        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >=200; (não precisa se já declarar
        // direto no if);
        double percentualDesconto = 0.0;

        if (precoProduto >= 200 && precoProduto < 300) {
            percentualDesconto = 10.0;
        }
        if (precoProduto >= 100 && precoProduto < 200) { // Estrutura de decisão if;
            // Desconto para produtos de alto valor.;
            percentualDesconto = 5.0;
        }
        if (precoProduto >= 300) {
            percentualDesconto = 15.0;
        }

        // Regra de três;
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto saíra por R$" + precoComDesconto);

    }

    public void decisaoIfElse() {
        System.out.println("Digite o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double percentualDesconto = 0;
        if (precoProduto < 100) {  //decisões intermediarias( decisões encadeadas);
            percentualDesconto = 0.0;
        } else if (precoProduto >= 100 && precoProduto < 200) {
            percentualDesconto = 5.0;
        } else if(precoProduto >=200 && precoProduto < 300) {
            percentualDesconto = 10.0;
        } else{
            percentualDesconto = 15.0;
        }
        
        // Regra de três;
        double desconto = (precoProduto * percentualDesconto) / 100;
        double precoComDesconto = precoProduto - desconto;
        System.out.println("O produto saíra por R$" + precoComDesconto);

    }
}
