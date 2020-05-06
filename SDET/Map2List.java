package Java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map2List {
	
	public static void main(String[] args) {
		java8way();
		beforeJava8();
		filterway();
	}
	
	public static void beforeJava8() {
		Map<String, String> test = new HashMap<>();
		test.put("CA", "California");
		test.put("NY", "NewYork");
		test.put("DEL", "Delhi");

		List<String> keys = new ArrayList(test.keySet());
		List<String> values = new ArrayList(test.values());

		System.out.println("Before Java 8 : "+"Keys are:" + keys );
		System.out.println("Before Java 8 : "+"Values are:" + values );
	}
	
	public static void java8way() {
		Map<String, String> test = new HashMap<>();
		test.put("CA", "California");
		test.put("NY", "NewYork");
		test.put("DEL", "Delhi");
		
		List<String> key = test.keySet().stream().collect(Collectors.toList());
		List<String> val = test.values().stream().collect(Collectors.toList());
		
		System.out.println("Java 8 : "+"Keys are:" + key );
		System.out.println("Java 8 : "+"Values are:" + val );
	}
	
	public static void filterway() {
		
		Map<String, String> test = new HashMap<>();
		test.put("CA", "California");
		test.put("NY", "NewYork");
		test.put("DEL", "Delhi");

		List<String> key = test.keySet().stream().collect(Collectors.toList());
		List<String> result5 = test.values().stream()
				.filter(x -> !"DEL".equalsIgnoreCase(x))
				.collect(Collectors.toList());
		System.out.println("RES: "+ result5);
		
	}


}
