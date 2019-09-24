package test.practise.complex;

import java.util.HashMap;
import java.util.Map;

public class MapsContinued {

	public static void main(String[] args) {

		Map<String, Integer> newmap = new HashMap<>();
		newmap.put("Audi", 1);
		newmap.put("BMW", 2);
		newmap.put("Benz", 3);

		System.out.println("size of map is: " + newmap.size());

		String searchKey = "Audi";
		if (newmap.containsKey(searchKey)) {
			System.out.println("Found " + newmap.get("Audi") + " " + searchKey);
		} else {
			System.out.println("Not found");
		}

		for (Map.Entry n : newmap.entrySet()) {
			System.out.println(n.getKey() + "=>" + n.getValue());
		}
	}
}
