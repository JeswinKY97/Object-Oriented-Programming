package polymorphism;
import java.util.*;
public class casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1) Car\n2) Bike");

		Car c=new Car();
		Bike b=new Bike();
		int n=s.nextInt();
		switch(n)
		{
		case 2:
			System.out.println("Enter the details of bike");
			System.out.println("Enter the color");
			String n1=s.next();
			System.out.println("Enter the maximum speed");
			int n2=s.nextInt();
			System.out.println("Enter the number of seats");
			int n3=s.nextInt();
			System.out.println("Enter the number of wheels");
			int n4=s.nextInt();
			System.out.println("Enter the status of diskbreak(true/false)");
			String n5=s.next();
			b.displayDetails(n1,n2,n3,n4,n5);
			break;
		case 1:
			System.out.println("Enter the details of car");
			System.out.println("Enter the color");
			String m1=s.next();
			System.out.println("Enter the maximum speed");
			int m2=s.nextInt();
			System.out.println("Enter the number of seats");
			int m3=s.nextInt();
			System.out.println("Enter the number of wheels");
			int m4=s.nextInt();
			System.out.println("Enter the number of doors");
			int m5=s.nextInt();
			System.out.println("Enter the status of AC(true/false)");
			String m6=s.next();
			c.displayDetails(m1,m2,m3,m4,m5,m6);
			break;
			default:
			System.out.println("Invalid input");

		}
	}

}
class Bike{

	public void displayDetails(String n1, int n2, int n3, int n4, String n5) {
		// TODO Auto-generated method stub
		System.out.println("Bike Details");
		System.out.println("Color: "+n1);
		System.out.println("Maximum Speed: "+n2);
		System.out.println("Number of Seats: "+n3);
		System.out.println("Number of Wheels: "+n4);
		System.out.println("Disk Break: "+n5);




		


	}

}
class Car{

	public void displayDetails(String m1, int m2, int m3, int m4, int m5, String m6) {
		// TODO Auto-generated method stub
		
		System.out.println("Car Details");
		System.out.println("Color: "+m1);
		System.out.println("Maximum Speed: "+m2);
		System.out.println("Number of Seats: "+m3);
		System.out.println("Number of Wheels: "+m4);
		System.out.println("Number of doors: "+m5);
		System.out.println("AC: "+m6);
	}
	
}