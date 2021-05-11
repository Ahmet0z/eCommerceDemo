package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.core.adapters.LoginService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void signIn(User user) {
		System.out.println("Giriþ baþarýlý : " + user.getFirstName());
		
	}
	
	@Override
	public void signIn(LoginService service) {
		
		System.out.println("Servis ile giriþ baþarýlý.");
		
	}
	
	@Override
	public void signUp(User user) {
		System.out.println("Kayýt iþlemi baþarýlý.");
		
	}

	
}
