package dad.mvc.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller implements Initializable {

	// model
	private StringProperty usuarioValor = new SimpleStringProperty();
	private StringProperty contrasenaValor = new SimpleStringProperty();
	private BooleanProperty ldapValor = new SimpleBooleanProperty();
	private AuthService servicioAutentificacion;

	// view

	@FXML
	private Button accederButton;

	@FXML
	private HBox botonesHBox;

	@FXML
	private Button cancelarButton;

	@FXML
	private TextField contrasenaText;

	@FXML
	private CheckBox ldapCheckbox;

	@FXML
	private VBox view;

	@FXML
	private GridPane usuarioContrasenaPane;

	@FXML
	private TextField usuarioText;


	public Controller() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LoginView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		usuarioText.textProperty().bindBidirectional(usuarioValor);
		contrasenaText.textProperty().bindBidirectional(contrasenaValor);
		ldapCheckbox.selectedProperty().bindBidirectional(ldapValor);
		

	}
	
	public VBox getView() {
		return view;
	}
	
	public boolean autenticar() throws Exception {
		if(ldapValor.get()) {
			servicioAutentificacion = new LdapAuthService();
		} else {
			servicioAutentificacion = new FileAuthService();
		}
		
		return servicioAutentificacion.login(usuarioValor.get(), contrasenaValor.get());
	}
	
	@FXML
	private void onAccederAction(ActionEvent event) {
		System.out.println(usuarioValor + ", " +  contrasenaValor);
		try {
			if(autenticar()) {
				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son válidas");
				alert.showAndWait();
		
			}
			else {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Iniciar sesión");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o la contraseña no son válidos.");
				alert.showAndWait();
		
			}
		} catch (Exception a) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Iniciar sesión");
			alert.setHeaderText("Acceso denegado");
			alert.setContentText("El usuario y/o la contraseña no son válidos.");
			alert.showAndWait();
		}
	}
}
