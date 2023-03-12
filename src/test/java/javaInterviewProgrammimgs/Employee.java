package javaInterviewProgrammimgs;

public class Employee {
	String ename;
	Integer eid;
	Integer salary;
	
	public Employee(String ename,Integer eid,Integer salary) {
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}
	
	
	

}
