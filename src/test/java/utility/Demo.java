package utility;

import java.util.function.Function;

public class Demo {
	
	public static void main(String[] args) {
		Function<String, String> f = i -> i.toUpperCase();
		String s = f.apply("nitya");
		System.out.println(s);
	}

}
