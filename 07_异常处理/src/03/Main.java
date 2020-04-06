public class Main {
	public static void main(String[] args) {
		String token = login("admin1", "password");
		System.out.println("Token: " + token);
	}

	static String login(String username, String password) {
		if (username.equals("admin")) {
			if (password.equals("password")) {
				return "xxxxxx";
			} else {
				// 抛出LoginFailedException:
				throw new LoginFailedException("Bad username or password.");
			}
		} else {
			// 抛出UserNotFoundException:
			throw new UserNotFoundException("User not found.");
		}
	}
}

class LoginFailedException extends IllegalArgumentException{
    public LoginFailedException(){
        super();
    }

    public LoginFailedException(String msg,Throwable cause){
        super(msg, cause);
    }

    public LoginFailedException(String msg){
        super(msg);
    }

    public LoginFailedException(Throwable cause){
        super(cause);
    }
}

class UserNotFoundException extends IllegalArgumentException{
    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String msg,Throwable cause){
        super(msg, cause);
    }

    public UserNotFoundException(String msg){
        super(msg);
    }

    public UserNotFoundException(Throwable cause){
        super(cause);
    }
}