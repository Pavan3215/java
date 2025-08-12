class Person {
    String name;
    int age;
    Person() {
    }
    Person(String name, int age) {
    	this.name=name;
	this.age=age;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;
    String usn;
    
    Student() {
    }

    Student(String name,int age,String course,String usn) {
	super(name,age);
	this.course=course;
	this.usn=usn;
    }
    void displayStudentDetails() {
        displayDetails(); // calling parent class method
        System.out.println("Course: " + course);
	System.out.println("USN: " + usn);
    }
}

class Employee extends Person {
	private String emp_id;
	private double salary;
	
	Employee() {
	}
	Employee(String ename,int age,String id, double sal) {
		super(ename,age);
		emp_id=id;
		salary=sal;
	} 
	void getEmpDetails() {
	displayDetails();
	System.out.println("Emp Id : " +emp_id);
	System.out.println("Salary : " +salary);	
	}
}

public class Prog3a {
    public static void main(String[] args) {
        Student p = new Student();
	Student s = new Student("Riya",20,"MCA","1NT24MCA25");
	Employee e = new Employee("Ullas",28,"12INF01451",45700);
        p.name = "Arun";
        p.age = 21;
        
	System.out.println("---------------------");
	System.out.println("Person Details");
	System.out.println("---------------------");
	p.displayDetails();
	System.out.println("---------------------");
	System.out.println("Student Details");
        System.out.println("---------------------");
	s.displayStudentDetails();
	System.out.println("---------------------");
	System.out.println("Employee Details");
        System.out.println("---------------------");
	e.getEmpDetails();
    }
}
