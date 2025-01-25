package crt_g9;

public class SwapNum {

	public static void main(String[] args) {
		int num1=100,num2=200;
		System.out.println("Before Swapping num1------> "+num1);
		System.out.println("Before Swapping num2------> "+num2);
		System.out.println();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping num1------> "+num1);
		System.out.println("After Swapping num2------> "+num2);

	}

}
