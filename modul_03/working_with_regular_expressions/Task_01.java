package by.lecttor.modul_03.working_with_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и
 * позволяющее выполнять с текстом три различных операции: отсортировать абзацы
 * по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 */

public class Task_01 {
	public static void main(String[] args) {
		String text;

		text = "Not that I'm blaming the movie for omitting some details. Some things from the book would not have"
				+ " translated easily to the screen, and it would have been very difficult to stick everything in. "
				+ "Had Columbus done so and allowed the film to be as long as necessary (eight hours, maybe), "
				+ "like a BBC miniseries, the film might have been a masterpiece, but few kids would ever have had "
				+ "the patience or attention span to sit through it.\r\n"
				+ "The problem is that the amusing details are much of what make Harry Potter such a special story. "
				+ "A whole universe is created in Rowling's series, in which a magical society exists within our own"
				+ " ordinary \"muggle\" world and is kept secret by a bureaucracy with its own rules, history and "
				+ "politics, the way magic is treated in her books, not as something medieval but as very similar"
				+ " to the way our own contemporary world works, is a large part of their charm. Take away these details,"
				+ " and you're left with a fairly conventional tale of a young wizard fighting an evil sorcerer.\r\n"
				+ "Although the audience I was with broke into applause as soon as the movie ended (something I've "
				+ "never seen happen before, though I don't go to the theater that often), some people have complained"
				+ " about the movie dragging at certain points. I didn't have that problem, but, as I said, I wasn't "
				+ "really trying to get involved in the movie's story. After thinking about it, it does seem like parts"
				+ " of the movie fail to convey a sense of urgency. Why should this be? I never felt that way when reading"
				+ " the books, and this is without a doubt the very same story.\r\n"
				+ "The answer, I think, is that the books portray much of Harry's anxiety in trying to succeed in "
				+ "school (for if he's kicked out, he'll go straight back to his horrible uncle) and fit in with the"
				+ " kids there. The movie doesn't tap into these anxieties enough, so why should we care whether he wins "
				+ "the Quidditch match (other than that he survives in one piece) and gets through the school year? "
				+ "The only real suspense in the movie after he arrives at Hogwarts comes from the story of Lord"
				+ " Voldemort returning, which in the book is almost secondary. Harry's adventures getting along in the"
				+ " school are fun and interesting, but as they are presented to us in the film, there isn't enough tying "
				+ "them all together.\r\n"
				+ "What we have here is a serviceable dramatization of a wonderful children's series, but it doesn't"
				+ " entirely succeed in standing on its own, perhaps it should have diverged from the book just a little,"
				+ " to compensate for the difficulties in translating some of the book's delights to the screen. "
				+ "In its current form, it's almost like a preview of the book, its lack of fullness, and its dependence "
				+ "on the book, might actually increase the popularity and endurance of Rowling's series by making those "
				+ "who see the film yearn for more, which they can get from the real thing.\r\n";

		System.out.print("БЫЛО:   ");
		System.out.println(text);
		text = Paragraph(text);
		System.out.println(" ");
		System.out.print("СТАЛО: ");
		System.out.println(text);

	}

