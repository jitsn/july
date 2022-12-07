package conditionalstatements;

public class Nestedif {
	public static void main(String[] args) {
		String username="1234";
		String password="ASDF";
		if(username=="1234") {
			System.out.println("username is correct");
		
		if(password=="ASD") {
		System.out.println("password is wright");
		System.out.println("login sucessfull");
	    }
		else {
		System.out.println("wrong password");
		System.out.println("login failed");
        }
		}
		else {
		System.out.println("wrong username");
		System.out.println("login failed");
		}
        }
        }