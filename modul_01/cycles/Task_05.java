package by.lecttor.modul_01.cycles;

// 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
// заданному е. Общий член ряда имеет вид:

public class Task_05 {

	public static void main(String[] args) {
		double b = 300; // конец числового ряда
		double n = 1; // начало числового ряда
		double e = 0.001; // число е
		double an; // член ряда
		double sum = 0; // сумма ряда

		while (n < b) {
			an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(an) >= e) {
				sum = sum + n;
			}
			n++;
		}
		System.out.println("Модуль суммы трёх членов  = " + sum);

	}

}
