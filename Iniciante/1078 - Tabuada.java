import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if (num > 2 && num < 1000) {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d%n", i, num, num * i);
			}
		}

		sc.close();

	}

}
