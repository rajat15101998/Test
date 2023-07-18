public class Employee {
	private int id;
	private String name;
	
	Employee() {
	}
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Employee Created with id:" + this.id + " and name:" + this.name);
	}
	
	public static void main(String[] args) {
		int id = 1;
		String name = "Rajat Singh";
		
		Employee emp = new Employee(id, name);
	}
}