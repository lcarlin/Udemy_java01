package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException  {
		
		// MySql 5.1.15 
		// final String stringConexao = "jdbc:mysql://localhost:3305";
		
		// MySql 8.0.21
		final String stringConexao = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true";
		
		final String usuario = "root";
		final String senha = "MyNewPass";
		
		Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
		System.out.println("Conexaco deu certo ");
		
		conexao.close();

	}

}
