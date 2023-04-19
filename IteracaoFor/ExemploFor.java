package IteracaoFor;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class ExemploFor {

Scanner sc = new Scanner(System.in);

    public void exercicio1(){
        for(int i=0;i<10;i++){  //declarações dentro do laço
          System.out.println("o n da iteração é "+i);
        }
    }


    public void exercicio2(){
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


        public void exemploExtra(){
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


        public void exercicio3(){
            //ler 4 notas e mostrar as 4 notas e a média
            double vetorNotas[]= new double[4];
            for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota "+(i+1)+":");
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

            //exercicio= ler um vetor de caracteres e contar as consoantes
        public void exercicio4(){
            char letras[]=new char[]{'a','b','c','d','f','g','h','i','j'};
            String letras2[]=new String[]{"a","b","c","d","f","g","h","i","j"};
            //percorrer o vetor para procurar letras, vogais ou consoantes      
            //contar o nº de consoantes
            int cont=0; // declarando um contador
            for (int i = 0; i < letras2.length; i++) {
                if(letras2[i]!="a" && letras2[i] !="e" && letras2[i]!="i" && letras2[i]!="o" && letras2[i]!="u"){
                    System.out.println(letras2[i]+" é consoante");
                    cont++;
                }
            }
            System.out.println("O numero de consoantes é "+cont);
        }


        //Ler a palavra digitada pel usuario e guardar na string
        public void exercicio4Ex(){
            System.out.println("Digite uma Palavra:");
            String palavra = sc.next();// ler a proxima palavra digitada pelo usuario e guardar na string
            palavra = palavra.toLowerCase();    //converter a palavra digitada para minusculo.
            //percorrer a String para procurar letras, vogais ou consoantes      
            //contar o nº de consoantes
            int cont=0; // declarando um contador
            for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                if(c !='a' && c  !='e' && c  !='i' && c  !='o' && c  !='u'){
                    System.out.println(c+" é consoante");
                    cont++;
                }
            }
            System.out.println("O numero de consoantes é "+cont);
        }



        public void exercicio6(){
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
            int valorFinal=0;
            
            for (int i = 0; i < vetorNumero.length; i++) {
                System.out.println("Digite o numero nº ");
                vetorNumero[i]=sc.nextInt();
                valorFinal+=vetorNumero[i];
                System.out.println("A Soma parcial é "+valorFinal);            
            }              
                System.out.println("O valor total da Soma é "+valorFinal);
                valorFinal=1;
            
            for (int i = 0; i < vetorNumero.length; i++) {
                valorFinal*=vetorNumero[i];
                System.out.println("A multiplicação parcial dos numeros é "+valorFinal);
            }
            System.out.println("O valor total da multiplicação é "+valorFinal);
        }

        public void exercicio8(){
            int vetorIdade[]=new int[5]; 
            int idades=0;
            double vetorAltura[]=new double[5]; //criando o vetor 10 posições
            double altura=0;
            //preenchendo o vetor com for
            for (int i = 0; i < vetorIdade.length; i++) {  //"fori" atalho de preenchimento
                System.out.println("Digite a Idade:");
                vetorIdade[i]=sc.nextInt();
                idades+=vetorIdade[i];
                for (int j = 0; j < vetorAltura.length; j++) {
                    
               
                System.out.println("Digite a Altura:");
                vetorAltura[j]=sc.nextDouble();
                altura+=vetorAltura[j];
            }

            } 
            //imprimir o vetor na ordem inversa
            for (int i = 4; i >=0; i--) {
                System.out.println("vetor["+i+"]="+vetorIdade[i]);
                for (int j = 4; j >=0;j--) 
                System.out.println("vetor["+j+"]="+vetorAltura[j]);{
                    
                }
            }
            } 

        }


    
    

