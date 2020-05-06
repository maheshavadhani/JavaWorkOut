package Java8Features;

import java.util.function.Function;

//Function is similar to Predicate, here the return type can be String/Integer ..etc
//Function interface by default have apply method
//Function<Integer,Integer> = here input and return types are integer

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i->i*i;
		System.out.println("Square of 5 is:"  + f.apply(5));
		
		Function<String,Integer> f1 = i->i.length();
		System.out.println("Length of String is:" + f1.apply("HONEY IS THE BEST"));
		
		Function<String,String> f2 = i->i.toLowerCase();
		System.out.println("Lowercase String is:" + f2.apply("HONEY IS THE BEST"));
		
		Function<Integer,Integer> f3 = i->i*i*i;
		System.out.println("Function chaining:" + f.andThen(f3).apply(2));
		
	}

}
