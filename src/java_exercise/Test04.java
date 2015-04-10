package java_exercise;
//程序初步设计
//Demo Login part
//Check if username and passwd is right or not
class Check {
	public boolean validate(String name, String passwd) {
		if (name.equals("will") && passwd.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}

class Operate {
	private String info[];

	public Operate(String info[]) {
		this.info = info;
	}

	public void isExit() {
		if (this.info.length != 2) {
			System.out.println("Wrong parameters, exit system!");
			System.out.println("Example: java Test4 username password");
			System.exit(1);
		}
	}

	public String login() {
		Check check = new Check();
		this.isExit();
		String name = this.info[0];
		String passwd = this.info[1];
		String str = null;
		if (check.validate(name, passwd)) {
			str = "Welcome" + name;
		} else {
			str = "Wrong username or password";
		}
		return str;
	}

}

public class Test04 {
	public static void main(String[] args) {
		Operate op = new Operate(args);
		System.out.println(op.login());
	}
}
