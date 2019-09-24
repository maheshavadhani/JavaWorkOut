package test.practise.littleAdvance;

abstract class Bike {
	abstract void runs();// Abstract method cannot have a body- No
							// implementation

	abstract void Keys();// In the beginning we did not add this method in Bike
							// class, it was only there for Abstract. We added
							// to avoid compile error.
}

class Abstract extends Bike {
	boolean Keys;

	@Override
	void Keys() {
		System.out.println("Keys is:" + Keys);
		Keys = !Keys;
		System.out.println("after inversion Keys is:" + Keys);
	}

	@Override
	void runs() {
		if (Keys) {
			System.out.println("Bike has started");
		} else {
			System.out.println("Bike did not start");
		}
	}

	public static void main(String[] args) {

		Bike B = new Abstract();
		B.Keys();
		B.runs();
	}

}