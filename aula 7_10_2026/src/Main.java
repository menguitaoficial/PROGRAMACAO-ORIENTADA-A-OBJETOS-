public class Main {

    public static void main(String[] args) {

        // Criando um funcionário
        Funcionario funcionario = new Funcionario(
                "João",
                3000
        );

        funcionario.exibirDados();

        System.out.println("----------------------");

        // Criando um desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Carlos",
                5000,
                "Java"
        );

        desenvolvedor.exibirDados();

        System.out.println("----------------------");

        // Criando a calculadora
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.somar(10, 5);
        double resultadoSubtracao = calculadora.subtrair(10, 5);
        double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
        double resultadoDivisao = calculadora.dividir(10, 5);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}