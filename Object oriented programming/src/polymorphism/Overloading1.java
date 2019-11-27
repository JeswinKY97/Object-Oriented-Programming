package polymorphism;
import java.util.*;
public class Overloading1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		Add a=new Add();
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		a.add(n1);
		a.add(n1,n2);
		a.add(n1,n2,n3);
	}
}

class Add{

	public void add(int n1) {
		// TODO Auto-generated method stub
		System.out.println("First number:"+n1);
	}

	public void add(int n1, int n2, int n3) {
		// TODO Auto-generated method stub

		System.out.println("Sum of first two numbers:"+(n1+n2+n3));

	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of first three numbers:"+(n1+n2));

	}
	
}