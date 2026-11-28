package com.selenium.pack4;
public class Java8_Strings 
{
	public static void main(String[] args) 
	{
		//String Literal
		String s="Harinadh";
		String s1="Harinadh";
		
		//Using new keyword
		String s2=new String("Harinadh");
		String s3=new String("Harinadh");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s == s1);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s3));
	}
}