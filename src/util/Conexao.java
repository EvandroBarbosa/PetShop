package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //##########################################
    //Cria uma conexão para com o banco de dado
    private static Connection conexao;
    
    
    //##########################################
    //Métodos 

    public static Connection getConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                conexao = conectar();
            }
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
        return conexao;
    }

    private static Connection conectar() {
       try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost/basededado", "postgres", "senha");
        } catch (ClassNotFoundException e) {
            System.out.println("A aplicação não contém o driver para o banco.");
            return null;
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco. Verifique a url, o usuário e a senha");
            return null;
        } 
    }
    
}
