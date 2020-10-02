package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException  {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		System.out.print("Fala o nome do Peão :=> ");
		String nome = entrada.nextLine();
				
		String sql = "insert into pessoa (nome) VALUES (?) " ;
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println(stmt.toString());
		entrada.close();
	}
}