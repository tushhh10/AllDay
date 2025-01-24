package crt_g9;
import java.util.Scanner;
public class ChckChar {
	public static void main(String[] args) {
		// Write a program to input any character and check
		// whether it is alphabet
		// digit or special character
	    char ch;

		System.out.println("Enter any character");
		Scanner input =new Scanner(System.in);
		ch = input.next().charAt(0);
		if((ch >= 'A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("The given character is Alphabet");
		}
		else if(ch >='0' && ch<='9') {
			System.out.println("The given character is digit");
		}
		else {
			System.out.println("The given character is a special character");
		}

	}

}
