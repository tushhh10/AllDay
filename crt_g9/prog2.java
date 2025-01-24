package crt_g9;
import java.util.Scanner;
public class prog2 {	
	public static void main(String args[]) {
		int num,d=1,t,r;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		t=num;
		
		while(num!=0) {
			num= num/10;
			d=d*10;
		}
		d=d/10;
		num=t;
		System.out.println(d);
		System.out.println("num----->"+num);
		
		while(num!=0) {
			r= num/d;
			num=num%d;
			d=d/10;
			System.out.println(r);
		}	
	}
}
