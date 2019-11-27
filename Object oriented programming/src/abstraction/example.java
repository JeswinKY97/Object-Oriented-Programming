package abstraction;

import java.util.*;
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the mark1");
		int n1=sc.nextInt();
		System.out.println("Enter the mark2");
		int n2=sc.nextInt();
		System.out.println("Enter the mark3");
		int n3=sc.nextInt();
		System.out.println("Enter the mark4");
		int n4=sc.nextInt();
		System.out.println("Enter the mark5");
		int n5=sc.nextInt();
		System.out.println("Enter the mark6");
		int n6=sc.nextInt();
		Student s=new Student();
		s.totalmark(name,n1,n2,n3,n4,n5,n6);
		
	}

}

abstract class rank{
	abstract void totalmark(String name,int n1,int n2,int n3,int n4,int n5,int n6);
	
	public void rank1() {
		System.out.println("Rank 2");
		
	}
}
class Student extends rank{
	void totalmark(String name,int n1,int n2,int n3,int n4,int n5,int n6) {
		int sum=n1+n2+n3+n4+n5+n6;
		System.out.println(name);
		System.out.println("total marks"+sum);
		super.rank1();

	}
}