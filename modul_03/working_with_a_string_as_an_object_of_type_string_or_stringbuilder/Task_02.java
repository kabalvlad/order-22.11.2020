package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task_02 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		SeachLetters(text);

	}

	public static void SeachLetters(String text) {
		char value;
		StringBuilder sBuText = new StringBuilder(text);
		for (int i = 0; i < sBuText.length(); i++) {
			value = sBuText.charAt(i);
			if (value == 'a') {
				sBuText = sBuText.insert((i + 1), 'b');
				i++;
			}
		}
		System.out.println(sBuText.toString());

	}

}
