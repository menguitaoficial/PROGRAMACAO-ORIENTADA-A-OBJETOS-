
package dao;

import database.Conexao;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());

            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto:");
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT id, nome, preco FROM produto";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             java.sql.ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                double preco = resultado.getDouble("preco");

                System.out.println(
                        "ID: " + id +
                                " | Nome: " + nome +
                                " | Preço: R$ " + preco
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos:");
            e.printStackTrace();
        }
    }

}
