package java_exercise;

//Class extend Demo
////Part1 normal class extend
class Person_e {
	private String name;
	private int age;

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}

	public void setage(int age) {
		// Can judge the a whether match normal range here
		this.age = age;
	}

	public int getage() {
		return age;
	}
}

// //Class student is extent from Person_e
class Student extends Person_e {
	private String school;

	public void setschool(String school) {
		this.school = school;
	}

	public String getschool() {
		return this.school;
	}

}

// //Part2 normal class with parameters extend
class Person_ep {
	private String name;
	private int age;

	public Person_ep(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}

	public void setage(int age) {
		// Can judge the a whether match normal range here
		this.age = age;
	}

	public int getage() {
		return age;
	}
}

class Student_ep extends Person_ep {
	private String school;

	public Student_ep(String name, int age, String school) {
		// key part, the father struc command must be the first line of child's
		super(name, age);
		this.school = school;
	}

	public void setschool(String school) {
		this.school = school;
	}

	public String getschool() {
		return this.school;
	}

}

public class Test05 {
	public static void main(String[] args) {
		Student st = new Student();
		st.setname("Will");
		st.setage(32);
		st.setschool("XiDian");
		System.out.println("Name is " + st.getname() + ",Age is " + st.getage()
				+ ",School is " + st.getschool());
		Student_ep st_ep = new Student_ep("Amy", 30, "Xidian");
		System.out.println("Name is " + st_ep.getname() + ",Age is "
				+ st_ep.getage() + ",School is " + st_ep.getschool());
	}
}
