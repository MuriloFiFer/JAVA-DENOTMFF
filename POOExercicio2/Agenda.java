package POOExercicio2;

import javax.swing.JOptionPane;

public class Agenda {
    //atributos
    String nome;
    int idade;
    double altura;
    //construtor default
    
    public Agenda() {
           }
    //sets and gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    

   //métodos definidos pelo programador
    public void imprimirDados(){
       JOptionPane.showMessageDialog("Nome:"+nome);
       System.out.println("Idade:"+idade);
       System.out.println("Altura:"+altura);
    }


   
    

   


}
