package eCommerceDemo.business.abstracts;

import eCommerceDemo.core.adapters.LoginService;
import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void signIn(User user);
	void signIn(LoginService service);
	void signUp(User user);

}
