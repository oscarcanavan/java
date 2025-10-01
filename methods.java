/*
	author: Oscar Canavan
	date: 01/10/2025
	program description: program to help learn about methods in java, 
			     uses 2 functions outside main to print the 
			     variable "number" squared and cubed.
*/

public class Methods {
public static void main(String args[]){

	// method = a reuseable block of code that is exucuted when called ()
        double number = 12.0;
	double result = square(number);
	System.out.println(result);
	System.out.println(cube(number));
	}
	

	static double square(double number){
	return number * number;
	}

	static double cube(double number){
	return number * number * number;
	}

}
