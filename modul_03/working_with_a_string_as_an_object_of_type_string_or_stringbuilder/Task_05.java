package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task_05 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		SeachLettersA(text);

	}

	public static void SeachLettersA(String text) {
		char value;
		int count;

		count = 0;
		for (int i = 0; i < text.length(); i++) {
			value = text.charAt(i);
			if (value == 'a' || value == 'а') {
				count++;
			}
		}
		System.out.println("Cреди символов заданной строки буква 'а' встречается " + count + " раз");

	}
}
