package polymorphism;

public class Currentbill {

	public void Bill(int bn, String custname, int uc, int costu) {
		// TODO Auto-generated method stub
		System.out.println("Bill Number:" +bn);
		System.out.println("Customer Name:" +custname);
		double x = uc*costu;
		System.out.println("Customer Cost Bill=" +x);
	}

}
