package test.practise.intermediate;

enum Color {
	RED, GREEN, BLUE;

	// enum constructor called separately for each constant
	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}

}

public class TestEnum {
	// Driver method
	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		System.out.println(c1);

		Color arr[] = Color.values();
		for (Color col : arr) {
			System.out.println(col + " at index " + col.ordinal());
		}
	}
}