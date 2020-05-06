package Java8Features;

public class Simple {

	public static void main(String[] args) {

		//Ex1 : 
			Simple s = new Simple();
			s.getname();
		
		//Ex2 :
		int a[] = { 100, 15, 200, 250, 50 };
		int exp = 200;
		boolean res = false;
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == exp) {
				res = true;
				index = i;
			}
		}
		if (res) {
			System.out.println("result 200 found at: " + index);
		} else {
			System.out.println("no such element");
		}
	}

	public String getname() {
		String name = "Aadi";
		System.out.println("Name is:" + name);
		return name;
	}

}
