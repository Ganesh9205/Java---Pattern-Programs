package patternPrograms;

public class palindrome {
	public static void numPalindrome(int height) {
		for(int i =1; i<=height; i++) {
			for (int j = 1; j <=height-i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0 ; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
