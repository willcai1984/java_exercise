package java_exercise;

//Thread operation example,p297
//一边生产，一边取值，会导致顺序错乱或者重复取值，同步解决顺序错乱，等待唤醒解决重复取值

class Info {
	private String name = "Will";
	private String content = "QA";
	private boolean flag = false;

	public synchronized void set(String name, String content) {
		// when flag=false wait and cannot produce
		if (!flag) {
			try {
				super.wait();
				//Info 默认也是继承 Object的,super.wait就是调用Object的wait方法的
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.content = content;
		// produce done, pls get
		this.flag = false;
		super.notify();
	}

	public synchronized void get() {
		// flag=true means can produce but not get
		if (flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name + "-->" + this.content);
		// get done. pls produce
		this.flag = true;
		super.notify();
	}
}

class Producer implements Runnable {
	private Info info = null;

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		boolean flag = false;
		for (int i = 0; i < 50; i++) {
			if (flag) {
				this.info.set("Will", "QA");
				flag = false;
			} else {
				this.info.set("mldn", "www.mldnjava.cn");
				flag = true;
			}
		}
	}
}

class Consumer implements Runnable {
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get();
		}
	}
}

public class Test09 {
	public static void main(String[] args) {
		Info i = new Info();
		Producer pro = new Producer(i);
		Consumer con = new Consumer(i);
		new Thread(pro).start();
		new Thread(con).start();
	}

}

/*
 * 没有同步 class Info { private String name = "Will"; private String content =
 * "QA";
 * 
 * public String getName() { return this.name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getContent() { return this.content; }
 * 
 * public void setContent(String content) { this.content = content; } }
 * 
 * class Producer implements Runnable { private Info info = null;
 * 
 * public Producer(Info info) { this.info = info; }
 * 
 * public void run() { boolean flag = false; for (int i = 0; i < 50; i++) { if
 * (flag) { this.info.setName("Will"); try { Thread.sleep(90); } catch
 * (InterruptedException e) { e.printStackTrace(); } this.info.setContent("QA");
 * flag = false; } else { this.info.setName("mldn"); try { Thread.sleep(90); }
 * catch (InterruptedException e) { e.printStackTrace(); }
 * this.info.setContent("www.midnjava.cn"); flag = true; } } } }
 * 
 * class Consumer implements Runnable { private Info info = null;
 * 
 * public Consumer(Info info) { this.info = info; }
 * 
 * public void run() { for (int i = 0; i < 50; i++) { try { Thread.sleep(100); }
 * catch (InterruptedException e) { e.printStackTrace(); }
 * System.out.println(this.info.getName() + "-->" + this.info.getContent()); } }
 * }
 * 
 * public class Test9 { public static void main(String[] args) { Info i = new
 * Info(); Producer pro=new Producer(i); Consumer con=new Consumer(i); new
 * Thread(pro).start(); new Thread(con).start(); }
 * 
 * }
 */