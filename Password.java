package Test1;

import java.util.Scanner;

public class Password {
	public static void main(String [] args) {
	    int pin = 12345;
	    int count = 0;
	    Scanner sc = new Scanner(System.in);

	    for (int i = 0; i < 3; i++) {
	      System.out.println("Enter the pin:");
	      int userPin = sc.nextInt();
	      if (pin == userPin) {
	        System.out.println("Correct Welcome Back.");
	        break;
	      } else {
	        count++;
	        if (count >= 3) {
	          System.out.println("Sorry but you have been locked out.");
	        }
	      }

	      System.out.println("Incorrect , Try Again");

	    }
    }
}

