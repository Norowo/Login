package dad.mvc.login;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
	
	private TextField usuarioText;
	private PasswordField contrasenaText;
	private CheckBox ldapCheckbox;
	private Button accederButton;
	private Button cancelarButton;
	
	public LoginView() {
		super();
		
		usuarioText = new TextField("Nombre de usuario");
		contrasenaText = new PasswordField();
		
		HBox usuarioBox = new HBox(5, new Label("Usuario:"), usuarioText);
		HBox contrasenaBox = new HBox(5, new Label("Contraseña:"), contrasenaText);
		
	}
															

}
