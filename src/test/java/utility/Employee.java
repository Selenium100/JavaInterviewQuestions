package utility;

 class Employee {

	private String name;
	private int emplid;
	private double salary;

	 Employee(String name, int emplid, double salary) {
		this.name = name;
		this.emplid = emplid;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmplid() {
		return emplid;
	}

	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emplid=" + emplid + ", salary=" + salary + "]";
	}
	
	

}
