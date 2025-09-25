package patternPrograms;

public class rhombus {
	public static void rhombus(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
