package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.core.VertificationService;
import eCommerceDemo.core.adapters.LoginService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{	
	
	private ValidationService validation;
	private VertificationService vertification;
	private UserDao dao;
	private LoginService service;
	
	public UserManager(VertificationService vertification,ValidationService validation, UserDao dao) {
		this.validation = validation;
		this.vertification = vertification;
		this.dao = dao;
	}
	public UserManager(LoginService service, UserDao dao) {
		this.service = service;
		this.dao=dao;
	}
	
	@Override
	public void signIn(User user) {
			dao.signIn(user);
	}
	
	@Override
	public void signIn(LoginService service) {
		if (this.service.isLoggedIn()==true) {
			this.dao.signIn(service);
		}else {
			System.out.println("Giriþ baþarýsýz.");
		}
	}
	

	@Override
	public void signUp(User user) {
		
		if (user.getPassword().length()>=6 && 
				user.getFirstName().length()>=2 && 
				user.getLastName().length()>=2 && 
				this.validation.validate(user)==true )
		{
			if (vertification.isClicked()==true) {
				this.dao.signUp(user);
			}}
		else {
			System.out.println("Hatalý bilgi girdiniz.");
			return;	
		}
		
	}
	

}
