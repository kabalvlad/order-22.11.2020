package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было\
  введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Task_07 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		LetterDelete(text);

	}

	public static void LetterDelete(String text) {
		char value;
		StringBuilder sBuText = new StringBuilder(text);
		for (int i = 0; i < sBuText.length(); i++) {
			value = sBuText.charAt(i);
			for (int j = i; j < sBuText.length(); j++) {
				if (j != i) {
					if (value == sBuText.charAt(j)) {
						sBuText = sBuText.deleteCharAt(j);
					}
				}
			}
		}
		for (int i = 0; i < sBuText.length(); i++) {
			value = sBuText.charAt(i);
			if (value == ' ') {
				sBuText = sBuText.deleteCharAt(i);
			}
		}
		System.out.println(sBuText.toString());

	}

}
