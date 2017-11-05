import Java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.print("Please enter your name: ");
		Scanner in = new Scanner(System.in);
		String username = in.nextLine();	
		HelloUser hu = new HelloUser(username);
		hu.greetUser();
	}
}
