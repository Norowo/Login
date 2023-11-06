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
					alert.setTitle("Iniciar sesión");
					alert.setHeaderText("Acceso permitido");
					alert.setContentText("Las credenciales de acceso son válidas");
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
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o la contraseña no son válidos.");
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
