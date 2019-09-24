
package test.practise.complex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsDemo {

	enum days {
		Monday, Tuesday, Wednesday;
	}

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);

		System.out.println("Value of a =>" + map.get("a"));

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Map<days, Integer> dm = new HashMap<>();
		dm.put(days.Monday, 1);
		dm.put(days.Tuesday, 2);
		dm.put(days.Wednesday, 3);

		System.out.println("Wednesday =>" + dm.get(days.Wednesday));

		for (Entry<days, Integer> m : dm.entrySet()) {
			System.out.println(m.getKey() + "=>" + m.getValue());
		}

	}
}
