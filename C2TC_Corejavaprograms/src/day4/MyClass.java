package day4;

public class MyClass {
	private static MyClass obj = new MyClass();
	private int id;
	private String name;
	
	
	public static MyClass getObj() {
		return obj;
	}
	public static void setObj(MyClass obj) {
		MyClass.obj = obj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	private MyClass() {
		super();
		
	}
    
}