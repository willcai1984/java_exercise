package java_exercise;

//Ã¶¾Ù ×¢ÊÍAnnotation

public class Test15 {
	public enum Color {
		RED, GREEN, BLUE;
	}

	public @interface mycolor {
		public Color name() default Color.BLUE;
	}

	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
	}

}