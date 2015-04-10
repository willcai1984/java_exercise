package java_exercise;
//Demo Class part

//外部直接访问内部变量，不安全，也没有校验
class Person {
	String name;
	int age;

	public void tell(){
		System.out.println("Name is "+name+", Age is "+ age);
	}
}

//使用set、get方法。可以对设置值进行判断
class Person_sg {
	private String name;
	private int age;

	public void tell(){
		System.out.println("Name is "+name+", Age is "+ age);
	}
	
	public void setname(String n){
		name=n;
	}
	public String getname(){
		return name;
	}
	
	public void setage(int a){
		//Can judge the a whether match normal range here
		age=a;
	}
	public int getage(){
		return age;
	}
}

//Class init parameters
class Person_init {
	private String name;
	private int age;
	//由于是本class的构造函数，所以不需要void或者类型等申明
	public Person_init(String name, int age){
		this.setname(name);
		this.setage(age);
	}
	
	/*
	 * 效果是一样的
	public Person_init(String n, int a){
		name=n;
		age=a;
	}	
	*/
	
	public void tell(){
		System.out.println("Name is "+name+", Age is "+ age);
	}
	
	public void setname(String n){
		name=n;
	}
	public String getname(){
		return name;
	}
	
	public void setage(int a){
		//Can judge the a whether match normal range here
		age=a;
	}
	public int getage(){
		return age;
	}
}

// 演示class部分
public class Test03 {
	public static void main(String[] args) {
		Person per1=new Person();
		per1.name="Jack";
		per1.age=20;
		Person per2=new Person();
		per2.name="Tom";
		per2.age=25;
		per1.tell();
		per2.tell();
		
		
		Person_sg per3=new Person_sg();
		per3.setname("Will");
		per3.setage(31);
		per3.tell();
		
		Person_init per4=new Person_init("Sindy",3);
		per4.tell();
	}
}
