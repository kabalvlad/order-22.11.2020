package by.lecttor.modul_01.branches;

import java.util.Scanner;

// 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
// Определить, пройдет ли кирпич через отверстие.

public class Task_04 {

	public static int A = 0; // Глобальные переменные для отверстия
	public static int B = 0;

	public static void main(String[] args) {

		int x;
		int y;
		int z;
		int c;

		System.out.print("Введите размер отверстия А >> ");
		A = inputINT();
		System.out.print("Введите размер отверстия B >> ");
		B = inputINT();
		System.out.print("Введите размер кирпича  x >> ");
		x = inputINT();
		System.out.print("Введите размер кирпича y >> ");
		y = inputINT();
		System.out.print("Введите размер кирпича z >> ");
		z = inputINT();

		// Проверка условия прохода кирпича
		c = chek(x, y);
		if (c == 0) {
			System.out.println("Кирпич проходит в отверстие размером " + A + "x" + B + " стороной " + x + "x" + y);
		}
		c = chek(y, z);
		if (c == 0) {
			System.out.println("Кирпич проходит в отверстие размером " + A + "x" + B + " стороной " + y + "x" + z);
		}
		c = chek(z, x);
		if (c == 0) {
			System.out.println("Кирпич проходит в отверстие размером " + A + "x" + B + " стороной " + x + "x" + z);
		}
	}

	// Проерка
	public static int chek(int i, int j) {
		int noy;
		if (A > i && B > j || A > j && B > i) {
			noy = 0; // проходит
		} else {
			noy = 1; // непроходит
		}
		return (noy);
	}

	// Ввод числа (int)
	public static int inputINT() {
		String i;
		int per;
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return (per);
	}
}
