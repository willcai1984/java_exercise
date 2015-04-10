package java_exercise;

//regex string demo,p391

public class Test12 {
	public static void main(String[] args) {
		String str1 = "1983-07-27";
		String str2 = "A1B22C333D4444E55555F";
		boolean r_1 = str1.matches("\\d{4}-\\d{2}-\\d{2}");
		String r_2[] = str2.split("\\d+");
		String r_3 = str2.replaceAll("\\d+", "_");
		System.out.println(r_1);
		for (int i = 0; i < r_2.length; i++) {
			System.out.print(r_2[i] + "\t");
		}
		System.out.println("");
		System.out.println(r_3);
	}
}