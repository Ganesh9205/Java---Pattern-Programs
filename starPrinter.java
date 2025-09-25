package patternPrograms;


public class starPrinter {
	
	//Left Aligned Right Angled Triangle
	public static void leftRAT(int height) {
		
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//Number Triangle
	public static void numtriangle(int height) {
		for(int i=1; i<=height; i++) {
			for(int k=i;k<=height-1;k++) {
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}	
	
	public static void numincpyramid(int height) {
		for(int i = 1; i<=height; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void numincrevpyramid(int height) {
		for(int i = height; i>0; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void numchangepyramid(int height) {
		int count=1;
		for(int i = 1; i<=height; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void zeroOneTriangle(int height) {
		for(int i = 1; i<=height; i++) {
			for(int j = 1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
	
	
	
public static void main(String[] args) {
//	leftRAT(5);
//	numtriangle(5);
//	numincpyramid(4);
//	numincrevpyramid(4);
//	numchangepyramid(5);
//	zeroOneTriangle(4);
//	palindrome.numPalindrome(5);
	rhombus.rhombus(4, 4);
}
}
