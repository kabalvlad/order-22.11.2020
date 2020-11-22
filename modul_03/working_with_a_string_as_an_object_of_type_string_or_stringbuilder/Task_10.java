package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 * 10. Строка X состоит из нескольких предложений, каждое из которых кончается
 * точкой, восклицательным или вопросительным знаком. Определить количество
 * предложений в строке X.
 */

public class Task_10 {

	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		sentence(text);

	}

	public static void sentence(String text) {
		int count;
		int value;

		count = 0;
		for (int i = 0; i < text.length(); i++) {
			value = text.codePointAt(i);
			switch (value) {
			case 46: // точка
				count++;
				break;
			case 33: // восклицательный знак
				count++;
				break;
			case 63: // вопросительный знак
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(" В введеном вами тексте нет знаков завершающие предлоджение!!!");
		} else {
			System.out.println(" В введеном вами тексте, количество предложение равно: " + count);
		}

	}

}
