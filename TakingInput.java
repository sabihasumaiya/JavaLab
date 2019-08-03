package takingInput;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner inputTaker = new Scanner(System.in);
		System.out.println("ENTER TWO STRING\n");
		String s1 = inputTaker.nextLine();
		String s2 = inputTaker.nextLine();
		System.out.println(" ENTERED STRINGS: \n" + s1 + "\n" + s2);
        System.out.println("\nRemove white space of s1: "+ s1.replaceAll( "\\s",""));
		System.out.println("\nREPLACED ALL SPACES OF s1 TO Dash(-) :  " + s1.replace(' ', '-'));
	}
	
	}
