import java.util.Scanner;

public class verifyNum {

	public boolean isPowerOfTwo(int n) {
		boolean isPower = false;
		int temp = n;
		while (temp >= 2) {
			if (temp % 2 == 0) {
				isPower = true;
			} else {
				isPower = false;
				break;
			}
			temp = temp / 2;
		}
		return isPower;
	}

	public static void main(String[] args) throws java.lang.Exception {
		Scanner iNum = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = iNum.nextInt();
		verifyNum vN = new verifyNum();

		// If the number is power of two then isPower is true.
		if (vN.isPowerOfTwo(num)) {
			System.out.println("power of 2");
		} else {
			System.out.println("not power of 2");
		}

	}
}
