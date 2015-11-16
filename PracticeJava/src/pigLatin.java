import java.util.Scanner;

public class pigLatin {
	public static void main(String[] args) {

		String sentence, latin = " ";
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter sentence: ");
		sentence = keyboard.nextLine();

		PigLatin(sentence, latin);
	}

	private static void PigLatin(String sentence, String latin) {
		String[] words = sentence.split(" ");
		char ch;
		boolean isSpecialChar;

		for (String str : words) {
			isSpecialChar = false;
			ch = str.charAt(str.length() - 1);
			if (!(((int) ch > 64 && (int) ch < 91) || ((int) ch > 96 && (int) ch < 123)
					|| ((int) ch > 47 && (int) ch < 58))) {
				str = str.substring(0, str.length() - 1);
				isSpecialChar = true;
			}
			char[] ch1 = str.toCharArray();

			if (ch1[0] > 47 && ch1[0] < 58) {
				if (isSpecialChar) {
					latin = latin.concat(str).concat(String.valueOf(ch));
				} else {
					latin = latin.concat(str + " ");
				}
			} else {
				String str1 = str.substring(0, 1);
				String str2 = str.substring(1, str.length());

				str2 = str2.concat(str1);
				if (isSpecialChar) { 
					str2 = str2.concat("ay").concat(String.valueOf(ch));
				} else {
					str2 = str2.concat("ay");
				}

				latin = latin.concat(str2 + " ");
			}
		}
		System.out.println("\nPig Latin Version:" + latin);
	}
}
