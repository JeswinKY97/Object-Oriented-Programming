package polymorphism;
import java.util.*;

public class studdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Stud st=new Stud();
		System.out.println("Student Details");
		System.out.println("Name");
		String name=s.next();
		System.out.println("Enter mark 1");
		int n1=s.nextInt();
		System.out.println("Enter mark 2");
		int n2=s.nextInt();
		System.out.println("Enter mark 3");
		int n3=s.nextInt();
		System.out.println("Enter mark 4"); 
		int n4=s.nextInt();
		System.out.println("Enter mark 5");
		int n5=s.nextInt();
		System.out.println("Enter mark 6");
		int n6=s.nextInt();
		int tot=n1+n2+n3+n4+n5+n6;
		st.stud(n1,n2,n3,n4,n5,n6,tot);
		st.stud(tot);

		
	}

}

class Stud{

	public void stud(int n1, int n2, int n3, int n4, int n5, int n6,int tot) {
		// TODO Auto-generated method stub
		int avg=tot/6;
		System.out.println("Average: "+avg);
		
	}

	public void stud(int tot) {
		// TODO Auto-generated method stub
		
		
		if (tot>=450)
		{
			System.out.println("1st Rank");
		}
		else if(tot<450 && tot>=400)
		{
			System.out.println("2nd Rank");
		}
		else if(tot<400 && tot>=350)
		{
			System.out.println("3rd Rank");
		}
		else if(tot<350 && tot>=300)
		{
			System.out.println("4rth Rank");
		}
		else
		{
			System.out.println("Failed");
		}
			
			
	}
	
}