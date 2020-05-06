package Java8Features;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Runnable R = new Runnable() {
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("Main thread");
				}
			}
		};
		
		//Above runnable (Line 6: 12) we can replace as below
		Runnable r =()->{
			for (int i = 0; i < 2; i++) {
				System.out.println("Lambda thread");
			}
		};

		Thread t = new Thread(R);
		t.start();
		
		Thread T = new Thread(r);
		T.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("Child thread");
		}

	}
}

//Line 7-12 is anonymous inner class implementation.