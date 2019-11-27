package encapsulation;
import java.util.*;

public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Casesub21 c=new Casesub21();
		
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
		//c.reg(c.getName(),c.getAddress(),c.getCno(),c.getEmail(),c.getPrtype(),c.getPrid());
	c.check();
	}

}
