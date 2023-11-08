package dad.login;

import dad.mvc.fxml.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	// controllers
	private Controller controller = new Controller();


	@Override
	public void start(Stage primaryStage) throws Exception {
	
		//ventana del login

		
		Scene scene = new Scene(controller.getView(), 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();

	}

}
