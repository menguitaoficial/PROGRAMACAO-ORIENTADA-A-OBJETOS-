package Cadastros;

public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String provedorEmail = "@ufrn.br";

    // Construtor vazio
    public Funcionario() {
    }

    // Construtor recebendo o nome
    public Funcionario(String nome) {
        this.nome = nome;
        this.setEmail(nome + this.provedorEmail);
    }

    // Criar e-mail automaticamente
    public void criarEmailFuncionario() {
        if (email == null && nome != null) {
            this.setEmail(nome + this.provedorEmail);
        }
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvedorEmail() {
        return provedorEmail;
    }

    public void setProvedorEmail(String provedorEmail) {
        this.provedorEmail = provedorEmail;
    }

    // Exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("---------------");
        System.out.println("CPF: " + cpf);
        System.out.println("---------------");
        System.out.println("Telefone: " + telefone);
        System.out.println("---------------");
        System.out.println("E-mail: " + email);}
}
