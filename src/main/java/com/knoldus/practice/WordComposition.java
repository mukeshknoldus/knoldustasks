package com.knoldus.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordComposition {
	public static void main(String[] args) {
		String givenstring = "kknoollddusnsdusnolknolouknollx";
		String word1Given = "knol";
		String word2Given = "knol";

		String word1 = word1Given;
		String word2 = word2Given;

		String finalStringForMapCreation = givenstring + word1 + word2;
		int wordcount = 0;

		if (word1Given.length() > word2Given.length()) {
			word1 = word1Given;
			word2 = word2Given;
		} else if (word1Given.length() < word2Given.length()) {
			word1 = word2Given;
			word2 = word1Given;
		} 

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();

		for (int i = 0; i < finalStringForMapCreation.length(); i++) {
			m1.put(finalStringForMapCreation.charAt(i), 0);
		}

		int count =0;
		for (int i = 0; i < givenstring.length(); i++) {
			count = new WordComposition().countCharacter(givenstring,i);
			m1.put(givenstring.charAt(i), count);
		}
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < word1.length(); i++) {
			if (m1.containsKey(word1.charAt(i)) && m1.containsValue(0)) {
				m1.computeIfPresent(word1.charAt(i), (k, v) -> v - 1);
				count1++;
			}
		}

		
		HashMap<Character,Integer> mword1 = new HashMap<Character,Integer>();
		for (int i =0; i<word1.length(); i++) 
		{
			mword1.put(word1.charAt(i), m1.get(word1.charAt(i)));
		}
		
		HashMap<Character,Integer> mword2 = new HashMap<Character,Integer>();
		for (int i =0; i<word2.length(); i++) 
		{
			mword2.put(word2.charAt(i), m1.get(word2.charAt(i)));
		}
		
		int lowest1 = Collections.min(mword1.values());
		
		if (lowest1 < 0) {
			wordcount = 0;
		} else {
			wordcount = lowest1;
		}

		System.out.println(word1 + "-" + wordcount);
		//
		char ch = ' ';
		for (int i = 0; i < word1.length(); i++) {
			ch = word1.charAt(i);
			m1.computeIfPresent(ch, (k, v) -> v - (lowest1));

		}

		int lowest2 = Collections.min(mword2.values());

		if (lowest2 < 0) {
			wordcount = 0;
		} else {
			wordcount = lowest2;
		}
		if (word1 == word2) {
			System.out.println(word2 + "-" + 0);
		} else {
			System.out.println(word2 + "-" + wordcount);
		}
	}
	public int countCharacter(String givenstring, int index) {
		int count = 0;
		for (int j = 0; j < givenstring.length(); j++) {
			if (givenstring.charAt(index) == givenstring.charAt(j)) {
				count++;
			}
		}
		return count;
	}

}
