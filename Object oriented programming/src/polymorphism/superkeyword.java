package polymorphism;
import java.util.*;
public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj=new Demo();
				obj.disp();
	}

}
class Demo extends ABC{

	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("Child class");
	}
	
}
class ABC{
	public void disp()
	{
		System.out.println("Parent class");
	}
}