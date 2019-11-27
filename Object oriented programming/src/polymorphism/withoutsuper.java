package polymorphism;

public class withoutsuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ABCD obj1=new ABCD();
		obj1.disp();
		Demo1 obj=new Demo1();
		obj.disp();
}

}
class Demo1 extends ABCD{

public void disp() {
// TODO Auto-generated method stub

System.out.println("Child class");
}

}
class ABCD{
public void disp()
{
System.out.println("Parent class");
}
}