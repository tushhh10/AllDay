package crt_g9;

public class Demo {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int num = i;
				if (num % 2 == 0) {
				if (i % 10 == 6 || i / 10 == 6)
					System.out.print(" " + i);
			}
		}
	}
}
