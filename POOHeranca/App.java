package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Professores;

public class App {

    public void main (String[]args){
        //objetos
        Alunos aluno01 = new Alunos();
        // Pessoas pessoa01 = new Pessoas();    //(classe abstrata)
        Funcionarios funcionario01 = new Funcionarios();
        Professores professor01 = new Professores();
        aluno01.setAluno("Alberto");
        //pessoa01.setPesoa("Pessoas");
        funcionario01.setFuncionario("Manutenção");
        professor01.setNome("Disciplina");



        //set
        

    }
    
}
