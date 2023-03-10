package utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordFromString {

	public static void main(String[] args) {
		String str = "I I AM AM A GOOD BOY BOY";
		
		String[] eachWords= str.split(" ");
		
		Set<String> uniqueWord = new HashSet<String>();
		List<String> duplicateWord= Arrays.stream(eachWords).filter(e -> !uniqueWord.add(e)).collect(Collectors.toList());
		System.out.println(duplicateWord);
	}

}
