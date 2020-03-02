
class Person {
	// Classes contain 
	// 1. data
	// 2. Subroutines (methods)
	
	// Instance variables (data or state)
	String name;
	int age;
	
	// behaviour
	void speak() {
		
		System.out.println( "My name is: " + name + " and I am " + age + " years old.");
	}
	
	void sayHello() {
		
		System.out.println( "Hello there!");
	}
	
	int calculateYearsToRetirement() {
		
		int yearsLeft = 66 - age;
		return yearsLeft;
	}
	
	int getAge() {
		
		return age;
	}
	
	String getName() {
		
		return name;
	}
	
}

public class ClassesObjectsApp {

	public static void main(String[] args) {
		
		Person firstPerson = new Person();
		firstPerson.name = "Joe Bloggs";
		firstPerson.age = 25;
		firstPerson.speak();
		firstPerson.sayHello();
		
		String name = firstPerson.getName();
		int age = firstPerson.getAge();
		
		System.out.println( "Name is: " + name );
		System.out.println( "Age is: " + age );
		
		int years = firstPerson.calculateYearsToRetirement();
		System.out.println( "I have " + years + " years to go before I retire" );
		
		Person secondPerson = new Person();
		secondPerson.name = "Sarah Smith";
		secondPerson.age = 20;
		secondPerson.speak();
		secondPerson.sayHello();
		
		System.out.println( firstPerson.name );
	}

}
