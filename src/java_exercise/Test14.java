package java_exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//���� ���� ���࣬���н���Ǹ���ı����������func������û�еĺ���������
class child {
	int i = 20;

	void print() {
		System.out.println("child");
	}

}

class boy extends child {
	int i = 10;

	void print() {
		System.out.println("boy");
	}
}

public class Test14 {
	public static void main(String[] args) {
		child num = new boy();
		System.out.println(num.i);
		num.print();
	}
}