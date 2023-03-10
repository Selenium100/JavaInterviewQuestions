package utility;

public class Student {
	String sname;
	int rollno;
	int marks;
	
	public Student(String sname,int rollno,int marks) {
		this.sname=sname;
		this.rollno=rollno;
		this.marks=marks;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	

}
