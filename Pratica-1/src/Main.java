public class Main {

    // Método principal do programa
    // A execução começa por aqui
    public static void main(String[] args) {

        // Criação de um objeto da classe Aluno
        // O construtor com parâmetros está sendo chamado
        Aluno aluno = new Aluno(
                "Carlos Silva", // nome
                19,             // idade
                "20260015",     // matrícula
                8.5,            // nota 1
                7.0,            // nota 2
                4,              // faltas
                true,           // matriculado
                "TADS 1",       // turma
                'N',            // turno (N = Noite)
                60              // carga horária
        );

        // Exibe os dados do aluno no console
        // Como existe um método toString(),
        // ele será chamado automaticamente
        System.out.println(aluno);

        // Apenas um título para separar as saídas
        System.out.println("\n===== TESTANDO GETTERS E SETTERS =====");

        // Alterando informações do aluno utilizando SETTERS

        // Atualiza o nome
        aluno.setNome("Diogenes Alves");

        // Atualiza a primeira nota
        aluno.setNota1(9.0);

        // Atualiza a segunda nota
        aluno.setNota2(8.5);

        // Atualiza a quantidade de faltas
        // Ao alterar as faltas, a frequência será recalculada
        aluno.setFaltas(2);

        // Exibe novamente os dados já atualizados
        System.out.println(aluno);
    }
}