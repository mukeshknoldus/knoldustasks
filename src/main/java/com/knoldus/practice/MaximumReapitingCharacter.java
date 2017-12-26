package com.knoldus.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumReapitingCharacter {

	
	//public void MaximumCharacterFinder(String str)
	public static void main(String[] args)
	{
		
		String str="";
		System.out.println("enter some string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			 str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int len = str.length();
		int count = 0;
		char res  = str.charAt(0);
		int currcount =1;
		int index = 0;
		//int currentindex =0;
		
		for( int i=0;i<len;i++) 
		{
			index++;
			//if current character matches with next
			if(i<len-1 && str.charAt(i) == str.charAt(i+1)) 
			{
				currcount ++;
				index--;
			}
			else 
			{
				//index++;
				if(currcount > count) 
				{
					count = currcount;
					res = str.charAt(i);
					index++;
				}
				currcount = 1;
			}
		}
		System.out.println("hi:"+res+"::"+count+":index:"+(index));
		
	}
	
}
