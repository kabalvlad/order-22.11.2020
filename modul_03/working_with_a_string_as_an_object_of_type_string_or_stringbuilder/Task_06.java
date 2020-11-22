package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task_06 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		LetterDouble(text);

	}

	public static void LetterDouble(String text) {
		String value;
		StringBuilder sBuText = new StringBuilder(text);
		for (int i = 0; i < sBuText.length(); i++) {
			value = sBuText.substring(i, i+1);
			sBuText = sBuText.insert(i, value);
			i++;
		}
		System.out.println(sBuText.toString());

	}
}
