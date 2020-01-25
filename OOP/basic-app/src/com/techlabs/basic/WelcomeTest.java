package com.techlabs.basic;

public class WelcomeTest 
{

	public static void main(String[] args) 
	{
		System.out.println("hello");
		System.err.println( "this was awosome \n\n");
		
		System.out.println(true);
		System.out.println("welcom");
		System.out.println(100);
		
		printInfo("Hello");
		printInfo(12);
		printInfo(13.28);
		printInfo('A');
		printInfo(15.4f);
	}
	
	public static void printInfo(String str) {
		System.out.println(str);
	}
	
	public static void printInfo(int a) {
		System.out.println(a);
	}
	
	public static void printInfo(double a) {
		System.out.println(a);
	}
	
	public static void printInfo(char a) {
		System.out.println(a);
	}
	
	public static void printInfo(float i) {
		System.out.println(i);
	}

}
