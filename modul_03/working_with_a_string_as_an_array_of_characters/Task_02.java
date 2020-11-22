package by.lecttor.modul_03.working_with_a_string_as_an_array_of_characters;

/*
 2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task_02 {
	public static void main(String[] args) {
		
		String text = "word word and word if word or word off word";
		System.out.println(text);

		text = replaceWords(text);
		System.out.println(text);
		
	}

	public static String replaceWords(String s) {
		String s1 = s.replaceAll("word", "letter");

		return s1;
	}

}
