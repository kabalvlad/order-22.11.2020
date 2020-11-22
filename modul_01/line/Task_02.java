package by.lecttor.modul_01.line;

// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task_02 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double chast;
		double cheslit;
		double razn;
		double sum;
		double otvet;

		a = 9;
		b = 8;
		c = 10;

		chast = 2 * a;
		cheslit = b + Math.sqrt(b * b + 4 * a * c);
		razn = Math.pow(a, 3) * c;
		sum = Math.pow(b, (-2));

		otvet = cheslit / chast + razn - sum;
		System.out.println("Значения выражения = " + otvet);
	}

}
