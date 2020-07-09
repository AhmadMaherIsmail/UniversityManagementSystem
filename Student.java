import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;

public class Student extends RegistrarOffice {
	SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
	public String FirstName;
	public String MiddleName;
	public String LastName;
	public String DateOfBirth;
	public String Email;
	public String Address;
	public String Gender;
	public int PhoneNumber;
	public String BloodType;
	final public String Type = "student";
	public int StudentID;
	public String StudentUsername;
	public String Currentyear;
	public int Studentcredits;
	public ArrayList<Courses> Studentcourses = new ArrayList<Courses>();

	public Student(String firstName, String middleName, String lastName, String dateOfBirth, String email,
			String address, String gender, int Phonenumber, String bloodType, int studentID, String studentUsername,
			String major, String currentyear, int studentcredits, ArrayList<Courses> studentcourses) {
		super(availablecourses, coursecategories, users);
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Email = email;
		Address = address;
		Gender = gender;
		BloodType = bloodType;
		StudentID = studentID;
		PhoneNumber = Phonenumber;
		StudentUsername = studentUsername;
		Major = major;
		Currentyear = currentyear;
		Studentcredits = studentcredits;

	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public String getCurrentyear() {
		return Currentyear;
	}

	public void setCurrentyear(String currentyear) {
		Currentyear = currentyear;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBloodType() {
		return BloodType;
	}

	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}

	public String getType() {
		return Type;
	}

	public String Major;
	public int CurrentYear;

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getStudentUsername() {
		return StudentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		StudentUsername = studentUsername;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	public int getCurrentYear() {
		return CurrentYear;
	}

	public void setCurrentYear(int currentYear) {
		CurrentYear = currentYear;
	}

	public int getStudentcredits() {
		return Studentcredits;
	}

	public void setStudentcredits(int studentcredits) {
		Studentcredits = studentcredits;
	}

	public ArrayList<Courses> getStudentcourses() {
		return Studentcourses;
	}

	public void setStudentcourses(ArrayList<Courses> studentcourses) {
		Studentcourses = studentcourses;
	}

	public boolean registercourses(int CRN) {
		for (int i = 0; i < availablecourses.size(); i++) {
			if (availablecourses.get(i).getCRN() == CRN) {
				if ((Studentcredits + availablecourses.get(i).credits) <= 18) {
					LocalTime startav = LocalTime.parse(availablecourses.get(i).getStarttime());
					LocalTime endav = LocalTime.parse(availablecourses.get(i).getEndtime());
					if ((Studentcourses.size()) == 0) {
						Studentcourses.add(availablecourses.get(i));
						Studentcredits += availablecourses.get(i).credits;
						System.out.println("Course registered successfully");
						return true;
					} else {
						for (int j = 0; j < Studentcourses.size(); j++) {
							LocalTime start = LocalTime.parse(Studentcourses.get(j).getStarttime());
							LocalTime end = LocalTime.parse(Studentcourses.get(j).getEndtime());
							if (((checkschedbefore(startav, start, end) && checkschedbefore(endav, start, end))
									|| (checkschedafter(startav, start, end) && checkschedafter(endav, start, end)))
									&& j == Studentcourses.size() - 1) {
								Studentcourses.add(availablecourses.get(i));
								Studentcredits += availablecourses.get(i).credits;
								System.out.println("Course registered successfully");
								return true;
							} else if ((!(checkschedbefore(startav, start, end) && checkschedbefore(endav, start, end))
									&& !(checkschedafter(startav, start, end) && checkschedafter(endav, start, end)))) {
								if (availablecourses.get(i).getDays()
										.equalsIgnoreCase(Studentcourses.get(j).getDays())) {
									System.out.println(
											"The course was not added.\nAdding this course will create a time conflict,check other classes that might have different class time.");
									return false;
								} else if (!(availablecourses.get(i).getDays()
										.equalsIgnoreCase(Studentcourses.get(j).getDays()))
										&& j == Studentcourses.size() - 1) {
									Studentcourses.add(availablecourses.get(i));
									Studentcredits += availablecourses.get(i).credits;
									System.out.println("Course registered successfully");
									return true;
								}

							}
						}
					}
				} else {
					System.out.println(
							"Adding this course will surpass the maximum amount of credits that can be taken in a semester.Try dropping a course in order to register this course.");
					return false;
				}
			}
		}
		System.out.println("There is no course with the CRN: " + CRN);
		return false;
	}

	public boolean dropcourse(int CRN) {
		for (int i = 0; i < Studentcourses.size(); i++) {
			if (Studentcourses.get(i).getCRN() == CRN) {
				Studentcredits -= Studentcourses.get(i).credits;
				Studentcourses.remove(Studentcourses.get(i));
				return true;
			}
		}
		System.out.println("There is no course with the CRN: " + CRN);
		return false;
	}

	public void printschedule() {
		System.out.println(
				"      _____________________________________________________________________________________________________________________________________________");
		System.out.println(
				"            Monday                      Tuesday                       Wednesday                       Thursday                       Friday");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					if (i <= 3) {
						System.out.println((i + 8) + ":" + "00AM");
						System.out.println();
					} else {
						System.out.println((i + 8) + ":" + "00PM");
						System.out.println();
					}
				}
				if (j == 0 || j == 2 || j == 4) {
					for (int j2 = 0; j2 < Studentcourses.size(); j2++) {
						LocalTime start = LocalTime.parse(Studentcourses.get(j2).getStarttime());
						LocalTime str, end;
						if (i + 8 < 9) {
							str = LocalTime.parse("0" + String.valueOf(i + 8) + ":" + "00");
							end = LocalTime.parse("0" + String.valueOf(i + 9) + ":" + "00");
						} else {
							if (i + 8 == 9) {
								str = LocalTime.parse("0" + String.valueOf(i + 8) + ":" + "00");
								end = LocalTime.parse(String.valueOf(i + 9) + ":" + "00");
							} else {
								str = LocalTime.parse(String.valueOf(i + 8) + ":" + "00");
								end = LocalTime.parse(String.valueOf(i + 9) + ":" + "00");
							}
						}
						if (Studentcourses.get(j2).getDays().equalsIgnoreCase("mwf"))
							if (!checkschedbefore(start, str, end) && !checkschedafter(start, str, end)) {
								if (Studentcourses.get(j2).getCoursename().length() <= 10)
									System.out.print("          " + Studentcourses.get(j2).getCoursename()
											+ "                                        ");
								else if (Studentcourses.get(j2).getCoursename().length() >= 20)
									System.out.print("         " + Studentcourses.get(j2).getCoursename()
											+ "                      ");
								else if (Studentcourses.get(j2).getCoursename().length() < 20)
									System.out.print("          " + Studentcourses.get(j2).getCoursename()
											+ "                            ");
							}
					}
				}
				if (j == 1 || j == 3) {
					for (int j2 = 0; j2 < Studentcourses.size(); j2++) {
						LocalTime start = LocalTime.parse(Studentcourses.get(j2).getStarttime());
						LocalTime str, end;
						if (i + 8 < 9) {
							str = LocalTime.parse("0" + String.valueOf(i + 8) + ":" + "00");
							end = LocalTime.parse("0" + String.valueOf(i + 9) + ":" + "00");
						} else {
							if (i + 8 == 9) {
								str = LocalTime.parse("0" + String.valueOf(i + 8) + ":" + "00");
								end = LocalTime.parse(String.valueOf(i + 9) + ":" + "00");
							} else {
								str = LocalTime.parse(String.valueOf(i + 8) + ":" + "00");
								end = LocalTime.parse(String.valueOf(i + 9) + ":" + "00");
							}
						}
						if (Studentcourses.get(j2).getDays().equalsIgnoreCase("tr")
								|| Studentcourses.get(j2).getDays().equalsIgnoreCase("tth"))
							if (!checkschedbefore(start, str, end) && !checkschedafter(start, str, end)) {
								if (Studentcourses.get(j2).getCoursename().length() <= 10)
									System.out.print("                                    "
											+ Studentcourses.get(j2).getCoursename()
											+ "                                 ");
								else
									System.out.print("                                     "
											+ Studentcourses.get(j2).getCoursename() + "   ");

							}
					}
				}
			}
			System.out.println();
		}

	}

	public int printcourses() {
		for (int i = 0; i < Studentcourses.size(); i++) {
			System.out.println(Studentcourses.get(i).toString());
		}
		return Studentcourses.size();
	}

	public static boolean checksched(LocalTime candidate, LocalTime start, LocalTime end) {
		return candidate.isBefore(start) || candidate.isAfter(end); // Inclusive.
	}

	public static boolean checkschedbefore(LocalTime candidate, LocalTime start, LocalTime end) {
		return candidate.isBefore(start); // Inclusive.
	}

	public static boolean checkschedafter(LocalTime candidate, LocalTime start, LocalTime end) {
		return candidate.isAfter(end); // Inclusive.
	}

}
