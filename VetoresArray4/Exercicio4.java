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
        if(letras[i]=="a"||letras[i]=="e"||letras[i]=="i"
        ||letras[i]=="o"||letras[i]=="u"){

        }else{
            cont++;
            System.out.println(letras[i]+" é consoante");
        }
        }
        System.out.println("o nº de consoantes é "+cont);
        }
    }
