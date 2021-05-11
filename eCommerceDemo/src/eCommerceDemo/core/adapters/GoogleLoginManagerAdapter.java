package eCommerceDemo.core.adapters;

import eCommerceDemo.loginWithGoogle.LoginWithGoogle;

public class GoogleLoginManagerAdapter implements LoginService {

	@Override
	public boolean isLoggedIn() {
		LoginWithGoogle google = new LoginWithGoogle();
		return google.login();
	}

}
