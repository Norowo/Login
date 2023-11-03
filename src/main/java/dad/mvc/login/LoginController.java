package dad.mvc.login;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;

public class LoginController {
	
	private LoginModel model = new LoginModel();
	private LoginView view = new LoginView();
	
	public LoginController() {
		
		//enlazar vista con modelo
		view.getUsuarioText().textProperty().bindBidirectional(model.usuarioValorProperty());
		view.getContrasenaText().textProperty().bindBidirectional(model.contrasenaValorProperty());
		view.getLdapCheckbox().selectedProperty().bindBidirectional(model.ldapValorProperty());
		
		view.getAccederButton().setOnAction(e -> {
			try {
				if(model.autenticar()) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Información");
					alert.setHeaderText("Login realizado con éxito");
					alert.setContentText("Bienvenido " + model.getUsuarioValor());
					alert.showAndWait();
			
				}
				else {
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Información");
					alert.setHeaderText("Fallo en el Login");
					alert.setContentText("Usuario o contraseña erronea");
					alert.showAndWait();
			
				}
			} catch (Exception a) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.initStyle(StageStyle.UTILITY);
				alert.setTitle("Error");
				alert.setHeaderText("Fallo en el Login");
				alert.setContentText("No se puede conectar con el servicio de autentificación");
				alert.showAndWait();
			}
			
		});
		
	}

	public LoginModel getModel() {
		return model;
	}

	public LoginView getView() {
		return view;
	}
	
	
	
	
	

}
