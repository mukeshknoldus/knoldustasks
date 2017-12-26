package com.knoldus.practice;

import java.util.Collections;
import java.util.HashMap;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*public class PrintTriangle {
	public static void main(String[] args)
	{
		for(int i =0; i<5; i++) 
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}*/

public class PrintTriangle{
	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('a', 1);
		hm.put('b', 1);
		hm.put('c', 2);
		hm.put('d', 3);
		hm.put('e', 4);
		hm.put('f', 88);
		hm.put('g', 10);
		hm.put('h', 5);
		
		int min = Collections.min(hm.values());
		int max = Collections.max(hm.values());
		System.out.println("minimum value of the hashmap:"+min);
		System.out.println("maximum value of the hashmap:"+max);
		
	}
}

