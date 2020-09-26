public class LAB4 {
	
	public double add(double num1, double num2) {
		return num1+num2;
	}
	public double minus(double num1, double num2) {
		return num1-num2;
	}
	public static void main(String[] args) {
		LAB4 test = new LAB4();
		double num1 = 4;
		double num2 = 2;
		System.out.println(test.add(num1, num2));
		System.out.println(test.minus(num1, num2));
	}
}