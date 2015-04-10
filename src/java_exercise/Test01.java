package java_exercise;

//演示如何强制转换数据类型
public class Test01 {
	public static void main(String[] args) {
		float a = 30.3f;
		int b = (int) a;
		System.out.println("The result is " + b);
		System.out.println("The result is " + ((float) 10 / 3));
		if (b > 20) {
			System.out.println("B is bigger than 20");
		} else {
			System.out.println("B is smaller than 20");
		}
		int c = 6;
		System.out.println("c++ is " + (c++) + " , c is " + c);
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum is " + sum);

	}

}
