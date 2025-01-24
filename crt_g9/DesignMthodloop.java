package crt_g9;

public class DesignMthodloop{
	static void Dsg(String ch1,int num1,String ch2,int num2) {
		System.out.print("\t");
	for(int i=1;i<=num1;i++){
		System.out.print("\t\t");
		System.out.print(ch1);
	}
	System.out.println();
	for(int i=1;i<=num2;i++){
		System.out.print("\t\t");
		System.out.print(ch2);
	}
	}
	public static void main(String[] args) {
		Dsg(")(",3,"][",3);
		System.out.println();
		System.out.println("\n\t\t\tHello,Welcome To Website\n");
		Dsg("()",3,"[]",3);

	}

}
