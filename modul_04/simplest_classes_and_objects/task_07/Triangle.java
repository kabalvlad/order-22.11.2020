
package by.lecttor.modul_04.simplest_classes_and_objects.task_07;

public class Triangle {

	private double AX;
	private double BX;
	private double CX;
	private double AY;
	private double BY;
	private double CY;

	private double A;
	private double B;
	private double C;

	private double a;
	private double b;
	private double c;

	// конструктор
	public void Triangle(double ax, double ay, double bx, double by, double cx, double cy) throws Exception {
		// Расчёт векторов
		this.a = calcVector(bx, by, cx, cy);
		this.b = calcVector(cx, cy, ax, ay);
		this.c = calcVector(ax, ay, bx, by);
		// проверка все ли стороны положительны
		if (a <= 0 || b <= 0 || c <= 0) {
			throw new Exception("Попытка создания треугольника со стороной  <= 0");
		}
		// являются ли стороны суммой меньше двух других
		if (a + b <= c || a + b <= c || b + c <= a) {
			throw new Exception("Одна сторона больше суммы двух других");
		}
		this.A = a;
		this.B = b;
		this.C = c;
		this.AX = ax;
		this.AY = ay;
		this.BX = bx;
		this.BY = by;
		this.CX = cx;
		this.CY = cy;
	}

	// Конструктор длинны отрезка
	private double calcVector(double ax, double ay, double bx, double by) {
		double result;
		result = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
		return result;
	}

	// Вычисление площади
	public void calcArea() {
		// Вычисление по формуле Герона
		double p = (A + B + C) / 2;
		double result = Math.sqrt(p * (p - A) * (p - B) * (p - C));
		System.out.print("Площадь труегольника равна: ");
		System.out.printf("%.2f",  result);
		System.out.println(" ");
	}

	// Вычисление периметра
	public void calcPerimeter() {
		double result = A + B + C;
		System.out.print("Периметр труегольника равен: ");
		System.out.printf("%.2f",  result);
		System.out.println(" ");
	}

	// Вычесление точки пересечения медиан
	public void calcMediana() {
		double Mx;
		double My;
		Mx = (AX + BX + CX) / 3;
		My = (AY + BY + CY) / 3;
		System.out.print("Точка пересечения медиан треугольника ABC по оси X = ");
		System.out.printf("%.2f",  Mx);
		System.out.print(" ось Y = ");
		System.out.printf("%.2f",  My);
		System.out.println(" ");
	}

}
