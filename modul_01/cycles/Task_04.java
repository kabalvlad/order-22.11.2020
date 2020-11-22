package by.lecttor.modul_01.cycles;

import java.math.BigInteger;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task_04 {

	public static void main(String[] args) {
		int x = 200;
		BigInteger sum = BigInteger.valueOf(1);

		for (int i = 1; i <= x; i++) {
			sum = sum.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println(sum);

	}
}
