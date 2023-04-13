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
    }
