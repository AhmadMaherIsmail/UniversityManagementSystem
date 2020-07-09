import java.util.ArrayList;

public class RegistrarOffice {
	public static ArrayList<Courses> availablecourses = new ArrayList<Courses>();
	public static ArrayList<String> coursecategories = new ArrayList<String>();
	public static ArrayList<User> users = new ArrayList<User>();

	public RegistrarOffice(ArrayList<Courses> availablecourses) {
		super();
		this.availablecourses = availablecourses;
	}

	public RegistrarOffice(ArrayList<Courses> availablecourses, ArrayList<String> coursecategories,
			ArrayList<User> users) {
		super();
		this.availablecourses = availablecourses;
		this.coursecategories = coursecategories;
		this.users = users;
	}

	public RegistrarOffice() {
		super();
	}

	public ArrayList<Courses> getAvailablecourses() {
		return availablecourses;
	}

	public void setAvailablecourses(ArrayList<Courses> availablecourses) {
		this.availablecourses = availablecourses;
	}

	public void addcourses(Courses course) {
		availablecourses.add(course);
	}

	public void removecourse(Courses course) {
		availablecourses.remove(course);
	}

	public void removeuser(User user) {
		users.remove(user);
	}

	public void addusers(User user) {
		users.add(user);
	}

	public void Printcourses() {
		for (int i = 0; i < availablecourses.size(); i++) {
			availablecourses.get(i).toString();
		}
	}

	public void coursecategories() {
		for (int i = 0; i < coursecategories.size(); i++) {
			System.out.println(coursecategories.get(i));
		}
	}

	public void SearchCoursecategories(String type) {
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < availablecourses.size(); i++) {
			if (availablecourses.get(i).getType().equalsIgnoreCase(type)) {
				if (temp.size() == 0)
					temp.add(availablecourses.get(i).getCoursename());
				else {
					for (int j = 0; j < temp.size(); j++) {
						if (!temp.get(j).equalsIgnoreCase(availablecourses.get(i).getCoursename())
								&& j == temp.size() - 1) {
							temp.add(availablecourses.get(i).getCoursename());
						} else if (temp.get(j).equalsIgnoreCase(availablecourses.get(i).getCoursename()))
							break;
					}
				}
			}
		}

		for (int j = 0; j < temp.size(); j++) {
			System.out.println(temp.get(j));
		}
	}

	public void searchcourseclasses(String coursename) {
		for (int i = 0; i < availablecourses.size(); i++) {
			if (availablecourses.get(i).getCoursename().equalsIgnoreCase(coursename))
				System.out.println(availablecourses.get(i).toString());
		}
		System.out.println();
	}

	public boolean checkusercredential(String username, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equalsIgnoreCase(username)
					&& users.get(i).getPassword().equalsIgnoreCase(password)) {
				System.out.println("successful login");
				return true;
			} else if (users.get(i).getUsername().equalsIgnoreCase(username)
					&& !users.get(i).getPassword().equalsIgnoreCase(password)) {
				System.out.println("Incorrect Password.");
				return false;
			} else if (!users.get(i).getUsername().equalsIgnoreCase(username)
					&& users.get(i).getPassword().equalsIgnoreCase(password)) {
				System.out.println("This Username does not exist.");
				return false;
			}
		}
		System.out.println("Incorrect Username and Password");
		return false;
	}

	public User checkuser(String username) {
		for (int i = 0; i < users.size(); i++) {
			if (username.equalsIgnoreCase(users.get(i).getUsername()))
				return users.get(i);
		}
		return null;

	}

}
