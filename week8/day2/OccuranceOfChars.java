package week8.day2;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class OccuranceOfChars {
	public static void main(String[] args) {
		String str = "santhosh";
		char[] characters = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
		// empty

		for (int i = 0; i < characters.length; i++) {
			if(map.containsKey(characters[i])) {
				Integer count = map.get(characters[i]);
				map.put(characters[i], count+1);

			}else {
				map.put(characters[i], 1);
			}
		}
		
		System.out.println(map);


	}

}
