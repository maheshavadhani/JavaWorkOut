package test.practise.littleAdvance;

class Account {
	int a, b;
	int x = 10, y = 20;

	public void setData(int a, int b) {
		a = a;
		b = b;
		System.out.println("--A and B values are zero because we did not use this keyword---");
	}

	public void setThisData(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("--X and Y values are 5,6 instead of 10,20 because used this keyword---");
	}

	public void showData() {
		System.out.println("Value of A  and B =" + a + "," + b);
		System.out.println("Value of X and Y  =" + x + "," + y);
	}

	public static void main(String args[]) {
		Account obj = new Account();
		obj.setData(2, 3);
		obj.setThisData(5, 6);
		obj.showData();
	}
}