package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO() ;
		String sql = "INSERT INTO PESSOA (NOME) values (?)"; 
		System.out.println(dao.incluir(sql, "Dijalma santos"));
		System.out.println(dao.incluir(sql, "Ó Ana Julia"));
		System.out.println(dao.incluir(sql, "Pedro Parques"));
		System.out.println(dao.incluir(sql, "Luizão "));
		
		dao.close();

	}

}
