package crt_g9;

public class NoDigits {

	public static void main(String[] args) {
		long num=1234567899;
		int r;
		int[] count=new int[10];
		while(num!=0) {
			r=(int)(num%10);
			count[r]++;
			num=num/10;
		}
		for(int i=0;i<=9;i++) {
			System.out.println(i+"--------->"+count[i]);
		}
		
	}

}
