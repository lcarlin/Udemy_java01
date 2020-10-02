package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoas {
	public static void main(String[] args) throws SQLException{
				
		Scanner entrada = new Scanner(System.in);						
		System.out.print("Informe o código de A Pessoas :=> ");
		int codigo = entrada.nextInt();
		
		String selectSql = "SELECT * FROM pessoa WHERE codigo = ?";
		String updateSql = "UPDATE pessoa SET nome = ? where codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(selectSql);
		stmt.setInt(1, codigo );		
		System.out.println(stmt.toString());
		ResultSet r = stmt.executeQuery();
		
		if (r.next()) {
			System.out.println("Achou um ");
			Pessoa p = new Pessoa (r.getInt(1), r.getString(2));
			System.out.println("E o nome atual é :=> "+ p.getNome());
			entrada.nextLine();
			System.out.print("Informa o novo nome :=> ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateSql);			
			stmt.setString(1, novoNome );
			stmt.setInt(2, codigo );
			stmt.execute();
			System.out.println("Pessoal alterada com sucessos");
		} else { 
			System.out.println("Deu ruim Jão, não achei o Peão;");
		}
		entrada.close();
		conexao.close();
	}
}