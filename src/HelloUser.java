public class HelloUser {

	private String username;

	public HelloUser(String username) {
		this.username = username;
	}

	public void greetUser() {
		System.out.print("Hello " + username + "!");
	}
}
