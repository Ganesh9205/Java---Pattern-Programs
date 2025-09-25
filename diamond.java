package patternPrograms;

public class diamond {
	public static void diamond(int height) {
		for (int i = 1; i <= height/2; i++) {
			for (int j = 1; j <= (height/2)-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = (height/2)+1; i <=height; i++) {
			int count = 1;
			for (int j = 1; j <=count; j++) {
				System.out.print(" ");
				count++;
			}
			for (int j = i; j > 0; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		diamond(10);
	}
}
