package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {

Scanner sc = new Scanner(System.in);

    public void exemplo1(){
        for(int i=0;i<10;i++){  //declarações dentro do laço
          System.out.println("o n da iteração é "+i);
        }
    }


    public void exemplo2(){
        int vetor[]=new int[10];  //criando o vetor 10 posições
        //preenchendo o vetor com for
        for (int i = 0; i < vetor.length; i++) {  //"fori" atalho de preenchimento
            System.out.println("vetor["+i+"]=");
            vetor[i]=sc.nextInt();
        } 
        //imprimir o vetor na ordem inversa
        for (int i = 9; i >=0; i--) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
        } 


        public void exemplo3(){
            //Carrinho de compra
        double carrinhoCompra[]=new double[]{19.90,35.70,56.80,97.50};
        // Finalizar a compra
        double valorFinal=0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];  // "+=" (soma e ja da o resultado)
            //imprimir o valor parcial
            System.out.println("O valor parcial da compra: R$"+valorFinal);
        }
        //mostrar o valor final da compra
        System.out.println("O valor final da compra é R$"+valorFinal);
        }


        public void exemplo4(){
            //ler 4 notas e mostrar as 4 notas e a média
            double vetorNotas[]= new double[4];
            for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota "+(i+i)+":");
            vetorNotas[i]=sc.nextDouble();
        }
        //imprimir as 4 notas e clacular a média
        double mediaNotas=0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas+=vetorNotas[i];
            System.out.println("A "+(i+1)+"ª Nota é "+vetorNotas[i]);
        }
        mediaNotas/=vetorNotas.length;  // "/="  (dividir e já calcular)
        System.out.printf("A media do aluno é %.2f",mediaNotas);
        }
        public void exemplo5(){
            //ler 4 notas de 10 alunos
            // vetor para guardar as médias
            double vetorMedia[]=new double[10];
            //preencher o vetor de médias
            for (int i = 0; i < vetorMedia.length; i++) {
                double notas=0;
                for(int j=0;j<4;j++){ // laço dentro do laço -- nesse caso, faz 4x até "j"=4 para sair do laço interno.
                    System.out.println("Nota "+(j+1)+ " Aluno "+(i+1));  //incrementando valor de vetor em  "j"  e "i"
                    notas+=sc.nextDouble();                 
                }
                notas/=4;
                vetorMedia[i]=notas;
            }
            for (int i = 0; i < vetorMedia.length; i++) {
                if(vetorMedia[i]>=7){
                    System.out.println("A média do Aluno "+(i+1)+" é "+vetorMedia[i]);
                }
            }
        }


        public void exercicio7(){
            int vetorNumero[]=new int[5];
            for (int i = 0; i < vetorNumero.length; i++) {
                int numeroSoma=0;
                numeroSoma += vetorNumero[i];
                System.out.println("Digite o "+(i+1)+ "º numero:");
                numeroSoma +=sc.nextInt();
            }
            for (int i = 0; i < vetorNumero.length; i++) {
                int numeroSoma=0;
                    numeroSoma+=vetorNumero[i];
            }
        }
}

    
    

