package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class username_passwrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s=new Scanner(System.in);	
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	 Pattern pattern = Pattern.compile(regex);
	 
	 System.out.println("Username");
		String  emails=s.next();
		Matcher em=pattern.matcher(emails);
		System.out.println("Password");
		String pwd=s.next();
		Matcher mtch= pswNamePtrn.matcher(pwd);
		if(em.matches())
		{
			System.out.println("Valid Email ID");
		}
		else {
			System.out.println("Invalid Email ID");
		}
	 
		if(mtch.matches())
		{
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	 
	}

}
