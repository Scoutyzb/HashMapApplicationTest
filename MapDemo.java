package day20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("ziyi",12);
		hmap.put("wangfeng", 20);
		hmap.put("tingfeng",15);
		System.out.println(hmap);
		Set<String> a = hmap.keySet();
		System.out.println(a);
		Iterator<String> b =a.iterator();
		while(b.hasNext())
		{	
			String c=b.next();
			System.out.println("c="+c);
			hmap.get(c);
			HashMap<String,String> MAP= new HashMap<String, String>();
			Set<Person> set= new HashSet<>();
			System.out.println(c+"="+MAP+set);
		}
		}
}
