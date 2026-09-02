public class Aluno {

    // Atributos da classe (características do aluno)
    private String nome;
    private int idade;
    private String matricula;
    private double nota1;
    private double nota2;
    private int faltas;
    private boolean matriculado;
    private String turma;
    private char turno;
    private int cargaHoraria;
    private double frequencia;

    // Construtor vazio
    // Permite criar um objeto sem informar dados inicialmente
    public Aluno() {
    }

    // Construtor com parâmetros
    // Recebe todos os dados do aluno ao criar o objeto
    public Aluno(String nome, int idade, String matricula, double nota1, double nota2,
                 int faltas, boolean matriculado, String turma, char turno, int cargaHoraria) {

        // "this" representa o objeto atual
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
        this.matriculado = matriculado;
        this.turma = turma;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;

        // Calcula a frequência automaticamente
        calcularFrequencia();
    }

    // ==========================
    // GETTERS E SETTERS
    // ==========================
    // Getters retornam valores
    // Setters alteram valores

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    // Sempre que as faltas forem alteradas,
    // a frequência será recalculada
    public void setFaltas(int faltas) {
        this.faltas = faltas;
        calcularFrequencia();
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Recalcula a frequência quando a carga horária mudar
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        calcularFrequencia();
    }

    public double getFrequencia() {
        return frequencia;
    }

    // ==========================
    // MÉTODOS DE CÁLCULO
    // ==========================

    // Calcula a média das duas notas
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Soma das notas
    public double calcularTotalPontos() {
        return nota1 + nota2;
    }

    // Quantidade de aulas assistidas
    public int calcularAulasFrequentadas() {
        return cargaHoraria - faltas;
    }

    // Cálculo da frequência em porcentagem
    public void calcularFrequencia() {

        // Evita divisão por zero
        if (cargaHoraria > 0) {

            frequencia = ((double) (cargaHoraria - faltas)
                    / cargaHoraria) * 100;
        }
    }

    // ==========================
    // MÉTODO TOSTRING
    // ==========================
    // Define como o objeto será exibido no console

    @Override
    public String toString() {
        return "===== PERFIL ACADÊMICO =====\n" +
                "Aluno: " + nome + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Idade: " + idade + "\n" +
                "Turma: " + turma + "\n" +
                "Turno: " + turno + "\n" +
                "Matriculado: " + matriculado + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Média: " + calcularMedia() + "\n" +
                "Total de pontos: " + calcularTotalPontos() + "\n" +
                "Carga horária: " + cargaHoraria + " horas\n" +
                "Faltas: " + faltas + "\n" +
                "Aulas frequentadas: " + calcularAulasFrequentadas() + "\n" +
                "Frequência: " + String.format("%.2f", frequencia) + "%";
    }
}