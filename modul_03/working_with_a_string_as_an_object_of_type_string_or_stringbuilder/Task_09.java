package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */

public class Task_09 {
	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");

		text = delSpase(text);
		System.out.println(text);
		letterUpper(text);
		letterLower(text);

	}

	//Удаление пробелов
	public static String delSpase(String text) {
		text = text.replaceAll("\\s", "");
		return text;
	}

	//Подсчет большых букв
	public static void letterUpper(String text) {
		int count;
		int codePoint;
		char value;

		count = 0;
		for (int i = 0; i < text.length(); i++) {
			value = text.charAt(i);
			codePoint = text.codePointAt(i);
			if (codePoint >= 41 && codePoint <= 91) {
				if (Character.isUpperCase(value)) {
					count++;
				}
			}
		}
		System.out.println("Количество прописных (больших) букв в введенной строке равно: " + count);
	}

	//Подсчёт маленьких букв
	public static void letterLower(String text) {
		int count;
		int codePoint;
		char value;

		count = 0;
		for (int i = 0; i < text.length(); i++) {
			value = text.charAt(i);
			codePoint = text.codePointAt(i);
			if (codePoint >= 97 && codePoint <= 122) {
				if (Character.isLowerCase(value)) {
					count++;
				}
			}
		}
		System.out.println("Количество строчных (маленьких) букв в введенной строке равно: " + count);
	}

}
