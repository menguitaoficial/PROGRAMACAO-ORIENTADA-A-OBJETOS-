import dao.ProdutoDAO;

public class Main {

    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.listar();
    }
}
