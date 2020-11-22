package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//Ќаписать метод(методы) дл€ нахождени€ наибольшего общего делител€ четырех натуральных чисел.

public class Task_02 {

	public static void main(String[] args) {

		int A;
		int B;
		int C;
		int D;
		int nod;

		System.out.println("¬ведите натураленое число A >>");
		A = inputInt();
		System.out.println("¬ведите натураленое число B >>");
		B = inputInt();
		System.out.println("¬ведите натураленое число C >>");
		C = inputInt();
		System.out.println("¬ведите натураленое число D >>");
		D = inputInt();
		
		nod = searchNod(A,B,C,D);
		System.out.print(nod);

	}

	// ѕолучение и проверка числа (int)
	public static int inputInt() {
		int per;
		String i;

		Scanner in = new Scanner(System.in);

		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			i = in.nextLine();
		}
		per = in.nextInt();
		return (per);
	}

	// Ќахождени€ наибольшего общего делител€
	public static int searchNod(int x, int y, int v, int s) {
		int min;
		int z = 1;

		min = Math.min(Math.min(x, y), Math.min(s, v));
		for (int i = 1; i <= min; i++) {
			if (x % i == 0 && y % i == 0 && v % i == 0 && s % i == 0) {
				z = i;
			}
		}
		return z;
	}

}