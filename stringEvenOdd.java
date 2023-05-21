package stringCode;

import java.util.Scanner;

public class stringEvenOdd {
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		//enter the string
		System.out.println("Enter the string");
		str = sc.next();
		
		
		//checking if length is even print half of string otherwise print null
		if(str.length() % 2 == 0) {
			System.out.println(str.substring(0, str.length()/2));
		}else {
			System.out.println("null");
		}
		
		}
}
