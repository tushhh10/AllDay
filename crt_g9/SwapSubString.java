package crt_g9;

public class SwapSubString {
	public static void main(String args[]) {
		
	String name1 ="Vikas";
	String name2 ="Vignan";
	System.out.println("Before Swapping name1------> "+name1);
	System.out.println("Before Swapping name2------> "+name2);
	
	name1=name1+name2;
	name2=name1.substring(0,name1.length()-name2.length());
	name1=name1.substring(name2.length());
	
	System.out.println("After Swapping name1------> "+name1);
	System.out.println("After Swapping name2------> "+name2);

	}
}
