package by.lecttor.modul_01.cycles;

// 3. Найти сумму квадратов первых ста чисел.

public class Task_03 {

	public static void main(String[] args) {
		int sum = 0;
		int x;

		for (int i = 1; i < 101; i++) {
			x = i;
			sum = sum + x * x;
			System.out.println(x + " " + sum + " " + x * x);
		}
		System.out.println("Cумма квадратов первых 100 чисел равна " + sum);
	}

}
