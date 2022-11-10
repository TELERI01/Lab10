package LAb10;

public class Person {

	private String name;
	private final int age;
	
	public Person(String initialName) {
		this.name=initialName;
		this.age=0;
	}
	public Person(String initialName, int age) {
		this.name=initialName;
		this.age= age;
	}
	
	public void printPerson() {
		System.out.println("Name: " + this.name + " Age: " + this.age );
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return this.age;
	}
	
	
}
