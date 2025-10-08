/*
	Author: Oscar Canavan
	Date: 08/10/2025
	Program Description: A two class project to help my understanding of
			     encapsulation in java.
*/

public class Control {

	public static void main(String[] args) {

		Movie Movie1 = new Movie("Inception", "Science Fiction", 148);
		Movie Movie2 = new Movie("Happy Gilmore", "Comedy", 92);
		Movie Movie3 = new Movie("Shrek", "Cartoon", 90);
		Movie Movie4 = new Movie("Fight Club", "action", 139);
		Movie Movie5 = new Movie("Frankenstein", "Horror", 150);

		System.out.println(Movie1);
		System.out.println(Movie2);
		System.out.println(Movie3);
		System.out.println(Movie4);
		System.out.println(Movie5);
		
	}

}
