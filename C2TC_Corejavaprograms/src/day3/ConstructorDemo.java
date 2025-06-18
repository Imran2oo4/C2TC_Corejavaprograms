package day3;

public class ConstructorDemo {
	public static void main (String args[]) {
		ConstructorClassDemo ct;
		ct = new ConstructorClassDemo();
		ct.setCustomerId(101);
		ct.setCustomerName("john");
		ct.setCustomerCity("Chennai");
		System.out.println(ct);
		
		ConstructorClassDemo ct1;
		ct1 = new ConstructorClassDemo();
		ct1.setCustomerId(102);
		ct1.setCustomerName("jack");
		ct1.setCustomerCity("Chennai");
		System.out.println(ct1);
	}
}