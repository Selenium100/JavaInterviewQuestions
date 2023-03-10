package utility;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static boolean isSSE(Employee emp) {
		Predicate<Employee> p = i -> i.getSalary() > 1900000;
		return p.test(emp);
	}

	public static boolean lengthGreaterThanFive(Employee emp) {
		Predicate<Employee> p = i -> i.getName().length() > 5;
		return p.test(emp);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Karanerdfe", 11456372, 2000000);
		Employee e2 = new Employee("Abhay", 11456372, 1100000);
		Employee e3 = new Employee("Nityae", 11456372, 1200000);

		ArrayList<Employee> emplList = new ArrayList<Employee>();
		emplList.add(e1);
		emplList.add(e2);
		emplList.add(e3);

		for (Employee e : emplList) {
			System.out.println(e.getName() + " is SSE or not " + isSSE(e));

		}

		System.out.println("----------------------");

		for (Employee e : emplList) {

			System.out.println(e.getName() + " is greater than 5 or not " + lengthGreaterThanFive(e));
		}

	}

}
