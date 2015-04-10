package java_exercise;
//Demo Class part

//�ⲿֱ�ӷ����ڲ�����������ȫ��Ҳû��У��
class Person {
	String name;
	int age;

	public void tell(){
		System.out.println("Name is "+name+", Age is "+ age);
	}
}

//ʹ��set��get���������Զ�����ֵ�����ж�
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
	//�����Ǳ�class�Ĺ��캯�������Բ���Ҫvoid�������͵�����
	public Person_init(String name, int age){
		this.setname(name);
		this.setage(age);
	}
	
	/*
	 * Ч����һ����
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

// ��ʾclass����
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
