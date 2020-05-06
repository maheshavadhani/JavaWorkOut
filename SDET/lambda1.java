package Java8Features;


interface Inter{
	public void m1();
}

public class lambda1 {

	public static void main(String[] args) {
		
		//with lambda we avoided new top level class(Demo) creation to implement the abstract method
		Inter i = () -> System.out.println("Hello from Lambda"); 
		i.m1();

		Inter i1 = new Demo();
		i1.m1();
	}

}

class Demo implements Inter{
	public void m1() {
		System.out.println("Hello from Old method");
	}
}
