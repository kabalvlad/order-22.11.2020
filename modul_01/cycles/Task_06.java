package by.lecttor.modul_01.cycles;

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class Task_06 {

	public static void main(String[] args) {
		String count;
		for (int i = 1; i < 128; i++) {
			System.out.println(count = (char) i + "  -  " + i);
		}
	}

}
