package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

/* 
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task_15 {

	public static void main(String[] args) {
		int n;

		System.out.print("Введите n, где n число цифр в числе >> ");
		n = inputInt();
		n = control2(n);
		gap(n);

	}

	// проверяем каждое число из массива что оно болше последущего на 1
	public static boolean arrayIf(int[] arrayGap) {
		int size;
		boolean rise;

		rise = false;

		size = arrayGap.length;
		for (int i = 1; i < size; i++) {
			if (arrayGap[0] == arrayGap[i] - i) {
				rise = true;
			} else {
				rise = false;
				break;
			}
		}
		return rise;
	}

	// основная часть
	public static void gap(int n) {
		int j;
		int l;
		boolean rise;

		j = 1;

		for (int i = 1; i < n; i++) { // нахожу минимальное число с которого идёт проверка
			j = j * 10;
		}
		for (int i = j; i < (j * 10); i++) { // перебираю все числа от минимального до максимального
			int[] arrayGap;
			arrayGap = new int[n];
			l = i;
			for (int k = n - 1; k >= 0; k--) { // создаю массисив и заполняю числом выше разбитым на цифры
				arrayGap[k] = l % 10;
				l = l / 10;
			}
			rise = arrayIf(arrayGap); // проаерка нашего числа через массив отдельным методом
			if (rise) {
				System.out.println(i);
			}
		}
	}

	// проверка числа больше одного
	public static int control2(int x) {
		while (x <= 1 || x >= 10) {
			System.out.print("Число должна быть больше 2 и меньше 10, повторите ввод >> ");
			x = inputInt();
		}
		return x;
	}

	// ввод числа
	public static int inputInt() {
		int per;
		String i;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print("Повторите ввод >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return per;
	}

}
