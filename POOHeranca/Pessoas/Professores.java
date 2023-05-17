package POOHeranca.Pessoas;

public class Professores extends Funcionarios {
    //atributos especificos
    private String disciplina;

    //método
    public String getDisciplina(){
        return disciplina;
        }

        public void setDisciplina(String disciplina){
            this.disciplina = disciplina;
        }
}
