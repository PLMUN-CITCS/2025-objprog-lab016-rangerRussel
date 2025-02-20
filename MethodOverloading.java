public class MethodOverloading {
	public static void main(String[] args) {
	   printValue(10);
	   printValue(3.14);
	   printValue("Hello!");
	}// main close

	public static void printValue(int number) {
	   System.out.println("Integer value: " + number);
	}// print close

	public static void printValue(double number) {
	   System.out.println("Double value: " + number);
	}// 2nd print close

	public static void printValue(String text) {
	   System.out.println("String Value: " + text);
	}// 3rd print close
}// class close
