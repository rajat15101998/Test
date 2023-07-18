import java.util.*;

public class Employee {
	private int id;
	private String name;
	
	Employee() {
		System.out.println("Employee Created");
	}
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		int id = 1;
		String name = "Rajat Singh";
		
		Employee emp = new Employee(id, name);
	}
}