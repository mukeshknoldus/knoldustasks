package com.knoldus.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javafx.util.Pair;

public class RationalDemo {
	int numerator1;
	int demoninator1;
	int numerator2;
	int demoninator2;
	
public Pair<Integer,Integer> printAddRational(int numerator, int demoninator) 
{
	int n = numerator;
	int d = demoninator;
	
	//finding the Greatest common divider
	while(n != d)
    {
        if(n > d)
        	n -= d;
        else
        	d -= n;
    }

    System.out.println("G.C.D = " + n+":"+d);
	
	Pair<Integer,Integer> res = new Pair<Integer,Integer> ((numerator/n),(demoninator/n));
	//System.out.println(res.getKey()+"::"+res.getValue());
	return res;
}

public Pair<Integer,Integer> printSubRational(int num,int den)
{
	int n = num;
	int d = den;
	
	System.out.println("hi substraction"+n+":"+d);
	//finding the Greatest common divider
	while(n != d)
    {
		if(n==0 || d==0) 
		{
			n=d;
		}
		else if(n > d)
        	n -= d;
        else
        	d -= n;
    }
	
	//System.out.println("hi substraction2");
    System.out.println("G.C.D = " + n+":"+d);
    Pair<Integer,Integer> ress = new Pair<Integer,Integer> ((num/n),(den/n));
	return ress;
}

public Pair<Integer,Integer> printMultRational(int num,int den)
{
	int n = num;
	int d = den;
	
	//finding the Greatest common divider
	while(n != d)
    {
        if(n > d)
        	n -= d;
        else
        	d -= n;
    }

    System.out.println("G.C.D = " + n+":"+d);
    Pair<Integer,Integer> resm = new Pair<Integer,Integer> ((num/n),(den/n));
    return resm;
}

public int getCommonDenominator(int den1,int den2) 
{
	return den1*den2;
}

public int getNumeratorAddition(int num1,int num2) 
{
	return num1+num2;
}

public int getNumeratorSubstration(int num1,int num2) 
{
	return num1-num2;
}

public int getNumeratorMultplication(int num1,int num2) 
{
	return num1*num2;
}


public static void main(String[] args) throws NumberFormatException, IOException 
{	
	int numerator1;
	int denominator1;
	int numerator2;
	int denominator2;

	System.out.println("please enter first numerator:");
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	numerator1 = Integer.parseInt(br1.readLine());
	
	System.out.println("please enter first denominator:");
	BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
	denominator1 = Integer.parseInt(br2.readLine());
	
	System.out.println("please enter second numerator:");
	BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
	numerator2 = Integer.parseInt(br3.readLine());
	
	System.out.println("please enter second denominator:");
	BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
	denominator2 = Integer.parseInt(br4.readLine());
	
	RationalDemo rd = new RationalDemo();
	
	//getting the lcm/multiplying two demoninators
	int den = rd.getCommonDenominator(denominator1, denominator2);
	
	//getting numerator/using cross multiply method
	int numAdd = rd.getNumeratorAddition((numerator1*denominator2),(numerator2*denominator1));
	
	System.out.println(numAdd+":"+den);
	
	//calling printAddRational() method
	Pair<Integer,Integer> resa = rd.printAddRational(numAdd, den);
	System.out.println("Addition of two Rational number ="+resa.getKey()+"/"+resa.getValue());
	
	int numMult = rd.getNumeratorMultplication(numerator1, numerator2);
	
	System.out.println(numMult+":"+den);
	//calling printMultRational method
	Pair<Integer,Integer> resm = rd.printMultRational(numMult,den);
	System.out.println("Multiplication of two Rational no:= "+resm.getValue()+"/"+resm.getValue());
	
	//calling printSubRational() method 
	int numSub = rd.getNumeratorSubstration((numerator1*denominator2), (numerator2*denominator1));
	
	Pair<Integer,Integer> ress = rd.printSubRational(numSub, den);
	System.out.println("Substraction of two Rational number="+ress.getKey()+"/"+ress.getValue());
}

}
