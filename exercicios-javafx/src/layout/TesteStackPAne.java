package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPAne extends StackPane {
	public TesteStackPAne() {
		// TODO Auto-generated constructor stub
		Caixa c1 = new Caixa().comTexto("UM ");
		Caixa c2 = new Caixa().comTexto("dois");
		Caixa c3 = new Caixa().comTexto("tres");
		Caixa c4 = new Caixa().comTexto("cuattro");
		Caixa c5 = new Caixa().comTexto("cinco");
		Caixa c6 = new Caixa().comTexto("Seix");

		getChildren().addAll(c1, c2, c3, c4, c5, c6);
		this.setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2) {
				System.out.println("Direito ");
				getChildren().get(0).toFront();
			} else {
				System.out.println("esquerdo");
				getChildren().get(5).toBack();
			}
		});

		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					} );
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}								
			}
		});
		
		t.setDaemon(true);
		t.start();
	}

}
