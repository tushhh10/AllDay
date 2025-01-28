package crt_g9;

public class Array1 {

	public static void main(String[] args) {
		int a[]= new int[5];
		for(int i=0,v=100;i<=4;i++) {
			a[i]=v;
			v=v+100;
		}
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
	}

}
