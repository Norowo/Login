package dad.login;

import dad.mvc.login.LoginController;
import dad.mvc.login.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	// controllers
	private LoginController loginController = new LoginController();


	@Override
	public void start(Stage primaryStage) throws Exception {
	
		//ventana del login
		
		Scene scene = new Scene(loginController.getView(), 320, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();

	}

}
