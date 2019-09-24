package test.practise.complex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Mahesh", "Swathi", "Lakshmims", "Spoo");
		Stream<String> list = names.stream();
		System.out.println("List is having below names");
		list.forEach(System.out::println);

		System.out.println("Names with 6 letters in List");

		Stream<String> all = names.stream();
		all.filter(nam -> nam.length() == 6).forEach(System.out::println);

		System.out.println("---Using Stream and filter we are filtering name with >5 and <8 letters--");
		Stream<String> allNames = names.stream();
		Stream<String> longNames = allNames.filter(str -> str.length() < 8 && str.length() > 5);
		longNames.forEach(System.out::println);

		System.out.println("--Using advanced For loop we are filtering name with more than 6 letters---");
		for (String s : names) {
			if (s.length() > 6)
				System.out.println(s);
		}

		System.out.println("--Using Stream,filter we are not taking Mahesh---");
		List<String> result = names.stream() // convert list to stream
				.filter(name -> !"Mahesh".equals(name)) // we dont like Mahesh
				.collect(Collectors.toList()); // collect the output and convert
												// streams to a List
		result.forEach(System.out::println);

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squares);
	}

}
