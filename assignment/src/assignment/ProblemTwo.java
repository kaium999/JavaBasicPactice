package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		ArrayList<Integer>Data=new ArrayList<>();
		//ArrayList<Integer>Copy=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How Many Element Add In ArrayList:");
		int repet=scanner.nextInt();
		for(int i=1;i<=repet;i++) {
			System.out.println("Enter your Element:");
			int element=scanner.nextInt();
			Data.add(element);
		}
		for(int ob1:Data) {
			System.out.println("Your element is:"+ob1);
		}
		System.out.println("How Many element you delete:");
		int RemoveData=scanner.nextInt();
		
		for(int j=RemoveData;j>=0;j--) {
			Data.remove(j);
			System.out.println("After Removing Data:"+Data);
		}
		
		
	
	}

}
