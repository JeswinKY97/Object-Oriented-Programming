



package casestudy;
import java.util.*;
public class booking {
public static int booked[]=new int[25];
			// TODO Auto-generated method stub
   public static void book() {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	Scanner s=new Scanner(System.in);
	int total,b=0,a,c,d,e,i=1;
	System.out.println("Booking");
	System.out.println("Please choose the service required");
	System.out.println("AC/non-Ac(AC/nAC)");
	ac=s.next();
	if(ac.equals("AC")==true)
	{
		a=1000;
	}
	else
	{
		a=750;
	}
	System.out.println("Cot(Single/Double)");
	cot=s.next();
	if(cot.equals("Single")==true)
	{
		b=0;
	}
	else
	{
		b=100;
	}
	System.out.println("Cable(C/nC)");
	cable=s.next();
	if(cable.equals("C")==true)
	{
		c=0;
	}
	else
	{
		c=100;
	}
	System.out.println("Wifi(W/nW)");
	wifi=s.next();
	if(wifi.equals("W")==true)
	{
		d=200;
	}
	else
	{
		d=0;
	}
	System.out.println("Laundry(L/nL)");
	laundry=s.next();
	if(laundry.equals("L")==true)
	{
		e=100;
	}
	else
	{
		e=0;
	}
	total=a+b+c+d+e;
	System.out.println("Total Charge is Rs"+total);
   System.out.println(ac+" room");
   System.out.println(cot+" room");
   System.out.println(wifi+" room");
   System.out.println(laundry+" room");
   System.out.println("Do you want to proceed ?");
   
   String proceed=s.next();
   if(proceed.equals("yes")==true)
   {
	   booked[i]=1;
	   i=i+1;
	   System.out.println("Thank you, Your Room Number is "+i);
   }

}

public void status() {
	// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int f=1;
	for(int i=0;i<25;i++) 
	{
		if(booked[i]==r)
		{
			f=1;
			break;
		}
		else
		{
			f=0;
		}
		
	}
	if(f==1)
	{
		 System.out.println("Booked");
	}
	else
	{
		 System.out.println("Not Booked");
	}
	
	}
}
		



