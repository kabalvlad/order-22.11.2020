package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

/*
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
 * не обрабатывать
 */

public class Task_08 {
	public static void main(String[] args) {
		String text;

		System.out.print("Введие любой текст >> ");
		text = InputMyString.inputString();
		System.out.println(" ");
		wordId(text);

	}

	// основной метод
	public static void wordId(String text) {
		int lengthMax;
		int positionMax;
		boolean value;

		String[] words = text.split("\\s");

		// посик самого длинного слова
		lengthMax = 0;
		positionMax = 0;
		for (int i = 0; i < words.length; i++) {
			if (lengthMax < words[i].length()) {
				positionMax = i;
				lengthMax = words[i].length();
			}
		}

		// проверка сколько самых длинных слов
		value = true;
		for (int i = 0; i < words.length; i++) {
			if (i == positionMax) {
				continue;
			}
			if (lengthMax == words[i].length()) {
				value = false;
			}
		}

		// вводт ответа
		if (value) {
			System.out.println(words[positionMax]);
		} else {
			System.out.println("Введенных строке несколько максимально длинных слов");
		}
	}

}
