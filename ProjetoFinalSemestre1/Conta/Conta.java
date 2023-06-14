package ProjetoFinalSemestre1.Conta;

import javax.swing.JOptionPane;

public abstract class Conta {
    //atributos comuns
    String nome;
    int nConta;
    double saldo;
    //métodos
    //construtor default(vazio)
    //sets and gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //métodos opcionais
    public void saque() {
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque:"));
       
        if(saldo<saque){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!");
             }
             else {saldo -=saque;}
       }
    
       public void deposito() {
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do deposito:"));
        saldo +=deposito;
       }
}
