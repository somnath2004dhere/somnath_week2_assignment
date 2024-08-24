package Assignment2;

public class Person {
	public String name;
	public int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void displayname() {
		
		System.out.println("Name : "+name);
	}
	public void displayage() {
		System.out.println("age : "+age);
		
	}


	public static void main(String[] args) {
		
		Person person=new Person("Ram", 21);
		
		person.displayname();
		person.displayage();
	}

}
