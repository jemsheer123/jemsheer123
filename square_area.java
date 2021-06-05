import java.util.Scanner;
public class square_area {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Side of Square:");
		scanner = new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side; 
		System.out.println("Area of Square is: "+area);
	}

}
