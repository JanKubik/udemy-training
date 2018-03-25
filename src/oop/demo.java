package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+" is walking");
	}
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name+" is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {

		// Instantiation an object
		Person person1 = new Person();
		
		// efine properties
		person1.name = "Joe";
		person1.email="joeL@testmail.com";
		person1.phone= "78925687";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sara";
		person2.email="SaraL@testmail.com";
		person2.phone= "11178925687";
		
		person2.sleep();
		
		
		
/*
		// Person
		
		//Atributes,variables,adjectives,descriptors
		String name="Joe";
		String email="joe46@testmail.com";
		String phone ="789456987";
		
		//Action,activity,behaviour
		
		System.out.println(name+ " is walking");
		System.out.println(name+ " is eating");
		
		// what if we want this for another person
		
		//Atributes,variables,adjectives,descriptors
				String name2="Sarah";
				String email2="sarah@testmail.com";
				String phone2 ="7894444987";
				
				//Action,activity,behaviour
				
				System.out.println(name2+ " is walking");
				System.out.println(name2+ " is eating");
				
				// what about attributes bounding together?
						
	}
	
	static void walking(String name){
		System.out.println(name +" is walking");}
	*/	
	}

}


