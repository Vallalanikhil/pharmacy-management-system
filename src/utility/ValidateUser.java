package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {


	public boolean validate(String email, String password) {
		
	
		if(email.equals("admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}

	public boolean validmobileNo(CharSequence mobileNo) {
	
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(mobileNo);
		if(m.matches()) {
			return true;
		}
		else
		{
		return false;
	}
	}
	
	  public static boolean isValidUsername(String patientName) 
	    { 
	        String regex = "^[aA-zZ]\\w{5,29}$"; 
	        Pattern p = Pattern.compile(regex); 
	  
	        if (patientName == null) { 
	            return false; 
	        } 
	  
	        Matcher m = p.matcher(patientName);  
	        return true; 
	    } 

}
