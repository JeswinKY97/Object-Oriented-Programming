package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Pattern nameptrn = Pattern.compile("^[a-z]*$");
		 Pattern mailptrn = Pattern.compile( "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
		 Pattern num = Pattern.compile("^[0-9]{1,7}$");
		 Pattern yr = Pattern.compile("^[0-9]{1,4}$");
		 Pattern dp = Pattern.compile("^[A-Z][.][A-Za-z ]*$");
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");

		 System.out.println("Registration");
		System.out.println("Name");
		String name=s.next();
		Matcher nm=nameptrn.matcher(name);
		System.out.println("Email ID");
		String email=s.next();
		Matcher em=mailptrn.matcher(email);
		System.out.println("Reg No");
		String regno=s.next();
		Matcher reg=num.matcher(regno);
		System.out.println("Rank");
		String rank=s.next();
		Matcher rnk=num.matcher(rank);
		System.out.println("Year");
		String year=s.next();
		Matcher y=yr.matcher(year);
		System.out.println("Dep");
		String dep=s.next();
		Matcher dept=dp.matcher(dep);
		
		if(nm.matches() && em.matches() && reg.matches() && rnk.matches() && y.matches() && dept.matches())
		{
			System.out.println("Login");
			System.out.println("email\n"+email);
			System.out.println("Password");
			String pwd=s.next();
			Matcher mtch= pswNamePtrn.matcher(pwd);
			if(mtch.matches())
			{
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
			
					
		}
		
		
	}

}
