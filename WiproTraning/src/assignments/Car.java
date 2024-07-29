package assignments;

public class Car {
	String company = "mahindhra";
	String model  = "SUV700";
	int year = 2022;
	public void displayInfo() {
		System.out.println("Company name "+company);
		System.out.println("car Model "+model);
		System.out.println("manufacured year "+year);
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.displayInfo();

	}

}
