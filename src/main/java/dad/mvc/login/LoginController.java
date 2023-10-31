package dad.mvc.login;

public class LoginController {
	
	private LoginModel model = new LoginModel();
	private LoginView view = new LoginView();
	
	public LoginController() {
		
		
	}

	public LoginModel getModel() {
		return model;
	}

	public LoginView getView() {
		return view;
	}
	
	

}
