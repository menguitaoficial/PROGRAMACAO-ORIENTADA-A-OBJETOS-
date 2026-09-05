package Cadastros;

public class Cliente extends Pessoa {

    private String codigoCliente;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String cpf, String dataNascimento,
                   String codigoCliente, String endereco, String telefone) {

        super(nome, cpf, dataNascimento);
        this.codigoCliente = codigoCliente;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCódigo do Cliente: " + codigoCliente
                + "\nTelefone: " + telefone
                + "\nEndereço: " + endereco;
    }
}