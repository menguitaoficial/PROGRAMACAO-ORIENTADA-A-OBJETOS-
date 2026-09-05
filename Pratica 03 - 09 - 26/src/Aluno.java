package Cadastros;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;
    private String periodo;

    public Aluno(String nome, String cpf, String dataNascimento,
                 String matricula, String curso, String periodo) {

        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nMatrícula: " + matricula
                + "\nCurso: " + curso
                + "\nPeríodo: " + periodo;
    }
}