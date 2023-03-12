package javaInterviewProgrammimgs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetMaxMinAvaerageSumOfSalary {

	public static void main(String[] args) {
		Employee e1 = new Employee("Nitya", 1, 500000);
		Employee e2 = new Employee("Abhay", 2, 600000);
		Employee e3 = new Employee(null, 3, 700000);
		Employee e4 = new Employee("Viswa", 4, 800000);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		List<Integer> salaries = empList.stream().map(e -> e.getSalary()).collect(Collectors.toList());
		int max = salaries.stream().mapToInt(e -> e).summaryStatistics().getMax();
		System.out.println(max);

		int min = salaries.stream().mapToInt(e -> e).summaryStatistics().getMin();
		System.out.println(min);

		double average = salaries.stream().mapToInt(e -> e).summaryStatistics().getAverage();
		System.out.println(average);

		long sum = salaries.stream().mapToInt(e -> e).summaryStatistics().getSum();
		System.out.println(sum);

	}

}
