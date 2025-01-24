package crt_g9;

import java.util.Scanner;

public class prog1 {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc =new Scanner(System.in);
		char cod;
		int upAsc = (int)'A';
		int lowAsc = (int)'a';
		int diff = upAsc - lowAsc;
		if(diff<0) diff=-diff;
		do {
			System.out.println("Please enter the char");
			ch = sc.next().charAt(0);
			if( (ch >= 'A') && (ch <= 'Z') ) {
				System.out.print(ch);
				System.out.println(" is Upper case");
				ch = (char)(ch + diff);
			}
			else if( (ch >= 'a') &&(ch <='z') ) {
				System.out.print(ch);
				System.out.println(" is Lower case");
				ch = (char)(ch - diff);
				
			}
			System.out.println("after conversion....ch--->"+ch);
			System.out.println("do you want to repeat?if yess press y and if no press n");
			cod = sc.next().charAt(0);
			if(cod == 'n') cod=0;
			else cod=1;

		}
	while(cod == 1);
		System.out.println("ends");
	}

}
