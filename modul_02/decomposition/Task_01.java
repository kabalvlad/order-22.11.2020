package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего 
//делителя и наименьшего общего кратного двух натуральных чисел:

public class Task_01 {

public static void main(String[] args) {

	int A;
	int B;
	int NOD;
	int NOK;

	System.out.println("Введите натураленое число A >>");
	A = inputInt();
	System.out.println("Введите натураленое число B >>");
	B = inputInt();

	NOD = searchNod(A, B);
	NOK = searchNok(A, B, NOD);
	System.out.println("НОД = " + NOD);
	System.out.println("НОК = " + NOK);

}

// Получение и проверка числа (int)
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

// Нахождение НОД
public static int searchNod(int x, int y) {
	int min;
	int z = 1;

	min = Math.min(x, y);
	for (int i = 1; i <= min; i++) {
		if (x % i == 0 && y % i == 0) {
			z = i;
		}
	}
	return z;
}

// Нахождение НОК
public static int searchNok(int x, int y, int nod) {
	int answer;

	answer = (x * y) / nod;

	return answer;
}

}