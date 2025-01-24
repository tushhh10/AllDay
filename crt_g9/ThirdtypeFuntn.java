package crt_g9;

public class ThirdtypeFuntn {
	int maxDigit() {
		return 9;
	}
	boolean indiaMustHaveAdhaar() {
		return true;
	}
	static float usDollar() {
		float rupees = 78.67f;
		return rupees;
	}
	char appleFistChar() {
		return 'A';
	}
	static String indiaCapital() {
		return "Delhi";
	}

	public static void main(String[] args) {
		float indToUsDollar = usDollar();
		System.out.println("indian rupees of us dollar ----->"+indToUsDollar);
		String capital = indiaCapital();
		System.out.println("Capital of India ----->"+capital);

	}

}
