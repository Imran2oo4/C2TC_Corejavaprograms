package Polymorphism.overloadingexample;

public class Person {
	private int pid;
	private String name;
	private String city;
	
	public Person ()
	{
		this.pid = 100;
		this.name = "imran";
		this.city = "chennai";
	}
	public Person(int pid, String name)
	{
		this.pid = pid;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	

}
