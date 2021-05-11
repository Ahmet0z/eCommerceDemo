package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.entities.concretes.User;

public class MailValidationManager implements ValidationService {
	
	 String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	   Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
	@Override
	public boolean validate(User user) {
		Matcher matcher = emailPattern.matcher(user.getMail());
        if (matcher.matches()){
            return true;
        }else {
                return false;
        }
	}

	
	
}	
