package test.practise.complex;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queues {

	public static void main(String[] args) {

		PriorityQueue<String> Q = new PriorityQueue<String>();
		Q.add("Mahesh");
		Q.offer("Ramesh");
		Q.add("Srinu");

		System.out.println("Head: " + Q.peek());

		for (String S : Q) {
			System.out.println(S);
		}

		System.out.println("=========" + Q.poll());
		System.out.println("NewHead: " + Q.peek());
		Q.offer("Swathi");
		Q.remove();
		System.out.println("Head is changed: " + Q.element());
		Iterator<String> I = Q.iterator();
		while (I.hasNext()) {
			System.out.println(I.next());
		}

	}

}
