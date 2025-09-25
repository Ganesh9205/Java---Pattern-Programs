package patternPrograms;

public class numbertriangle {
	public static void main(String[] args) {
		starprinter(4);
	}
	public static void starprinter(int n) {
		int temp=n;
		for (int i = 1; i<=n; i++) {
			for (int j = 0; j<=temp; j++) {
				System.out.print("_");
				for (int k = 1; k<=i ;k++) {
					System.out.print(i+"_");
				}
			}
			temp--;
			System.out.println();
		}
	}
}
