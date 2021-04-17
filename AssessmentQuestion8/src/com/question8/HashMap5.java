package com.question8;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap5 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Logi");
		map.put(3, "Gayu");
		map.put(4, "Priya");
		map.put(2, "Anu");

		System.out.println(map);
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println("Key:"+m.getKey()+" "+"Value:"+m.getValue());
		}
	}
}
