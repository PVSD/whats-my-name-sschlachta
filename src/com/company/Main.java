package com.company;

public class Main {

    public static void main(String[] args) {
	import java.io.*;
	import java.util.*;
	public class FullName{

		public static void main(String[] args){

			Scanner fnReader = new Scanner(System.in);
			System.out.println("What is your first name?");
			String firstName = fnReader.nextLine();
			System.out.println(" " + firstName);

			Scanner lnReader = new Scanner(System.in);
			System.out.print("What is your last name?");
			String lastName = fnReader.nextLine();
			System.out.println(" " + lastName);

			Scanner fnReader = new Scanner(System.in);
			System.out.print("Your full name is");
			String fullName = fnReader.nextLine();
			System.out.println(" " + fullName);
		}
    }
    }
}
