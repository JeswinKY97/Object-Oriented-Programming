package encapsulation;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s=new Scanner(System.in);
		Student1 c=new Student1();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the id");
		c.setId(s.next());
		System.out.println("Name: "+c.getName());
		System.out.println("ID: "+c.getId());
	}

}
