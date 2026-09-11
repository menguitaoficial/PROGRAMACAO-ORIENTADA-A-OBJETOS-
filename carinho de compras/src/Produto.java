public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int qtdestoque;
    public Produto (int codigo, String nome, double preco, int qtdestoque){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtdestoque = qtdestoque;
    }
    public void exibirDados(){
        System.out.println(codigo + "-" + nome + " | R$ " + preco + " | Estoque: " + qtdestoque;
    }
}
