package Cadastros;

public class Professor extends Pessoa {

    private String disciplina;
    private String titulacao;
    private String salario;

    public Professor(String nome, String cpf, String dataNascimento,
                     String disciplina, String titulacao, String salario) {

        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDisciplina: " + disciplina
                + "\nTitulação: " + titulacao
                + "\nSalário: " + salario;
    }
}