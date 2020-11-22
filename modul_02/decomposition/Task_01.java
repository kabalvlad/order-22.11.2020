package by.lecttor.modul_02.decomposition;

import java.util.Scanner;

//�������� �����(������) ��� ���������� ����������� ������ 
//�������� � ����������� ������ �������� ���� ����������� �����:

public class Task_01 {

public static void main(String[] args) {

	int A;
	int B;
	int NOD;
	int NOK;

	System.out.println("������� ����������� ����� A >>");
	A = inputInt();
	System.out.println("������� ����������� ����� B >>");
	B = inputInt();

	NOD = searchNod(A, B);
	NOK = searchNok(A, B, NOD);
	System.out.println("��� = " + NOD);
	System.out.println("��� = " + NOK);

}

// ��������� � �������� ����� (int)
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

// ���������� ���
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

// ���������� ���
public static int searchNok(int x, int y, int nod) {
	int answer;

	answer = (x * y) / nod;

	return answer;
}

}