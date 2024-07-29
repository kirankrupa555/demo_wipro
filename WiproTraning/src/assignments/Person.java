package assignments;

public class Person {
    String name = "krupa kiran";
    int age   = 23;
    public static void greet() {
    	System.out.println("welocome "+new Person().name);
    }
	public static void main(String[] args) {
		Person obj = new Person();
		System.out.println(obj.name);
		System.out.println(obj.age);
		greet();
	}

}
