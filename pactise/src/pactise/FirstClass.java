package pactise;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int number=scanner.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number +"X" +i+"="+number*i);
		}

	}

}
