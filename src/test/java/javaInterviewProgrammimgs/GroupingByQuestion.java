package javaInterviewProgrammimgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByQuestion {

	public static void main(String[] args) {
		Employee e1 = new Employee("Nitya", 1, 500000);
		Employee e2 = new Employee("Nitya", 2, 600000);
		Employee e3 = new Employee("Rajesh", 3, 700000);
		Employee e4 = new Employee("Viswa", 4, 800000);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
	Map<String, Set<Employee>> nameEmpMap=	empList.stream().collect(Collectors.groupingBy(e -> e.getEname(), Collectors.toSet()));
	System.out.println(nameEmpMap);

	}

}
