package javaInterviewProgrammimgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class GetMaxSalaryFromEachDept {
	
	public static void main(String[] args) {
		
		EmployeeGetMaxSalary e1 = new EmployeeGetMaxSalary("Nitya", "QA", 1900000);
		EmployeeGetMaxSalary e2 = new EmployeeGetMaxSalary("Abhay", "QA", 3500000);
		EmployeeGetMaxSalary e3 = new EmployeeGetMaxSalary("Viswa", "SAP", 800000);
		EmployeeGetMaxSalary e4 = new EmployeeGetMaxSalary("Rakesh", "DEV", 1800000);
		EmployeeGetMaxSalary e5 = new EmployeeGetMaxSalary("Chandan", "DEV", 1700000);
		EmployeeGetMaxSalary e6 = new EmployeeGetMaxSalary("Anil", "DEVOPS", 2300000);
		
		ArrayList<EmployeeGetMaxSalary> empList = new ArrayList<EmployeeGetMaxSalary>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		
	Map<String, Optional<EmployeeGetMaxSalary>> maxSalaryEachDept =	empList.stream().collect(Collectors.groupingBy(EmployeeGetMaxSalary::getEdept, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(EmployeeGetMaxSalary::getSalary)))));
		
	System.out.println(maxSalaryEachDept);
		
	}

}
