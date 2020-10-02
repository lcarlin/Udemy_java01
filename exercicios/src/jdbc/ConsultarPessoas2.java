package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String newSql2 = "Select * from pessoa where nome like ?";
						
		System.out.print("Fala o nome do Peão :=> ");
		String valor = entrada.nextLine();
						
		PreparedStatement stmt = conexao.prepareStatement(newSql2);
		stmt.setString(1, "%"+valor+"%");
		System.out.println(stmt.toString());
		ResultSet resultado = stmt.executeQuery();
				
		List<Pessoa> pessoas = new ArrayList<>();
		while ( resultado.next() ) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));			
		}
		for(Pessoa p: pessoas) {
			System.out.println(p.toString());
		}		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
