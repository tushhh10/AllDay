package crt_g9;

public class Pattern5 {

	public static void main(String[] args) {
		for(int r=1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(((r+c)-1)%2 +" ");
				}
			System.out.println();
			}
		}
	}


