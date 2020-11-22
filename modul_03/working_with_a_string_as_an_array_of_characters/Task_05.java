package by.lecttor.modul_03.working_with_a_string_as_an_array_of_characters;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Task_05 {

	public static void main(String[] args) {
		String text;
		InputMyString inText = new InputMyString();
		System.out.println("Введите любой текст который может содержать цифры, буквы или пробелы >>");
		text = inText.inputString();
		text = amountOfNumbers(text);
		System.out.println(text);

	}

	public static String amountOfNumbers(String text) {
		int start;
		int end;
		int[] DigitsBoolean = new int[text.length()];

		for (int i = 0; i < text.length(); i++) {
			if (text.codePointAt(i) == 32) { // 32 это кодировка кода UTF-8 для пробела
				start = i;
				end = i;
				while (text.codePointAt(i) == 32) {
					end = i;
					i++;
					if (i >= text.length()) {
						break;
					}
				}
				if ((end - start) != 0) {
					StringBuffer sb = new StringBuffer(text);
					sb.delete(start, end);
					text = sb.toString();
				}
			}
		}
		return text;
	}

}
