public class LAB4 {
	
	public float add(int num1, int num2) {
		return num1+num2;
	}
	public float minus(int num1, int num2) {
		return num1-num2;
	}
	public static void main(String[] args) {
		LAB4 test = new LAB4();
		int num1 = 4;
		int num2 = 2;
		System.out.println(test.add(num1, num2));
		System.out.println(test.minus(num1, num2));
	}
}