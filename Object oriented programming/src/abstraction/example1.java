package abstraction;
import java.util.*;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the name");
	        String name=sc.next();
	        System.out.println("Enter the ID");
	        int id=sc.nextInt();
	        System.out.println("Enter the total");
	        int t=sc.nextInt();
	        Students s = new Students();
	        s.detail(name, id);
	        s.total(t);
	    }
	}
	interface rankss{
	    public  void detail(String name, int id);
	}
	interface total{
	    public  void total(int t);
	}
	class Students implements rankss,total{
	    public void detail(String name, int id)
	    {
	        System.out.println("Name ->"+name);
	        System.out.println("Student ID ->"+id);
	    }    
	    public void total(int t) {
	        System.out.println("Total ->"+t);
	        
	}

}
