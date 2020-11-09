package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;

	public  void entrar()  {
				
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("123456");
						
		System.out.println("Adentrar a APP ... .. .");
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
		
		if ( emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login do JFX")
				.text("O Luguinho deu certo ")
				.showInformation();
			
			System.out.println("Sucesso no Loguinhoi ");
		} else {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login do JFX")
			.text("Usuário E/OU Senha incorretos ")
			.showError();
			System.out.println("Tem coisa errada ai ");
		}
		
	}

}
