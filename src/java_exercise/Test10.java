package java_exercise;

//����,p307
//ϣ��һ�����������ܹ�ͬʱ����3����������

/*Normal type
 class Point {
 private Object x;
 private Object y;

 public void setX(Object x) {
 this.x = x;
 }

 public void setY(Object y) {
 this.y = y;
 }

 public Object getX() {
 return this.x;
 }

 public Object getY() {
 return this.y;
 }
 }
 */
//����example
class Point<T> {
	private T var;

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}
}

public class Test10 {
	public static void main(String[] args) {
		/*
		 * normal type Point p = new Point(); p.setX(10);// �Զ�װ��
		 * int--Integer--Object p.setY(20);// �Զ�װ�� int--Integer--Object int x =
		 * (Integer) p.getX();// �ȱ�ΪInteger���ͣ����Զ����� int y = (Integer)
		 * p.getY();// �ȱ�ΪInteger���ͣ����Զ����� System.out.println("X is " + x);
		 * System.out.println("Y is " + y); p.setX(10.0f);// �Զ�װ�� p.setY(20.1f);
		 * float xf = (Float) p.getX();// �ȱ�ΪFloat���ͣ����Զ����� float yf = (Float)
		 * p.getY(); System.out.println("X is " + xf);
		 * System.out.println("Y is " + yf); p.setX("left 10");// �Զ�װ��
		 * p.setY("right 20"); String xs = (String) p.getX();// �ȱ�ΪFloat���ͣ����Զ�����
		 * String ys = (String) p.getY(); System.out.println("X is " + xs);
		 * System.out.println("Y is " + ys);
		 */
		Point<Integer> p = new Point<Integer>();
		p.setVar(30);
		System.out.println("Var is " + p.getVar());
		
		Point<Float> pf = new Point<Float>();
		pf.setVar(30.0f);
		System.out.println("Var is " + pf.getVar());
		
		Point<String> ps = new Point<String>();
		ps.setVar("Left 10");
		System.out.println("Var is " + ps.getVar());
		
	}
}