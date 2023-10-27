package dad.mvc.login;

import javafx.geometry.Insets;
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
		ldapCheckbox = new CheckBox("Usar LDAP");
		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");
		
		HBox usuarioBox = new HBox(5, new Label("Usuario:"), usuarioText);
		HBox contrasenaBox = new HBox(5, new Label("Contraseña:"), contrasenaText);
		HBox botonesHBox = new HBox(5, accederButton, cancelarButton);
		
		setPadding(new Insets(5));
		
		
		
	}
															

}
