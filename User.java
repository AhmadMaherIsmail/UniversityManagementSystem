
public class User {
	public String Username;
	public String Password;
	public static Student Student; 
	

	public User(String username,String password, Student student) {
		super();
		Username=username;
		Password=password;
		Student=student;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public Student getStudent() {
		return Student;
	}
	


}
