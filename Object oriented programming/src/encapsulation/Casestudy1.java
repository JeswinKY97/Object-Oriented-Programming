package encapsulation;

import java.util.*;
public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		Casesub1 c=new Casesub1();
		Casesub2 c1=new Casesub2();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the Address");
		c.setAddress(s.next());
		System.out.println("Enter the contact number");
		c.setCno(s.next());
		System.out.println("Enter the email");
		c.setEmail(s.next());
		System.out.println("Enter the proof type");
		c.setPrtype(s.next());
		System.out.println("Enter the proof ID");
		c.setPrid(s.next()); 
		c1.reg(c.getName(),c.getAddress(),c.getCno(),c.getEmail(),c.getPrtype(),c.getPrid());
	
		
	}

}
