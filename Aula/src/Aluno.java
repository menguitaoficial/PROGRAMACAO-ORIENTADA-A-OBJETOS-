package Cadastros;

public class Aluno extends Cadastros.Pessoa {
    private String matricula;

    public Aluno(String n, String matricula){
        super(c,n);
        this.matricula = matricula;
    }
}
