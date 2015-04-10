package java_exercise;

//regex pattern/matcher demo,p389
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test11 {
	public static void main(String[] args) {
		// //Pattern.matcher
		String str = "1983-07-27";
		String re = "\\d{4}-\\d{2}-\\d{2}";
		// re match part
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str);
		if (m.matches()) {
			System.out.println(m.matches());
			System.out.println("Date's format is correct");
		} else {
			System.out.println("Date's format is not correct");
		}
		// //Pattern.split
		String str_s = "A1B22C333D4444E55555F";
		String re_s = "\\d+";
		Pattern p_s = Pattern.compile(re_s);
		String s[] = p_s.split(str_s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}
		// //Matcher.replace
		String str_r = "A1B22C333D4444E55555F";
		String re_r = "\\d+";
		Pattern p_r = Pattern.compile(re_r);
		Matcher m_r = p_r.matcher(str_r);
		String newString=m_r.replaceAll("_");
		System.out.println(newString);
	}
}