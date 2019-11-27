package casestudy;
import java.util.*;
public class case1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booking n=new booking();
Scanner s=new Scanner(System.in);
System.out.println("MENU");
System.out.println("1) Booking");
System.out.println("2) Status");
System.out.println("3) Exit");
int m=s.nextInt();
switch(m)
{
case 1:
	n.book();
	break;
case 2:
	n.status();
	break;
case 3:
System.out.println("exit");
	break;
}


	}}

