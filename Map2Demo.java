package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQiantao {
	public static void main(String[] args) {

		HashMap<String,String> javase= new HashMap<String, String>();
		HashMap<String,String> javaee= new HashMap<String, String>();
		javaee.put("1404020103", "yzb");
		javaee.put("1404020104", "mqz");
		javaee.put("1404020105", "wt");
		javase.put("1404020201", "wy");
		javase.put("1404020202", "wt");
		javase.put("1404020203", "wy");
		HashMap<String,Map<String, String>> map = new HashMap<String, Map<String,String>>();
		map.put("javase", javase);
		map.put("javaee", javaee);
		for(String key:map.keySet()) {
			for(String key1:map.get(key).keySet()) {
				System.out.println(key+"^"+key1+"^"+map.get(key).get(key1));

			}
		}
		System.out.println("=============================");
		entrySet(map);
	}
	
	public static void entrySet(Map<String,Map<String,String>> czbk) {
		Set<Map.Entry<String, Map<String,String>>> classentry =czbk.entrySet();
		Iterator<Map.Entry<String, Map<String,String>>> classentryit= classentry.iterator();
		while(classentryit.hasNext()) {
			Map.Entry<String, Map<String,String>> et= classentryit.next();
			Map<String, String>  class1 =  et.getValue();
			Set<Map.Entry<String, String>> class1entry = class1.entrySet();
			Iterator<Map.Entry<String, String>> class1it = class1entry.iterator();
			while(class1it.hasNext()) {
				Map.Entry<String, String> et1 = class1it.next();
				System.out.println(et.getKey()+"..."+et1.getValue()+"..."+et1.getKey());
			}
			
		}
	}
}
