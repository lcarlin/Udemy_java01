package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	public static Connection getConexao () {
		// MySql 5.1.15
		// final String stringConexao = "jdbc:mysql://localhost:3305/curso_java";

		// MySql 8.0.21
//		final String stringConexao = "jdbc:mysql://localhost:3306/curso_java?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true";
//
//		final String usuario = "root";
//		final String senha = "MyNewPass";
		
		try {
			Properties prop = getProperties();
			final String stringConexao = prop.getProperty("banco.url") ;
			final String usuario = prop.getProperty("banco.usuario") ;
			final String senha =prop.getProperty("banco.senha") ;
			return DriverManager.getConnection(stringConexao, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e); 
			
		}										
	}
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
		
	}

}