	// ==============================================================================================
	// ==============================================================================================
	// СОРТИРОВКА ТЕКСТА ПО ЗАДАНИЮ
	public static String Paragraph(String text) {
		int count = 0;
		String[] arrayParag;
		String[][] arraySentence;
		boolean needIteration;
		StringBuilder sb = new StringBuilder(text);

		// создание шаблона параграфа
		Pattern pat = Pattern.compile("..+?[\\r\\n]", Pattern.MULTILINE);
		Matcher mat = pat.matcher(sb);

		// подсчет колиечества сопаставлений
		while (mat.find()) {
			count++;
		}
		arrayParag = new String[count];

		// заполнение массива параграфами
		count = 0;
		mat.reset(); // сброс сопоставителя
		while (mat.find()) {
			arrayParag[count] = sb.substring(mat.start(), mat.end());
			if (count >= arrayParag.length) {
				break;
			} else {
				count++;
			}
		}

		// Сортировка массива параграфа по числу предложений (пузырьковая сортировка)
		needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < arrayParag.length; i++) {
				if (sortSentence(arrayParag[i]) < sortSentence(arrayParag[i - 1])) {
					swap(arrayParag, i, i - 1);
					needIteration = true;
				}
			}
		}

		// обявление массива предложений
		arraySentence = new String[arrayParag.length][];
		for (int i = 0; i < arrayParag.length; i++) {
			arraySentence[i] = new String[sortSentence(arrayParag[i])];
		}

		// заполнение массива предложений
		arraySentence = fillingSentence(arrayParag, arraySentence);


		// Создание шаблона для разделения предложения на слова
		Pattern patWords = Pattern.compile("[\\W]?[\\s]", Pattern.CASE_INSENSITIVE);
		for (int i = 0; i < arraySentence.length; i++) {
			for (int j = 0; j < arraySentence[i].length; j++) {
				String[] words = patWords.split(arraySentence[i][j]);

				// Сортировка слов по длинне и лексем по алфавиту!
				needIteration = true;
				while (needIteration) { // сортировка пузырьком
					needIteration = false;
					for (int k = 1; k < words.length; k++) {
						if (words[k].length() > words[k - 1].length()) {
							swap(words, k, k - 1);
							needIteration = true;
						} else { // если длинна слов одинакова то проверяю по алфавиту с учетом регитсра
							if (words[k].length() == words[k - 1].length()) {
								count = 0; // счетчик на длинну слов
								boolean interNeed = true;
								while (interNeed) {
									if (count == words[k].length()) { // пороверка чтоб счётчик не прывсил длинну слова
										break;
									}
									int w1 = words[k].codePointAt(count);
									int w2 = words[k - 1].codePointAt(count);
									if (w1 == w2) { // добовление счётчки +1 для проверки следующей буквы
										count++;
									} else {
										if (w1 < w2) { // если бкувы разные то их замена
											swap(words, k, k - 1);
											needIteration = true;
											interNeed = false;
											break;
										} else {
											interNeed = false;
											break;
										}
									}
								}
							}
						}
					}
				}
				arraySentence[i][j] = createNewSentence(words);
			}
		}

		//создание паранрафа
		arrayParag = createNewParag(arraySentence);
		//создание текста
		text = createNewText(arrayParag);

		return text;
	}
	// ==============================================================================================
	// ==============================================================================================

	private static void distWordLen(String[][] arraySentence) {

	}

	// заполнение массива предложениями
	private static String[][] fillingSentence(String[] arrayParag, String[][] arraySentence) {
		Pattern pat = Pattern.compile("..+?[\\.\\?\\!][\\s]?", Pattern.MULTILINE);
		for (int i = 0; i < arraySentence.length; i++) {
			Matcher mat = pat.matcher(arrayParag[i]);
			int j = 0;
			while (mat.find()) {
				arraySentence[i][j] = arrayParag[i].substring(mat.start(), mat.end());
				if (j >= arraySentence.length) {
					break;
				} else {
					j++;
				}
			}
		}
		return arraySentence;
	}

	// создание нового праграфа из предложениий
	private static String[] createNewParag(String[][] arraySentence) {
		String newText;
		String[] arrayParag = new String[arraySentence.length];
		for (int i = 0; i < arraySentence.length; i++) {
			newText = "";
			for (int j = 0; j < arraySentence[i].length; j++) {
				newText = newText + arraySentence[i][j] + " ";
			}
			arrayParag[i] = newText;
		}
		return arrayParag;
	}

	// создания нового текста из массива отсортированных параграфов
	private static String createNewText(String[] paragraph) {
		String newText = "";

		for (int i = 0; i < paragraph.length; i++) {
			newText = newText + paragraph[i] + "\r\n";
		}
		return newText;
	}

	// создания нового предложения из сортированных слов
	private static String createNewSentence(String[] Sentence) {
		String newText = "";

		for (int i = 0; i < Sentence.length; i++) {
			newText = newText + Sentence[i] + " ";
		}
		StringBuilder sb = new StringBuilder(newText);
		sb = sb.deleteCharAt(sb.length() - 1);
		newText = sb.toString();
		newText = newText + ". ";

		return newText;
	}

	// замена мест в массиве
	private static void swap(String[] array, int ind1, int ind2) {
		String tmp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = tmp;
	}

	// Подсчет числа предложений
	public static int sortSentence(String text) {
		int count = 0;
		Pattern pat = Pattern.compile("..+?[\\.\\?\\!][s]?", Pattern.MULTILINE);
		Matcher mat = pat.matcher(text);
		while (mat.find()) {
			count++;
		}
		return count;
	}

}
