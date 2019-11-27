package casestudy;

import java.util.Scanner;

public class case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		Scanner s=new Scanner(System.in);
		
		int total,b=0,a,c,d,e,i=1;
		System.out.print("Booking");
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
		System.out.println("The cost is Rs"+total);
		System.out.println(ac+","+cot+","+cable+","+wifi+","+laundry+" room");

	}

}
