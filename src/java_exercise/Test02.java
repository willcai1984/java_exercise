package java_exercise;

//演示数组相关部分
public class Test02 {
	public static void main(String[] args) {
		// new 1维实例
		int score[] = new int[3];
		// set value
		for (int i = 0; i < 3; i++) {
			score[i] = i * 3;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("The " + (i + 1) + " value is " + score[i]);
		}

		int int1_array[] = { 1, 2, 3, 4, 5 };
		for (Integer i : int1_array) {
			System.out.println("The value is " + i);
		}
		// new 2维实例
		int int2_array[][] = { { 1, 2 }, { 5, 6 }, { 9, 10, 11, 12 } };
		for (int i = 0; i < int2_array.length; i++) {
			for (int j = 0; j < int2_array[i].length; j++) {
				System.out.println("The value is " + int2_array[i][j]);
			}

		}
		// func传递
		int temp[] = array_func();
		print(temp);
		System.out.println("");
		// 可变参量的录入
		print_func(1, 2, 3);
		System.out.println("");
		print_func(1, 3, 5, 7, 9);
		System.out.println("");
	}

	public static void print(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
	}

	public static int[] array_func() {
		int g_array[] = { 1, 3, 5, 7, 9 };
		return g_array;
	}

	public static void print_func(int... arg) {
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + ",");
		}
	}
}
