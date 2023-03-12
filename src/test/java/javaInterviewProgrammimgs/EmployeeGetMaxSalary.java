package javaInterviewProgrammimgs;

public class EmployeeGetMaxSalary {
	
	String ename;
	String edept;
	Integer salary;
	
	
	public EmployeeGetMaxSalary(String ename,String edept,Integer salary) {
		this.ename=ename;
		this.edept=edept;
		this.salary=salary;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEdept() {
		return edept;
	}


	public void setEdept(String edept) {
		this.edept = edept;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeGetMaxSalary [ename=" + ename + ", edept=" + edept + ", salary=" + salary + "]";
	}
	
	

}
