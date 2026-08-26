package Cadastros;

public class Professor extends Cadastros.Pessoa {
    private float salario;
    public  Professor(String c, String n, float salario){
        super(c, n);
        this.salario = salario;
    }

}
