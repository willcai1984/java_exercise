package java_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

//list array demo,p495

public class Test13 {
	public static void main(String[] args) {
		List<String> allList = null;
		allList = new ArrayList<String>();
		allList.add("Hello");
		allList.add("World");
		allList.add("Well");
		allList.add("Done");
		System.out.println(allList);
		for (int i = 0; i < allList.size(); i++) {
			System.out.print(allList.get(i) + " ");
		}
		System.out.print("\n");
		for (int i = allList.size() - 1; i >= 0; i--) {
			System.out.print(allList.get(i) + " ");
		}
		System.out.print("\n");
		// p502,若不制定泛型类型，就用obj直接返回
		Object obj[] = allList.toArray();
		for (int i = 0; i < obj.length; i++) {
			String s = (String) obj[i];
			System.out.print(s + " ");
		}
		System.out.print("\n");
		for (int i = obj.length - 1; i >= 0; i--) {
			String s = (String) obj[i];
			System.out.print(s + " ");
		}
		System.out.print("\n");
		// 520 iterator foreach
		Iterator<String> iter = allList.iterator();
		while (iter.hasNext()) {
			String next = iter.next();
			System.out.print(next + " ");
		}
		System.out.print("\n");
		for (String str : allList) {
			System.out.print(str + " ");
		}
	}
}