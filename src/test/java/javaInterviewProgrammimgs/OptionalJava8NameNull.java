package javaInterviewProgrammimgs;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalJava8NameNull {

	public static void main(String[] args) {

		Employee e1 = new Employee("Nitya", 1, 500000);
		Employee e2 = new Employee("Abhay", 2,600000);
		Employee e3 = new Employee(null,3, 700000);
		Employee e4 = new Employee("Viswa",4, 800000);
		
		

		/*
		 * Fetch Employee with id. And print its name in uppercase if name is null print
		 * "The name is null" with help of java 8 features.
		 */
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		int id = 3;
		Optional<Employee> emp = empList.stream().filter(e -> e.getEid() == id).findFirst();
		Optional<String> name = Optional.ofNullable(emp.get().getEname());
		
		if(name.isPresent()) {
			System.out.println(name.get().toUpperCase());
		}else {
			System.out.println("Name is null");
		}

	}

}
