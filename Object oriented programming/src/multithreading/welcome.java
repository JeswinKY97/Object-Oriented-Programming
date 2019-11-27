package multithreading;

import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		F t=new F();
		t.start();
	}

}

class F extends Thread{
	public void run() {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int l=a.length();
		for(int i=0;i<l;i++)
		{
			try {
				char c=a.charAt(i);
				System.out.println(c);
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}

}
