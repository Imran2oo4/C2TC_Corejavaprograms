//This program to demonstrate Trainer sub class or derived
package day5.tnsif.singleinheritance.Demo;

public class Trainer extends Person{
	private String designation;
	private String location;
	
	public Trainer()
	{
		super();//calling base class constructor
		this.designation="Java trainer";
		this.location="Chennnai";
	}
	public Trainer(int id, String name, String city, String designation, String location)
	{
		super(id,name,city);//calling base class parameterized constructor
		this.designation=designation;
		this.location=location;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [id:"+getId() +"Name:" +getName()+ "City:" + getCity() +"designation=" + designation + ", location=" + location + "]";
	}
	

}
