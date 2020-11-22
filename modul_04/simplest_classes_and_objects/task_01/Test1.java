package by.lecttor.modul_04.simplest_classes_and_objects.task_01;

public class Test1 {
	private int x;
	private int y;

	public void printScrean(int x, int y) {
		System.out.println(" X = " + x + " Y = " + y);
		return;
	}

	public void sum(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println(" Сумма = " + sum);
	}
	public void max (int x, int y) {
		int max;
		max = Math.max(x, y);
		System.out.println(" Наибольшее занчение = " + max);
	
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
