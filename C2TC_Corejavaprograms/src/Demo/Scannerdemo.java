package Demo;
import java.util.Scanner;
public class Scannerdemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter your salalry ");
		double salary = scan.nextDouble();
		
		System.out.println("Name :  "  + name);
		System.out.println("Age : " + age);
		System.out.println("Salary : " + salary);
		
		scan.close();

	}

}
fffffffddddfff