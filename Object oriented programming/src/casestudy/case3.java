package casestudy;
import java.util.Scanner;
public class case3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i=1;
int da;
int db;
String[] c=new String[25];
String[] e=new String[25];
String NO,re;
//REG
do {
System.out.println("Registration");
System.out.println("Enter the Name :");
c[i]=sc.next();
System.out.println("Enter the address :");
String address=sc.next();
System.out.println("Enter your contact Number :");
String cn=sc.next();
System.out.println("E-mail id :");
e[i]=sc.next();
System.out.println("Enter proof id:");
String ptype=sc.next();
System.out.println("Thank you for registering,your proof Id "+i);
System.out.println("Do you want to register(yes/no) :");
NO=sc.next();
if(NO.equals("yes")==true)
{

booking();

}
i++;
System.out.println("Do you want to continue registration(yes/no) :");
re=sc.next();
}
while(re.equals("yes")==true);
display(e,c,i);
view(i);

}
private static void view(int i) {
// TODO Auto-generated method stub
System.out.println("View all Booking");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Start Date:");
int da = sc.nextInt();
System.out.println("Enter the End Date:");
   int db = sc.nextInt();
   System.out.println("Rooms booked dates are "+ da + "to"+ db +".");
   System.out.println("Room number           Customer ID");
   for(int k=1;k<i;k++)
   {
    System.out.println(i-1+"             "+k);
   }
   
}
private static void display(String[] e, String[] c, int i) {

System.out.println("Customer ID      Customer Name        Email");
for(int k=1;k<i;k++)
{
System.out.println(k+"                "+c[k]+"               "+e[k]);
}

}



private static void booking() {
// TODO Auto-generated method stub

String ac,pr;
String cot;
String cable;
String wifi;
String laundry;
Scanner sc=new Scanner(System.in);
int total,b=0,c,e,d,f,i=1;
do {
System.out.println(" Welcome to Booking");
System.out.println("Please choose the service requested");
System.out.println("AC/non-AC(AC/nAC)");

ac=sc.next();
if(ac.contentEquals("AC")==true)
{
b=1500;
}
else
{
b=700;
}

System.out.println("single cot/double cot(S/D)");
cot=sc.next();
if(cot.equals("S")==true)
{
c=50;
}
else
{
c=100;
}
System.out.println("with cable connection/without cable connection(C/NC)");
cable=sc.next();
if(cable.equals("C")==true)
{
d=50;
}
else
{
d=0;
}
System.out.println("wifi needed or not(W/NW)");
wifi=sc.next();
if(wifi.equals("W")==true)
{
e=200;
}
else
{
e=0;
}
System.out.println("laundry service needed or not(L/NL)");
laundry=sc.next();
if(laundry.equals("L")==true)
{
f=100;
}
else
{
f=0;
}
total=b+c+d+e+f;
System.out.println("The total charge is Rs:"+total);
System.out.println("The service choosen are:");
if(b==1500)
{
System.out.println("AC");
}
else
{
System.out.println("non AC");		
}
if(c==50)
{
System.out.println("single cot");
}
else
{
System.out.println("double cot");
}
if(d==50)
{
System.out.println("cable connection enabled");
}
else
{
System.out.println(" cable connection not enabled");
}
if(e==200)
{
System.out.println("wifi enabled");
}
else
{
System.out.println("wifi not enabled");
}
if(f==100)
{
System.out.println("with laundry services");
}
else
{
System.out.println("without laundry services");
}

System.out.println("Do you want to proceed? (YES/NO)");
  pr=sc.next();}
while(pr.equals("NO"));
{
if(pr.contentEquals("YES")==true)
{

System.out.println("Thank you  for booking.. !!! \n Your room number is "+i);
i=i+1;
}
}


}
}
