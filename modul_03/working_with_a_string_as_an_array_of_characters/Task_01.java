package by.lecttor.modul_03.working_with_a_string_as_an_array_of_characters;

/*
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task_01 {
	public static void main(String[] args) {
		String[] words = new String[] { "hardDei", "большойКуш", "youShellNotPass", "snakeЗмея" };

		System.out.println("Начальный массив названий переменных: ");
		print(words);
		System.out.println("  ");
		words = convertor(words);
		System.out.println("  ");
		System.out.println("Переобразованный массив названий переменных: ");
		print(words);
	}

	public static String[] convertor(String[] words) {
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				char value = words[i].charAt(j);
				if (Character.isUpperCase(value)) {
					// System.out.println(value); //для теста
					String newValue = "_" + Character.toLowerCase(value);
					String startValue = words[i].substring(0, j);
					String endValue = words[i].substring(j + 1, words[i].length());
					// System.out.println(startValue); //для теста
					// System.out.println(endValue); //для теста
					words[i] = startValue + newValue + endValue;
				}
			}
		}
		return words;
	}

	public static void print(String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + ", ");
		}
	}
}
