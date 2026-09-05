package Cadastros;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(
                "Caio Diogenes",
                "123.456.789-00",
                "10/05/2005",
                "2026001",
                "TADS",
                "6"
        );

        Professor professor = new Professor(
                "Marlon",
                "987.654.321-00",
                "15/08/1980",
                "Programação Orientada a Objetos",
                "Doutor",
                "R$ 8.500,00"
        );

        Cliente cliente = new Cliente(
                "Rosilene Ferreira",
                "111.222.333-44",
                "20/03/1995",
                "CLI001",
                "Rua das Flores, 100",
                "(84) 99999-9999"
        );

        System.out.println("=== ALUNO ===");
        System.out.println(aluno);

        System.out.println("\n=== PROFESSOR ===");
        System.out.println(professor);

        System.out.println("\n=== CLIENTE ===");
        System.out.println(cliente);
    }
}