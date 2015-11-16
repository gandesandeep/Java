
import java.util.Scanner;

public class verifyNumByThree {

	public boolean isPowerOfThree(int n) {
		boolean isPower = false;
		int temp = n;
		while (temp >= 3) {
			if (temp % 3 == 0) {
				isPower = true;
			} else {
				isPower = false;
				break;
			}
			temp = temp / 3;
		}
		return isPower;
	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner iNum = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = iNum.nextInt();

		verifyNumByThree vN = new verifyNumByThree();

		// If the number is power of three then isPower is true.
		if (vN.isPowerOfThree(num)) {
			System.out.println("power of 3");
		} else {
			System.out.println("not power of 3");
		}

	}
}
