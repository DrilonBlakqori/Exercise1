import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.print("Please enter your name: ");
		HelloUser helloUser = new HelloUser(scanner.nextLine());
		helloUser.greetUser();
	}
}
