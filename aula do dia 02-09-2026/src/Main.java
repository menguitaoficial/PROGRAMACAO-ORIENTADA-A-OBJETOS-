import Cadastros.Funcionario;

void main() {

    Funcionario f1 = new Funcionario("Caio Diogenes");

    f1.setCpf("123.456.789-10");
    f1.setTelefone("99999-9999");

    f1.criarEmailFuncionario();

    f1.exibirDados();
}
