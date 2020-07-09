import java.time.LocalTime;
import java.util.ArrayList;

public class Instructors extends RegistrarOffice {
	public String firstname;
	public String lastname;
	public int FacultyID;
	public String FacultyUsername;
	private String password;
	public ArrayList<Courses> drcourses = new ArrayList<Courses>();

	public Instructors(String firstname, String lastname, int facultyID, String facultyUsername, String password,
			ArrayList<Courses> drcourses) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		FacultyID = facultyID;
		FacultyUsername = facultyUsername;
		this.password = password;
		this.drcourses = drcourses;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getFacultyID() {
		return FacultyID;
	}

	public void setFacultyID(int facultyID) {
		FacultyID = facultyID;
	}

	public String getFacultyUsername() {
		return FacultyUsername;
	}

	public void setFacultyUsername(String facultyUsername) {
		FacultyUsername = facultyUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Courses> getDrcourses() {
		return drcourses;
	}

	public void setDrcourses(ArrayList<Courses> drcourses) {
		this.drcourses = drcourses;
	}

	public boolean addcourse(Courses course) {
		LocalTime startav = LocalTime.parse(course.getStarttime());
		LocalTime endav = LocalTime.parse(course.getEndtime());
		for (int j = 0; j < drcourses.size(); j++) {
			LocalTime start = LocalTime.parse(drcourses.get(j).getStarttime());
			LocalTime end = LocalTime.parse(drcourses.get(j).getEndtime());
			if (checksched(startav, start, end) && checksched(endav, start, end) && j == drcourses.size() - 1) {
				drcourses.add(course);
				return true;
			}
		}
		System.out.println(
				"The course was not added./nAdding this course will create a time conflict,check other classes that might have class time.");
		return false;
	}

	public boolean addcourse(int CRN) {
		for (int i = 0; i < availablecourses.size(); i++) {
			if (availablecourses.get(i).getCRN() == CRN) {
				LocalTime startav = LocalTime.parse(availablecourses.get(i).getStarttime());
				LocalTime endav = LocalTime.parse(availablecourses.get(i).getEndtime());
				for (int j = 0; j < drcourses.size(); j++) {
					LocalTime start = LocalTime.parse(drcourses.get(j).getStarttime());
					LocalTime end = LocalTime.parse(drcourses.get(j).getEndtime());
					if (checksched(startav, start, end) && checksched(endav, start, end) && j == drcourses.size() - 1) {
						drcourses.add(availablecourses.get(i));
						return true;
					}
				}
				System.out.println(
						"The course was not added./nAdding this course will create a time conflict,check other classes that might have class time.");
				return false;

			}
		}
		System.out.println("There is no course with the CRN: " + CRN);
		return false;

	}

	public void removecourse(int courseid) {
		for (int i = 0; i < drcourses.size(); i++) {
			if (drcourses.get(i).CRN == courseid)
				drcourses.remove(i);
		}
	}

	public void removecourse(String coursename) {
		for (int i = 0; i < drcourses.size(); i++) {
			if (drcourses.get(i).coursename == coursename)
				drcourses.remove(i);
		}
	}

	public void removecourseclass(int courseid, int classid) {
		for (int i = 0; i < drcourses.size(); i++) {
			if (drcourses.get(i).CRN == courseid)
				drcourses.remove(i);
		}
	}

	public void removecourseclass(String coursename, int classid) {
		for (int i = 0; i < drcourses.size(); i++) {
			if (drcourses.get(i).coursename == coursename && drcourses.get(i).classnumber == classid)
				drcourses.remove(i);
		}
	}

	public void printdrcourses() {
		for (int i = 0; i < drcourses.size(); i++) {
			System.out.println(drcourses.get(i).toString());
		}
	}

	public static boolean checksched(LocalTime candidate, LocalTime start, LocalTime end) {
		return candidate.isBefore(start) || candidate.isAfter(end); // Inclusive.
	}

	public void printschedule() {
		System.out.println(
				"      ______________________________________________________________________________________________________");
		System.out.println(
				"        Monday            Tuesday            Wednesday            Thursday            Friday");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					if (i <= 3)
						System.out.print((i + 8) + ":" + "00AM");
					else
						System.out.print((i + 8) + ":" + "00PM");
				}
				if (j == 0 || j == 2 || j == 4) {
					for (int j2 = 0; j2 < drcourses.size(); j2++) {
						LocalTime start = LocalTime.parse(drcourses.get(j2).getStarttime());
						LocalTime str = LocalTime.parse(String.valueOf(i) + ":" + "00");
						LocalTime end = LocalTime.parse(String.valueOf(i + 1) + ":" + "00");
						if (drcourses.get(j2).getDays().equalsIgnoreCase("mwf"))
							if (!checksched(start, str, end))
								System.out.print(drcourses.get(j2).getCoursename() + "     ");
					}
				}
				if (j == 1 || j == 3) {
					for (int j2 = 0; j2 < drcourses.size(); j2++) {
						LocalTime start = LocalTime.parse(drcourses.get(j2).getStarttime());
						LocalTime str = LocalTime.parse(String.valueOf(i) + ":" + "00");
						LocalTime end = LocalTime.parse(String.valueOf(i + 1) + ":" + "00");
						if (drcourses.get(j2).getDays().equalsIgnoreCase("tr")
								|| drcourses.get(j2).getDays().equalsIgnoreCase("tth"))
							if (!checksched(start, str, end))
								System.out.print(drcourses.get(j2).getCoursename() + "  ");
					}
				}
			}

		}
	}

}
