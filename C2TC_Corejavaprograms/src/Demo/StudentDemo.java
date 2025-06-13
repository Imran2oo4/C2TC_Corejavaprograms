package Demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setId(101);
		st.setName("Imran");
		st.setAge(20);	
		System.out.println(st);
		
		Student st1 = new Student();
		st1.setId(101);
		st1.setName("Imran");
		st1.setAge(20);
		System.out.println(st1);
		
	}
}