package test.practise.intermediate;

interface Int1 {

	void run();

	void stop();
}

class InterfaceExample implements Int1 {
	@Override
	public void run() {
		int i = 0;
		while (i < 3) {
			System.out.println("While loop:" + i);
			i = i + 1;
		}
	}

	@Override
	public void stop() {
		int i = 0;
		do {
			System.out.println("Do While loop:" + i);
			i = i + 1;
		} while (i < 3);
	}

	public static void main(String[] args) {
		new InterfaceExample().run(); // same as InterfaceExample I = new
										// InterfaceExample();
		new InterfaceExample().stop();
	}
}