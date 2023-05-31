package POOExercicio2;

import javax.swing.JOptionPane;

import java.util.Random;


public class App {
    
    public static void main(String[] args) {
        Random rd = new Random(0);
        //vetor de objetos
        Agenda pessoas[] = new Agenda[10];
        //preencher o meu vetor/Array
        for (int i = 0; i < pessoas.length; i++) {
            //construtor de objetos
            pessoas[i]= new Agenda();
            //preencher os atributos


          //  pessoas[i].setNome(JOptionPane.showInputDialog("Nome:"));
          //  pessoas[i].setAltura(rd.nextDouble(1.5,2.1));
         //   pessoas[i].setIdade(rd.nextInt(18,100));

         pessoas[i].setNome("Pessoa"+i);
         pessoas[i].setAltura(i);
         pessoas[i].setIdade(i+18);
         
         //pessoas[i].imprimirDados();
         }

         //buscador
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


    

