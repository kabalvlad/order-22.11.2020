package by.lecttor.modul_03.working_with_a_string_as_an_array_of_characters;

import java.util.Scanner;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
3. В строке найти количество цифр.
 */

public class Task_03 {

	public static void main(String[] args) {
		String text;
		InputMyString inText = new InputMyString();
		System.out.println("Введите любой текст который может содержать цифры или буквы >>");
		text = inText.inputString();
		//System.out.println(text);
		numberOfDigits(text);

	}

	public static void numberOfDigits(String text) {
		char value;
		int count;

		count = 0;
		char[] Digits = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (int i = 0; i < text.length(); i++) {
			value = text.charAt(i);
			for (int j = 0; j < Digits.length; j++) {
				if (value == Digits[j]) {
					count++;
				}
			}
		}
		System.out.println("Количество цифр введеной строке равно: " + count);
	}

}
