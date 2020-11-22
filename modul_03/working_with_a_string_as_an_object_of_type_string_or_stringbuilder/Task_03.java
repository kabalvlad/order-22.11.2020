package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 * 3. Проверить, является ли заданное слово палиндромом.
 */

public class Task_03 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		palindrome(text);

	}

	public static void palindrome(String text) {
		char value1;
		char value2;
		int j;
		boolean palind = false;
		j = (text.length() - 1);
		for (int i = 0; i <= (text.length() / 2); i++) {
			value1 = text.charAt(i);
			value2 = text.charAt(j);
			if (value1 != value2) {
				System.out.println("Введенный текст '" + text + "' не является  палиндромом");
				palind = false;
				break;
			} else {
				palind = true;
			}
			j--;
		}
		if (palind) {
			System.out.println("Введенный текст '" + text + "' является  палиндромом");
		}

	}

}
