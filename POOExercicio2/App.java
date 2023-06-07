package POOExercicio2;

import javax.swing.JOptionPane;
import javax.swing.tree.RowMapper;

import java.lang.reflect.Array;
import java.util.Random;


public class App {
    
    public static void main(String[] args) {
        Random rd = new Random(0);
        //vetor de objetos
        Agenda contatos[] = new Agenda[10];
        //preencher o meu vetor/Array
        for (int i = 0; i < contatos.length; i++) {
            //construtor de objetos
            contatos[i]= new Agenda();
            //preencher os atributos
                  
         contatos[i].setNome(JOptionPane.showInputDialog("Nome"));
              
    }
    Random rd = new Random(0);
    //vetor de objetos
    Agenda pessoas[] = new Agenda[10];
    // preencher o meu vetor/Array
    for (int i = 0; i < pessoas.length; i++) {
            }
    //construtor de objetos
    pessoas[i] = new Agenda();
    //preencher os atributos
    pessoas[i].setNome("Pessoaa" + 1);
    pessoas[i].setAltura(i);
    pessoas[i].setIdade9i + 18);

    pessoas[i].imprimir();
         String nomeDigitado= JOptionPane.showInputDialog("Nome Buscado:");     //enquanto nomeDigirado != nome do Objeto
         //conte e procure
         int cont = 0;
         boolean teste=true;
         while(!nomeDigitado.equals(pessoas[cont].getNome())){
                cont++;
            
         cont++;
         }
         System.out.println("Nome: "+pessoas[cont].getNome()
                             +"Idade: "+pessoas[cont].getIdade()
                             +"Altura: "+pessoas[cont].getAltura());

        }
    }


    

