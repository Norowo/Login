package dad.mvc.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	
	private StringProperty usuarioValor = new  SimpleStringProperty();
	private StringProperty contrasenaValor = new SimpleStringProperty();
	private BooleanProperty ldapValor = new SimpleBooleanProperty();
	public final StringProperty usuarioValorProperty() {
		return this.usuarioValor;
	}
	
	public final String getUsuarioValor() {
		return this.usuarioValorProperty().get();
	}
	
	public final void setUsuarioValor(final String usuarioValor) {
		this.usuarioValorProperty().set(usuarioValor);
	}
	
	public final StringProperty contrasenaValorProperty() {
		return this.contrasenaValor;
	}
	
	public final String getContrasenaValor() {
		return this.contrasenaValorProperty().get();
	}
	
	public final void setContrasenaValor(final String contrasenaValor) {
		this.contrasenaValorProperty().set(contrasenaValor);
	}
	
	public final BooleanProperty ldapValorProperty() {
		return this.ldapValor;
	}
	
	public final boolean isLdapValor() {
		return this.ldapValorProperty().get();
	}
	
	public final void setLdapValor(final boolean ldapValor) {
		this.ldapValorProperty().set(ldapValor);
	}
	
	
	
}
