package Test1;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		int count=0;
		int num;
		System.out.println("Enetr the number:");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num != 0) {
			num=num/10;
			++count;
		}
			System.out.println("Number of digits:" +count);
	}

}
