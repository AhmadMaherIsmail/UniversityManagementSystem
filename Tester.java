import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Courses> availablecourses = new ArrayList<Courses>();
		ArrayList<String> category = new ArrayList<String>();
		ArrayList<User> users = new ArrayList<User>();
		RegistrarOffice registrar = new RegistrarOffice(availablecourses, category, users);
		ArrayList<Courses> s1courses = new ArrayList<Courses>();
		Student s1 = new Student("ali", "michael", "habyter", "07/08/2000", "ali.hbayter@its.edu", "Hamra Street", "M",
				76313313, "O+", 201967328, "ali.hbayter", "artandfilming", "Junior", 0, s1courses);
		ArrayList<Courses> s2courses = new ArrayList<Courses>();
		Student s2 = new Student("kefin", "hicham", "Onaissi", "07/11/1999", "kefin.onaissi@its.edu",
				"Ashrafieh Street", "M", 76389132, "O+", 2019050811,
				"kefin.onaissi", "business", "Junior", 0, s2courses);
		ArrayList<Courses> s3courses = new ArrayList<Courses>();
		Student s3 = new Student("pricila", "ahmad", "ismail", "17/02/2004", "pricila.ismail@its.edu", "Jounieh",
				"F", 78069420, "A-", 202045420, "pricila.ismail", "ITM", "sophomore", 0, s3courses);
		ArrayList<Courses> s4courses = new ArrayList<Courses>();
		Student s4 = new Student("hassin", "nassip", "doher", "01/09/1918", "hassin.doher@its.edu",
				"Nabatieh", "F", 03462467, "B+", 2019234155,
				"hassin.doher", "hospitality", "Sophomore", 0, s4courses);
		ArrayList<Courses> s5courses = new ArrayList<Courses>();
		Student s5 = new Student("mia", "dimitri", "malkof", "09/04/1969", "mia.malkof@its.edu", "Ghbayre", "F",
				79699600, "AB+", 202048769, "mia.malkof", "Biology", "Sophomore", 0, s5courses);
		ArrayList<Courses> s6courses = new ArrayList<Courses>();
		Student s6 = new Student("jordi", "kholid", "al-saoud", "12/12/2002", "jordi.alsaoud@its.edu", "Cola Street", "M",
				81654789, "B+", 202004947, "jordi.al-saoud", "Journalism", "Sophomore", 0, s6courses);
		User u1 = new User(s1.getStudentUsername(), s1.getLastName() + s1.getDateOfBirth().substring(6, 10), s1);
		User u2 = new User(s2.getStudentUsername(), s2.getLastName() + s2.getDateOfBirth().substring(6, 10), s2);
		User u3 = new User(s3.getStudentUsername(), s3.getLastName() + s3.getDateOfBirth().substring(6, 10), s3);
		User u4 = new User(s4.getStudentUsername(), s4.getLastName() + s4.getDateOfBirth().substring(6, 10), s4);
		User u5 = new User(s5.getStudentUsername(), s5.getLastName() + s5.getDateOfBirth().substring(6, 10), s5);
		User u6 = new User(s6.getStudentUsername(), s6.getLastName() + s6.getDateOfBirth().substring(6, 10), s6);
		registrar.addusers(u1);
		registrar.addusers(u2);
		registrar.addusers(u3);
		registrar.addusers(u4);
		registrar.addusers(u5);
		registrar.addusers(u6);
		registrar.coursecategories.add("biology");
		registrar.coursecategories.add("arts");
		registrar.coursecategories.add("computer science");
		registrar.coursecategories.add("physics");
		registrar.coursecategories.add("math");
		registrar.coursecategories.add("journalism");
		registrar.coursecategories.add("hospitality");
		registrar.coursecategories.add("business");
		registrar.coursecategories.add("english");
		ArrayList<Courses> dr1courses = new ArrayList<Courses>();
		Instructors eliegeorge = null, husseinahmad = null, travisonaissi = null, kylierhodes = null,
				migoshbayter = null, kimkartajian = null, kendrickismail = null;
		eliegeorge = new Instructors("Elie", "George", 201912345, "elie" + "." + "george", "george" + 201912345,
				dr1courses);
		ArrayList<Courses> dr2courses = new ArrayList<Courses>();
		husseinahmad = new Instructors("Hussein", "Ahmad", 201969156, "hussein" + "." + "ahmad", "ahmad" + 201969156,
				dr2courses);
		ArrayList<Courses> dr3courses = new ArrayList<Courses>();
		kylierhodes = new Instructors("Kylie", "Rhodes", 201937196, "kylier" + "." + "rhodes", "rhodes" + 201937196,
				dr3courses);
		ArrayList<Courses> dr4courses = new ArrayList<Courses>();
		travisonaissi = new Instructors("Travis", "Onaissi", 201800100, "travis" + "." + "onaissi",
				"onaissi" + 201800100, dr4courses);
		ArrayList<Courses> dr5courses = new ArrayList<Courses>();
		migoshbayter = new Instructors("Migos", "Hbayter", 201864643, "migos" + "." + "hbayter", "hbayter" + 201864643,
				dr5courses);
		ArrayList<Courses> dr6courses = new ArrayList<Courses>();
		kimkartajian = new Instructors("Kim", "Karatajian", 201845789, "kim" + "." + "kartajian",
				"kartajian" + 201845789, dr6courses);
		ArrayList<Courses> dr7courses = new ArrayList<Courses>();
		kendrickismail = new Instructors("Kendrick", "Ismail", 201898321, "kendrick" + "." + "ismail",
				"ismail" + 201898321, dr7courses);
		// COURSES----------------------------------------------------------------------------------------------------------
		Courses cp1 = new Courses(100, "introduction to programming", 1, migoshbayter, "MWF", "15:01", "16:00", 3,
				"computer science", 40, 0, "Irwin");
		registrar.addcourses(cp1);
		Courses cp11 = new Courses(101, "introduction to programming", 2, kimkartajian, "MWF", "12:01", "13:00", 3,
				"computer science", 40, 0, "Hall1");
		registrar.addcourses(cp11);
		Courses cp2 = new Courses(102, "data structure", 1, kimkartajian, "TR", "12:01", "14:00", 3, "computer science",
				30, 0, "Hall7");
		registrar.addcourses(cp2);
		Courses cp3 = new Courses(103, "data algorithms", 1, migoshbayter, "MWF", "15:01", "16:00", 3,
				"computer science", 25, 0, "Hall2");
		registrar.addcourses(cp3);
		Courses co = new Courses(104, "computer organization", 1, kendrickismail, "TR", "09:01", "11:00", 3,
				"computer science", 40, 0, "Irwin");
		registrar.addcourses(co);
		Courses ml = new Courses(105, "machine learning", 1, migoshbayter, "MWF", "10:01", "11:00", 3,
				"computer science", 40, 0, "Hall1");
		registrar.addcourses(ml);
		Courses pe = new Courses(106, "professional experience", 1, kimkartajian, "MWF", "17:01", "18:00", 1,
				"computer science", 15, 0, "Hall7");
		registrar.addcourses(pe);
		Courses pe1 = new Courses(107, "professional experience", 2, migoshbayter, "TR", "17:01", "19:00", 1,
				"computer science", 15, 0, "Hall7");
		registrar.addcourses(pe1);
		Courses bio = new Courses(200, "remedial biology", 1, husseinahmad, "MWF", "11:01", "12:00", 3, "biology", 30,
				0, "Hall18");
		registrar.addcourses(bio);
		Courses bio1 = new Courses(201, "introduction to biology", 1, kylierhodes, "MWF", "09:01", "10:00", 3,
				"biology", 40, 0, "Hall1");
		registrar.addcourses(bio1);
		Courses bio2 = new Courses(202, "introduction to biology", 2, husseinahmad, "TR", "09:01", "11:00", 3,
				"biology", 40, 0, "Hall1");
		registrar.addcourses(bio2);
		Courses bio3 = new Courses(203, "human biology", 1, kylierhodes, "MWF", "11:01", "12:00", 3, "biology", 30, 0,
				"Hall5");
		registrar.addcourses(bio3);
		Courses bio4 = new Courses(204, "biology lab", 1, husseinahmad, "TR", "17:01", "18:00", 1, "biology", 40, 0,
				"LAB1");
		registrar.addcourses(bio4);
		Courses art = new Courses(300, "introduction to art", 1, eliegeorge, "MWF", "08:01", "09:00", 3, "arts", 40, 0,
				"Hall1");
		registrar.addcourses(art);
		Courses art1 = new Courses(301, "introduction to art", 2, kendrickismail, "MWF", "12:01", "13:00", 3, "arts",
				40, 0, "Hall1");
		registrar.addcourses(art1);
		Courses art2 = new Courses(302, "performing arts", 1, kendrickismail, "TR", "14:01", "16:00", 3, "arts", 40, 0,
				"Hall4");
		registrar.addcourses(art2);
		Courses art3 = new Courses(303, "western music", 1, eliegeorge, "MWF", "10:01", "11:00", 3, "arts", 40, 0,
				"Hall6");
		registrar.addcourses(art3);
		Courses art4 = new Courses(304, "performing plays", 1, eliegeorge, "MWF", "17:01", "18:00", 1, "arts", 25, 0,
				"Hall2");
		registrar.addcourses(art4);
		Courses phy = new Courses(400, "introduction to physics", 1, travisonaissi, "MWF", "08:01", "09:00", 3,
				"Physics", 40, 0, "Hall1");
		registrar.addcourses(phy);
		Courses phy1 = new Courses(401, "modern physics", 1, travisonaissi, "TR", "11:01", "13:00", 3, "Physics", 40, 0,
				"Hall3");
		registrar.addcourses(phy1);
		Courses phy2 = new Courses(402, "solid state physics", 1, travisonaissi, "MWF", "14:01", "15:00", 3, "Physics",
				40, 0, "Hall2");
		registrar.addcourses(phy2);
		Courses mth = new Courses(500, "calculus 2", 1, travisonaissi, "MWF", "09:01", "10:00", 3, "math", 40, 0,
				"Hall7");
		registrar.addcourses(mth);
		Courses mth1 = new Courses(501, "calculus 3", 1, kimkartajian, "MWF", "12:01", "13:00", 3, "math", 40, 0,
				"Hall1");
		registrar.addcourses(mth1);
		Courses mth2 = new Courses(502, "calculus 3", 2, travisonaissi, "TR", "15:01", "17:00", 3, "math", 40, 0,
				"Hall9");
		registrar.addcourses(mth2);
		Courses mth3 = new Courses(503, "calculus 4", 1, kimkartajian, "MWF", "11:01", "12:00", 3, "math", 40, 0,
				"Hall1");
		registrar.addcourses(mth3);
		Courses jr = new Courses(600, "introduction to journalism", 1, migoshbayter, "MWF", "13:01", "14:00", 3,
				"journalism", 40, 0, "Hall6");
		registrar.addcourses(jr);
		Courses jr1 = new Courses(601, "news writing and reporting", 1, migoshbayter, "TR", "09:01", "11:00", 3,
				"journalism", 40, 0, "Hall1");
		registrar.addcourses(jr1);
		Courses jr2 = new Courses(602, "journalism workshop", 1, migoshbayter, "TR", "17:01", "18:00", 1, "journalism",
				25, 0, "Hall1");
		registrar.addcourses(jr2);
		Courses eng = new Courses(700, "remedial", 1, kimkartajian, "MWF", "10:01", "11:00", 3, "english", 40, 0,
				"Hall1");
		registrar.addcourses(eng);
		Courses eng1 = new Courses(701, "remedial", 2, kylierhodes, "TR", "15:01", "16:00", 3, "english", 40, 0,
				"Hall2");
		registrar.addcourses(eng1);
		Courses eng2 = new Courses(702, "advanced english", 1, kimkartajian, "MWF", "09:01", "10:00", 3, "english", 40,
				0, "Hall3");
		registrar.addcourses(eng2);
		Courses eng3 = new Courses(703, "advanced english", 2, kylierhodes, "TR", "13:01", "15:00", 3, "english", 40, 0,
				"Hall2");
		registrar.addcourses(eng3);
		Courses eng4 = new Courses(704, "english literature", 1, kimkartajian, "MWF", "11:01", "12:00", 3, "english",
				40, 0, "Hall1");
		registrar.addcourses(eng4);
		Courses eng5 = new Courses(705, "english literature", 2, kylierhodes, "TR", "10:01", "12:00", 3, "english", 40,
				0, "Hall2");
		registrar.addcourses(eng5);
		Courses hsp = new Courses(800, "introduction to hospitality ", 1, kendrickismail, "MWF", "12:01", "13:00", 3,
				"hospitality", 40, 0, "Hall1");
		registrar.addcourses(hsp);
		Courses hsp1 = new Courses(801, "wine spirits and cigars", 1, kendrickismail, "MWF", "17:01", "18:00", 1,
				"hospitality", 40, 0, "Hall9");
		registrar.addcourses(hsp1);
		Courses bui = new Courses(900, "accounting", 1, eliegeorge, "MWF", "09:01", "10:00", 3, "business", 40, 0,
				"Hall4");
		registrar.addcourses(bui);
		Courses bui1 = new Courses(901, "marketing", 1, eliegeorge, "TR", "13:01", "15:00", 3, "business", 40, 0,
				"Hall2");
		registrar.addcourses(bui1);
		Courses bui2 = new Courses(902, "finance", 1, eliegeorge, "MWF", "11:01", "12:00", 3, "business", 40, 0,
				"Hall9");
		registrar.addcourses(bui2);
		Courses bui3 = new Courses(903, "business law", 1, eliegeorge, "TR", "09:01", "11:00", 3, "business", 40, 0,
				"Hall4");
		registrar.addcourses(bui3);
		System.out.println(
				"--------------------------------------------------------------------------------------- Welcome To ITS -------------------------------------------------------------------------------------");
		System.out.println("\n \n \n \n \n \n \n");
		boolean v=true;
		boolean m=true;
		while(m) {
			System.out.println();
		System.out.println("Enter Your Username and Password\n");
		System.out.println("Username: ");
		String username = scan.nextLine();
		while(v) {
		if(username.isEmpty()) {
			System.out.println("You did not enter a Username");
			System.out.println("Enter a Username:");
			username = scan.nextLine();}
		else
			v=false;}
		v=true;
		System.out.println();
		System.out.println("Password: ");
		String password = scan.nextLine();
		while(v) {
			if(password.isEmpty()) {
				System.out.println("You did not enter a Password");
				System.out.println("Enter a Passwords:");
				password = scan.nextLine();}
			else
				v=false;}
		System.out.println();
		if (registrar.checkusercredential(username, password)) {
			m=false;
			boolean again = true;
			User us = registrar.checkuser(username);
			String name = us.getUsername().replace(".", " ");
			System.out.println();
			System.out.println("Welcome Back " + name);
			while (again) {
				System.out.println();
				System.out.println("1-Search Courses");
				System.out.println("2-Register Courses");
				System.out.println("3-Drop Courses");
				System.out.println("4-Print Courses");
				System.out.println("5-Print Schedule");
				System.out.println("6-Log out");
				System.out.println();
				System.out.println("Choose your Option(1-6): ");
				boolean p = true;
				int n = scan.nextInt();
				switch (n) {
				case 1:
					registrar.coursecategories();
					scan.nextLine();
					String cat = scan.nextLine();
					switch (cat.toUpperCase()) {
					case "BIOLOGY":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String cu = scan.nextLine();
						switch (cu.toUpperCase()) {
						case "REMEDIAL BIOLOGY":
							registrar.searchcourseclasses(cu.toLowerCase());
							break;
						case "INTRODUCTION TO BIOLOGY":
							registrar.searchcourseclasses(cu.toLowerCase());
							break;
						case "HUMAN BIOLOGY":
							registrar.searchcourseclasses(cu.toLowerCase());
							break;
						case "BIOLOGY LAB":
							registrar.searchcourseclasses(cu.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "COMPUTER SCIENCE":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						System.out.println();
						// scan.nextLine();
						String cs = scan.nextLine();
						switch (cs.toUpperCase()) {
						case "INTRODUCTION TO PROGRAMMING":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						case "DATA STRUCTURE":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						case "DATA ALGORITHMS":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						case "COMPUTER ORGANIZATION":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						case "MACHINE LEARNING":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						case "PROFESSIONAL EXPERIENCE":
							registrar.searchcourseclasses(cs.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "ARTS":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String ar = scan.nextLine();
						switch (ar.toUpperCase()) {
						case "INTRODUCTION TO ART":
							registrar.searchcourseclasses(ar.toLowerCase());
							break;
						case "PERFORMING ARTS":
							registrar.searchcourseclasses(ar.toLowerCase());
							break;
						case "WESTERN MUSIC":
							registrar.searchcourseclasses(ar.toLowerCase());
							break;
						case "PERFORMING PLAYS":
							registrar.searchcourseclasses(ar.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "PHYSICS":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String ph = scan.nextLine();
						switch (ph.toUpperCase()) {
						case "MODERN PHYSICS":
							registrar.searchcourseclasses(ph.toLowerCase());
							break;
						case "INTRODUCTION TO PHYSICS":
							registrar.searchcourseclasses(ph.toLowerCase());
							break;
						case "SOLID STATE PHYSICS":
							registrar.searchcourseclasses(ph.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "MATH":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						System.out.println();
						String cal = scan.nextLine();
						switch (cal.toUpperCase()) {
						case "CALCULUS 2":
							registrar.searchcourseclasses(cal.toLowerCase());
							break;
						case "CALCULUS 3":
							registrar.searchcourseclasses(cal.toLowerCase());
							break;
						case "CALCULUS 4":
							registrar.searchcourseclasses(cal.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "JORNALISM":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String jor = scan.nextLine();
						switch (jor.toUpperCase()) {
						case "NEWS WRITING AND REPORTING":
							registrar.searchcourseclasses(jor.toLowerCase());
							break;
						case "INTRODUCTION TO JORNALISM":
							registrar.searchcourseclasses(jor.toLowerCase());
							break;
						case "JORNALISM WORKSHOP":
							registrar.searchcourseclasses(jor.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "ENGLISH":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String en = scan.nextLine();
						switch (en.toUpperCase()) {
						case "REMIDIAL":
							registrar.searchcourseclasses(en.toLowerCase());
							break;
						case "ADVANCED ENGLISH":
							registrar.searchcourseclasses(en.toLowerCase());
							break;
						case "ENGLISH LITERATURE":
							registrar.searchcourseclasses(en.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;
						}
						break;
					case "HOSPITALITY":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String ho = scan.nextLine();
						switch (ho.toUpperCase()) {
						case "INTRODUCTION TO HOSPITALITY":
							registrar.searchcourseclasses(ho.toLowerCase());
							break;
						case "WINE SPIRITS AND CIGARS":
							registrar.searchcourseclasses(ho.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;

						}
						break;
					case "BUSINESS":
						System.out.println();
						registrar.SearchCoursecategories(cat.toLowerCase());
						// scan.nextLine();
						System.out.println();
						String bi = scan.nextLine();
						switch (bi.toUpperCase()) {
						case "ACCOUNTING":
							registrar.searchcourseclasses(bi.toLowerCase());
							break;
						case "FINANCE":
							registrar.searchcourseclasses(bi.toLowerCase());
							break;
						case "MARKETING":
							registrar.searchcourseclasses(bi.toLowerCase());
							break;
						case "BUSINESS LAW":
							registrar.searchcourseclasses(bi.toLowerCase());
							break;
						default:
							System.out.println("This Course does not exist.");
							System.out.println();
							break;

						}
					default:
						System.out.println("This Category does not exist.");
						System.out.println();
						break;

					}
					break;
				case 2:
					System.out.println("Enter the CRN of the course you wish to register:");
					int crn = scan.nextInt();
					boolean b = true;
					while (b) {
						if (us.getStudent().registercourses(crn)) {
							System.out.println();
							System.out.println("would you like to register more courses(Y/N): ");
							String s = scan.next();
							if (s.equalsIgnoreCase("y")) {
								System.out.println("Enter the CRN of the course you wish to register:");
								b = true;
								crn = scan.nextInt();
							} else {
								b = false;
								break;
							}

						} else {
							System.out.println("Would you like to try again?(Y/N)");
							String s = scan.next();
							if (s.equalsIgnoreCase("y")) {
								System.out.println();
								System.out.println("Enter the CRN of the course you wish to register:");
								b = true;
								crn = scan.nextInt();
							} else {
								b = false;
								break;
							}
						}

					}
					break;
				case 3:
					if (us.getStudent().Studentcourses.size() == 0) {
						System.out.println("You have no courses to drop.");
					} else {
						System.out.println("Enter the CRN of the course you wish to drop:");
						int crn2 = scan.nextInt();
						boolean d = true;
						while (d) {
							if (us.getStudent().dropcourse(crn2)) {
								System.out.println("The course was dropped successfully");
								System.out.println("would you like to Drop more courses(Y/N): ");
								String s = scan.next();
								if (s.equalsIgnoreCase("y")) {
									System.out.println("Enter the CRN of the course you wish to drop:");
									d = true;
									crn2 = scan.nextInt();
								} else {
									d = false;
									break;
								}
							} else {
								System.out.println("Would you like to try again?(Y/N)");
								String s = scan.next();
								if (s.equalsIgnoreCase("y")) {
									System.out.println();
									System.out.println("Enter the CRN of the course you wish to Drop:");
									d = true;
									crn2 = scan.nextInt();
								} else {
									d = false;
									break;
								}
							}

						}
					}
					break;
				case 4:
					if (us.getStudent().printcourses() == 0)
						System.out.println("You have 0 courses registered.");
					System.out.println();
					break;
				case 5:
					us.getStudent().printschedule();
					System.out.println();
					break;
				case 6:
					System.out.println("log out successfully");
					p = false;
					again = false;
					break;
				default:
					System.out.println("Invalid Input");
					System.out.println();
					break;
				}
				if (p) {
					System.out.println("Would like to choose another service(Y/N): ");
					String o = scan.next();
					if (o.equalsIgnoreCase("n")) {
						again = false;
						System.out.println("Log Out successfully");
					}
				}
			}

		}

	}

}}
