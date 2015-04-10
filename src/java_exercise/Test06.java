package java_exercise;

//Array sort/reverse demo

class Array_o {
	private int temp[];
	private int foot = 0;

	public Array_o(int len) {
		if (len > 0) {
			this.temp = new int[len];
		} else {
			this.temp = new int[1];
		}
	}

	public boolean add(int i) {
		if (this.foot < this.temp.length) {
			this.temp[foot] = i;
			foot++;
			return true;
		} else {
			return false;
		}
	}

	public int[] getArray() {
		return this.temp;
	}
}

// Reverse
class Array_r extends Array_o {
	public Array_r(int len) {
		super(len);
	}

	public int[] getArray() {
		int ao[] = super.getArray();
		int ar[] = new int[ao.length]; // 根据大小开辟新数组
		int count = ar.length - 1;
		for (int i = 0; i < ao.length; i++) {
			ar[count] = ao[i];
			count--;
		}
		return ar;
	}
}

// Sort
class Array_s extends Array_o {
	public Array_s(int len) {
		super(len);
	}

	public int[] getArray() {
		java.util.Arrays.sort(super.getArray()); // 排序操作
		return super.getArray();
	}
}

public class Test06 {
	public static void main(String[] args) {
		Array_o a = new Array_o(5);
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(4);
		print(a.getArray());
		Array_s b = new Array_s(5);
		b.add(1);
		b.add(5);
		b.add(3);
		b.add(2);
		b.add(4);
		print(b.getArray());
		Array_r c = new Array_r(5);
		c.add(1);
		c.add(5);
		c.add(3);
		c.add(2);
		c.add(4);
		print(c.getArray());
	}

	public static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
