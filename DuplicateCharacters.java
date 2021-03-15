import java.util.Scanner;

public class DuplicateCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = removeDuplicates(sentence);

		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String removeDuplicates(String sentence) {

		String result = "";
		char charArray[] = sentence.toCharArray();

		for (int i = 0; i < sentence.length(); i++) {

			char c = sentence.charAt(i);

			if (c == '\u0000')
				continue;

			for (int j = i + 1; j < sentence.length(); j++) {

				if (c == sentence.charAt(j))
					charArray[j] = '\u0000';
			}

		}

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != '\u0000')
				result += charArray[i];
		}

		return result;

	}

}
