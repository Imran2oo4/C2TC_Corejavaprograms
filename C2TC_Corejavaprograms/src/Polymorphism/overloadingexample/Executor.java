package Polymorphism.overloadingexample;

public class Executor {

	public static void main(String[] args) {
		System.out.println("1.Addition :"+OverloadingExample.addition(0, 0));
		System.out.println("2.Addition :"+OverloadingExample.addition(9.999f, 4.66665f));
		System.out.println("3.Addition :"+OverloadingExample.addition(3,9.7897f));
		System.out.println("4.Addition :"+OverloadingExample.addition("imran", "imran"));
		
		Person p1=new Person();
		System.out.println(p1);
		
		Person p2 = new Person (101,"hema");
		System.out.println(p2);
	}

}
