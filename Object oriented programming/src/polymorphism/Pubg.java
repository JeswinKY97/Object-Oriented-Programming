package polymorphism;
import java.util.*;

public class Pubg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Kills k=new Kills();
		System.out.println("No. of squad members");
		int sq=s.nextInt();
		System.out.println("No. of kills by Guns");
		int n1=s.nextInt();
		System.out.println("No. of kills by Knife");
		int n2=s.nextInt();
		System.out.println("No. of kills by Grenade");
		int n3=s.nextInt();
		System.out.println("No. of kills by Vehicle");
		int n4=s.nextInt();
		int tk=n1+n2+n3+n4;
		int ts=(n1*10)+(n2*30)+(n3*20)+(n4*50);
		k.kill(n1,n2,n3,n4);
		k.kill(sq);
		k.kill(tk,ts);
		
	}

}

class Kills{

	public void kill(int n1, int n2, int n3, int n4) {
		// TODO Auto-generated method stub
		if(n1>n2 && n1>n3 && n1>n4)
		{
			System.out.println("Gun Expert");
		}
		if(n2>n1 && n2>n3 && n2>n4)
		{
			System.out.println("Knife Expert");
		}
		if(n3>n1 && n3>n2 && n3>n4)
		{
			System.out.println("Grenade Expert");
		}
		if(n4>n1 && n4>n3 && n4>n2)
		{
			System.out.println("Vehicle Expert");
		}
	
		
	}

	public void kill(int tk, int ts) {
		// TODO Auto-generated method stub-------------------=
		System.out.println("Total kills: "+tk);
		System.out.println("Total Score: "+ts);
	}

	public void kill(int sq) {
		// TODO Auto-generated method stub
		if(sq==1)
		{
			System.out.println("Single Fighter");
		}
		else if(sq>1 && sq<=4)
		{
			System.out.println("Supporter");	
		}
		else
		{
			System.out.println("Invalid squad");
		}}
	
}