package by.lecttor.modul_03.working_with_a_string_as_an_object_of_type_string_or_stringbuilder;

/*
 4. С помощью функции копирования и операции конкатенации составить 
 из частей слова “информатика” слово “торт”.
 */

public class Task_04 {

	public static void main(String[] args) {
		String word = "информатика";
		String wordCake;
		
		char [] letter = new char [4];
		letter[0]=word.charAt(7);
		letter[1]=word.charAt(3);
		letter[2]=word.charAt(4);
		letter[3]=word.charAt(7);
		
		wordCake = String.copyValueOf(letter);
		
		System.out.println(wordCake);
	}

}
