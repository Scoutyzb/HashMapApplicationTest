package day20;

import java.util.HashMap;import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		HashMap<Person, String> map = new HashMap<Person,String>();
		map.put(new Person("yzb",16),"qd");
		map.put(new Person("sf",20),"ta");
		map.put(new Person("kzw",25),"ta");
		Set<Person> st = map.keySet();
		for (Person key:st) {
			System.out.println(key+"..."+map.get(key));
		}
		System.out.println("+++++++++++++++++++++");
		for (Map.Entry<Person, String> et:map.entrySet()) {
			System.out.println(et);
		}
	}
}
