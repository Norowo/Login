package dad.mvc.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
		
		usuarioText = new TextField();
		contrasenaText = new PasswordField();
		ldapCheckbox = new CheckBox("Usar LDAP");
		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");
		
		usuarioText.setPromptText("Nombre del usuario");
		contrasenaText.setPromptText("Contraseña del usuario");
		
		GridPane usuarioContrasenaPane = new GridPane();
		usuarioContrasenaPane.addRow(0, new Label("Usuario:"), usuarioText);
		usuarioContrasenaPane.addRow(1, new Label("Contraseña:"), contrasenaText);
		usuarioContrasenaPane.setAlignment(Pos.CENTER);
		usuarioContrasenaPane.setHgap(5);
		usuarioContrasenaPane.setVgap(5);
	
		HBox botonesHBox = new HBox(5, accederButton, cancelarButton);
		botonesHBox.setAlignment(Pos.CENTER);
		
		setSpacing(10);
		setAlignment(Pos.CENTER);
		getChildren().addAll(usuarioContrasenaPane,ldapCheckbox, botonesHBox);
		
		
		
		
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getContrasenaText() {
		return contrasenaText;
	}

	public CheckBox getLdapCheckbox() {
		return ldapCheckbox;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
															

}
