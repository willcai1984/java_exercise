package java_exercise;

//Thread demo
class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " result,i=" + i);
		}
	}
}

public class Test08 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("ThreadA");
		MyThread mt2 = new MyThread("ThreadB");
		// execute in order
		// mt1.run();
		// mt2.run();
		// multi-thread
		mt1.start();
		mt2.start();

	}

}
