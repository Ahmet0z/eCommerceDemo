package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.MailValidationManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.MailVertificationService;
import eCommerceDemo.core.adapters.GoogleLoginManagerAdapter;
import eCommerceDemo.core.adapters.LoginService;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Ahmet","Özpolat","ahmetoz@gmail.com","sifrembu1212");
		
		LoginService loginService = new GoogleLoginManagerAdapter();
		UserService manager = new UserManager(loginService, new HibernateUserDao());
		manager.signIn(loginService);
		
		UserService service = new UserManager(new MailVertificationService(), new MailValidationManager(), new HibernateUserDao());
		service.signIn(user1);
	}

}
