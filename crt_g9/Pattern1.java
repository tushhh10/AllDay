package crt_g9;

public class Pattern1 {

	public static void main(String[] args) {
		for(int r=5;r>=1;r--) {
			for(int c=5;c>=r;c--) {
				System.out.print(r+" ");
			}
			System.out.println();
		}

	}

}
