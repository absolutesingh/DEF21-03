package coreJava;

class Student{
	int rollNo;
	String name;
	Student()
	{
		
	}
	Student(int rollNo, String name) //used to initialize the object
	{
		this.rollNo = rollNo;
		this.name = name;
	}
}

public class ConstructorStudy {

	public static void main(String[] args) {
		Student s1 = new Student(); //new keyword calling the default constructor
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		s1.rollNo = 1;
		s1.name = "Ram";
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		
		Student s2 = new Student(2, "Sham"); 
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
	}

}
