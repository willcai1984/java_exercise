package java_exercise;

//Factory demo
interface Fruit{
	public abstract void eat();
}

class Apple implements Fruit{
	public void eat(){
		System.out.println("Eat Apple");
	}
}

class Orange implements Fruit{
	public void eat(){
		System.out.println("Eat Orange");
	}
}

class Factory{
	public static Fruit getInstance(String className){
		Fruit f=null;
		if("apple".equals(className)){
			f=new Apple();
		}
		if ("orange".equals(className)){
			f=new Orange();
		}
		return f;
	}
}

public class Test07 {
	public static void main(String[] args) {
		Fruit f=null;
		//Fruit f = new Apple();ʵ�����ӽӿ�
		//��������ͨ��args��ֵ�����п������
		f=Factory.getInstance("apple");
		f.eat();
	}

}
