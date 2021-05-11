package eCommerceDemo.business.concretes;

import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.ValidationService;

public class MailValidationManager implements ValidationService {
	
	Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
	
	@Override
	public boolean validate(String mail) {
		if (p.matcher(mail) != null) {
			return true;
		}else {
			System.out.println("Geçersiz mail adresi girdiniz.");
			return false;
		}
	}

	
	
}	
