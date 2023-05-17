package POOIntroducao;

public class App {

    public void main (String[]args) {
        //criar o objeto 
        RegistraAluno aluno1 = new RegistraAluno(); // obj
        RegistraAluno aluno2 = new RegistraAluno(); // obj
        //modificar os atributos
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("Rua José da Silva, 123");
        aluno1.setIdade(18);
        aluno1.setNotaMatematica(9.5);
        aluno1.setNotaPortugues(10.0);
        aluno1.setNotaCiencias(8.3);


        //acessar os atributos(get)
        System.out.println("Nome:"+aluno1.getNome());
        System.out.println("Endereço:"+aluno1.getEndereco());
        System.out.println("Idade:"+aluno1.getIdade());
        System.out.println("Media:"+aluno1.getMedia());
       
    }

}