package exceptionhandling;

public class error1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[]= {1,2,3,4};
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
