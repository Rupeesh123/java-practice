package com.tcs.practice.rupeesh;

public class VariablesDemoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;
int b=200;
int c= a+b;
int d= a-b;
int e=a*b;
int f=a%b;;
System.out.println("The sum is " + c);
System.out.println("The difference is" + d);
System.out.println("multiplication is" + e);
System.out.println("division" + f);



byte smallnumber = 127; // Range -128 to 127//
System.out.println("value" + smallnumber);

short number = 5000; //Range: -32,768 to 32,767//
	System.out.println("value" + number);
	
int age = 27; //Range: -2^31 to (2^31)-1//
System.out.println("person age is" + age);

long population = 76345627788888L; // 'L' is mandatory for long literals//
// if there is no 'L' error is Exception in thread "main" java.lang.Error: Unresolved compilation problem: //The literal 76345627788888 of type int is out of range //
System.out.println("country population " + population);

float price = 89.76124f; //'f' is mandatory for float literals and store only 4 bytes//
// if there is no 'f' error is xception in thread "main" java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from double to float//
System.out.println("price is " + price);

double colgate = 66.458902345; //double (8 bytes, stores decimal numbers with double precision)//
System.out.println("colgate price is " + colgate);

char letter = 'a'; // char (2 bytes, stores a single character)//
System.out.println("letter is " +  letter);

boolean indiapmmodi = true;
boolean indiapmsanjay = false;
System.out.println("value " + indiapmmodi  );
System.out.println("value " + indiapmsanjay  );










	}

}
