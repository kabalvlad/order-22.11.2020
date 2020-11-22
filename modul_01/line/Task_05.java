package by.lecttor.modul_01.line;

import java.util.Scanner;

// 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

public class Task_05 {

	public static void main(String[] args) {
		
		int t;
		int hour;
		int min;
		int sec;

		Scanner input = new Scanner(System.in);
		System.out.print("Введите время в секундах >>  ");
		t = input.nextInt();

		hour = t / 3600; // расчёт часов
		System.out.println(hour + " hour ");
		min = (t % 3600) / 60; // расчёт минут
		System.out.println(min + " min ");
		sec = (t % 3600) % 60; // расчёт секунд
		System.out.println(sec + " sec");

		System.out.println(hour + " ч. " + min + " мин. " + sec + " c.");

	}

}
