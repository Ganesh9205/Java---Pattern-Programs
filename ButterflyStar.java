package patternPrograms;

public class ButterflyStar {
	
	public static void main(String[] args) {
		Butterflystar(8);

	}

	public static void Butterflystar(int n) {
		int countUpper = n-2;
		int countLower = 0;
		//Upper
		for(int i = 1; i<=n/2; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
//				if((i+j)%2==0) {
//				System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
			}
			for(int j = 1; j<=countUpper;j++) {
				System.out.print(" ");
			}
			countUpper -= 2;
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Middle
//		for (int i = 0; i < n; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
		//Lower
		for (int i = n/2; i >= 0 ; i--) {
			for (int j = i; j > 0 ; j--) {
				System.out.print("*");
			}
		for (int j = 0; j < countLower; j++) {
			System.out.print(" ");
		}
		countLower += 2;
		for (int j = i; j > 0 ; j--) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
	
	

}
