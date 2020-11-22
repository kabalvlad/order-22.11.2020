package by.lecttor.modul_03.working_with_a_string_as_an_array_of_characters;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

public class Task_04 {
	public static void main(String[] args) {
		String text;
		InputMyString inText = new InputMyString();
		System.out.println("Введите любой текст который может содержать цифры или буквы >>");
		text = inText.inputString();
		// System.out.println(text);
		amountOfNumbers(text);

	}

	public static void amountOfNumbers(String text) {
		char value;
		int count;

		count = 0;
		boolean[] DigitsBoolean = new boolean[text.length()];

		for (int i = 0; i < text.length(); i++) {
			value = text.charAt(i);
			DigitsBoolean[i] = Character.isDigit(value);
			//System.out.println(i + " " + DigitsBoolean[i]);
		}
		for ( int i = 0; i < DigitsBoolean.length; i++) {
			if(DigitsBoolean[i] == true) {
				count++;
				while (DigitsBoolean[i] == true & i < (DigitsBoolean.length -1)) {
					i++;
				}
			}
			
		}
		
		
		System.out.println("Количество чисел введеной строке равно: " + count);
	}

}
