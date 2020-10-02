package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o código de A Pessoas :=> ");
		int codigo = entrada.nextInt();

		String deleteSQL = "delete FROM pessoa WHERE codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
		stmt.setInt(1, codigo);
		System.out.println(stmt.toString());
		int contador =stmt.executeUpdate() ; 
		
		if (contador > 0 ) {
			System.out.println("O peão foi pro pau " +contador);
		} else {
			System.out.println("Esse maluco não existe ");
		}						
		entrada.close();
		conexao.close();
	}
}