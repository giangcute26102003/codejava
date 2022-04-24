import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		// Create object sc of class Scanner to input data
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name);
	}
}