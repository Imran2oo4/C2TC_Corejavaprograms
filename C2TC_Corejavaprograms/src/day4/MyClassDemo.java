package day4;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj = MyClass.getObj();
		
		obj.setId(101);
		obj.setName("imran");
		
		MyClass obj1  = MyClass.getObj();
		System.out.println(obj);
		System.out.println(obj1);
		

	}

}
