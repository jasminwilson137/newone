package corejava;

public class EmailValidator 
{
	public static void main(String[] args) {
		String email="jasminwilson137@gm.com";
		int iat =email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(iat==email.lastIndexOf('@') && idot == email.lastIndexOf('.') 
				&& iat>3 && idot >(iat+3) && email.length()>(idot+2))
			System.out.println("valid email address");
		
		else
			System.out.println("Invalid email address");
		
	}
}
