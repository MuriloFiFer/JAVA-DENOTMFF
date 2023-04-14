package VetoresArray4;

import java.util.Scanner;
public class Exercicio4 {
    // lendo um vetor de string com laço while
    // criar um vetor de 10 letras
    Scanner sc = new Scanner(System.in);
    public void  exemplo4(){
    String letras[]= new String[]{"a","b","c","d","e","f","g","h","i","j"};
    // iterador ou repetidor - elemento que servirá de contagem
    int i=0;
    int cont = 0; //contador para as consoantes
    while(i<letras.length){
        if(letras[i]=="a"||letras[i]=="e"||letras[i]=="i"  // "||" condição   "OU"
        ||letras[i]=="o"||letras[i]=="u"){

        }else{
            cont++; //conta + 1 no contador
            System.out.println(letras[i]+" é consoante");
        }
        i++; // conta + 1 na variavel "i"
        }
        System.out.println("o nº de consoantes é "+cont);
        }



        public void exemploSthCase(){
            String letras[]= new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
    
        int i=0;
        int cont = 0;
        int vogal=0;
        while(i<letras.length){
            switch(letras[i]){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                vogal++;
                System.out.println(letras[i]+ " é vogal");
                break;
                default: cont++;
                System.out.println(letras[i]+" é Consoante");
            }
            i++;
        }
        System.out.println("o nº de vogais é "+vogal);
        System.out.println("o nº de consoantes é "+cont);
        }

        public void exemplo5(){
            int vetor[]=new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int i=0;
            int contPar=0;
            int contImpar=0;
            while(i<vetor.length){  //length = tamanho  (tamanho do vetor)
                if(vetor[i]%2==0){
                    contPar++;
                }else{ // caso contrario
                    contImpar++;
                }
                i++;
            }
            int vetorPar[]=new int[contPar];
            int vetorImpar[]=new int[contImpar];
            i=0;
            contPar=0;
            contImpar=0;
            while(i<vetor.length){
                if(vetor[i]%2==0){
                    vetorPar[contPar]=vetor[i];
                    contPar++;
                }else{ // caso contrario
                    vetorImpar[contImpar]=vetor[i];
                    contImpar++;
                }
                i++;
            }
            i=0;
            while(i<vetor.length){   
                System.out.println("vetor["+i+"]="+vetor[i]);
                i++;
                }
            i=0;
            while(i<vetorPar.length){   
            System.out.println("vetorPar["+i+"]="+vetorPar[i]);
            i++;
            }
            i=0;
            while(i<vetorImpar.length){
            System.out.println("vetorImpar["+i+"]="+vetorImpar[i]);
            i++;
            }
            
        }

        public void exercicio5Extra(){
            int vetor[]=new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int i=0;
            int vetorPar[]=new int[vetor.length];
            int vetorImpar[]=new int[vetor.length];
            while(i<vetor.length){
                if(vetor[i]%2==0){
                    vetorPar[i]=vetor[i];
                }else{ // caso contrario
                    vetorImpar[i]=vetor[i];
                }
                i++;
            }
            i=0;
            while(i<vetor.length){   
                System.out.println("vetor["+i+"]="+vetor[i]);
                System.out.println("vetorPar["+i+"]="+vetorPar[i]);
                System.out.println("vetorImpar["+i+"]="+vetorImpar[i]);
                i++;
                }
               
    
        }
     //exercicio não terminado
        public void exercicio6(){
            System.out.println("Digite a nota do 1º aluno");
            int nota1 = sc.nextInt();
            System.out.println("Digite a nota do 2º aluno");
            int nota2 = sc.nextInt();
            System.out.println("Digite a nota do 3º aluno");
            int nota3 = sc.nextInt();
            System.out.println("Digite a nota do 4º aluno");
            int nota4 = sc.nextInt();
            int vetor[]=new int []{1,2,3,4};
            int i=0;
            while(i<vetor.length){
                vetor[i]=nota1;
                vetor[i]=nota2;
                vetor[i]=nota3;
                vetor[i]=nota4;
            }

         


        }


}