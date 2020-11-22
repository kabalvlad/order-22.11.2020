package by.lecttor.modul_04.simplest_classes_and_objects.task_02;

public class Test2 {
	public double x;
	public boolean y;

	public void printScrean(double x, boolean y) {
		System.out.println(" X = " + x + " Y = " + y);
		return;
	}

	public void setValue(double x, boolean y) {
		this.x = x;
		this.y = y;

	}

	public void setValueNull() {
		this.x = 0.0;
		this.y = false;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public boolean getY() {
		return y;
	}

	public void setY(boolean y) {
		this.y = y;
	}
}
