
public class Courses {
	public int CRN;
	public String coursename;
	public int classnumber;
	public Instructors dr;
	public String days;
	public String starttime;
	public int cap;
	public int reg;
	public String endtime;
	public int credits;
	public String type;
	public String location;

	public Courses(int cRN, String coursename, int classnumber, Instructors dr, String days, String starttime,
			String endtime, int credits, String type, int cap, int reg, String location) {
		super();
		CRN = cRN;
		this.coursename = coursename;
		this.classnumber = classnumber;
		this.dr = dr;
		this.days = days;
		this.starttime = starttime;
		this.endtime = endtime;
		this.credits = credits;
		this.type = type;
		this.cap = cap;
		this.reg = reg;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getReg() {
		return reg;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCRN() {
		return CRN;
	}

	public void setCRN(int cRN) {
		CRN = cRN;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getClassnumber() {
		return classnumber;
	}

	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
	}

	public Instructors getDr() {
		return dr;
	}

	public void setDr(Instructors dr) {
		this.dr = dr;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return CRN + " " + classnumber + " " + type + " " + credits + " " + coursename + " " + days + " " + starttime
				+ "-" + endtime + " " + cap + " " + (cap - reg) + " " + dr.getFirstname() + " " + dr.getLastname() + " "
				+ location;
	}

}
