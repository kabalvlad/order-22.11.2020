package by.lecttor.modul_02.decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task_07 {

	public static void main(String[] args) {
		int sum;

		sum = factorial();
		System.out.println(sum);
	}

	// Метод по поиску факториала
	public static int factorial() {
		int sum;
		int proi;

		sum = 0;

		for (int i = 1; i <= 9; i++) {
			if ((i % 2) != 0) {
				proi = 1;
				for (int j = 1; j <= i; j++) {
					proi = proi * j;
				}
				sum = proi + sum;

			}
		}
		return sum;
	}

}