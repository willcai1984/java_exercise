package java_exercise;

//泛型,p307
//希望一个变量类型能够同时接受3种数据类型

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
//泛型example
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
		 * normal type Point p = new Point(); p.setX(10);// 自动装箱
		 * int--Integer--Object p.setY(20);// 自动装箱 int--Integer--Object int x =
		 * (Integer) p.getX();// 先变为Integer类型，再自动拆箱 int y = (Integer)
		 * p.getY();// 先变为Integer类型，再自动拆箱 System.out.println("X is " + x);
		 * System.out.println("Y is " + y); p.setX(10.0f);// 自动装箱 p.setY(20.1f);
		 * float xf = (Float) p.getX();// 先变为Float类型，再自动拆箱 float yf = (Float)
		 * p.getY(); System.out.println("X is " + xf);
		 * System.out.println("Y is " + yf); p.setX("left 10");// 自动装箱
		 * p.setY("right 20"); String xs = (String) p.getX();// 先变为Float类型，再自动拆箱
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