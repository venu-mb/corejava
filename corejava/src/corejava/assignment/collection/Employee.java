package corejava.assignment.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private String Department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Department = department;
	}

	static void allDetails(TreeSet<Employee> hs) {
		for (Employee employee : hs) {
			System.out.println(employee);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a or b");
		String s = sc.next();

		if (s.equals("a")) {
			TreeSet<Employee> hs = new TreeSet<Employee>(new aComparator());

			hs.add(new Employee(1, "kiki", 98762421, "M.E"));
			hs.add(new Employee(2, "chai", 98762421, "CIV"));
			hs.add(new Employee(3, "raks", 98762421, "M.E"));
			hs.add(new Employee(4, "venu", 98762421, "M.E"));
			
			allDetails(hs);

		} else if (s.equals("b")) {
			TreeSet<Employee> hs = new TreeSet<Employee>(new bComparator());

			hs.add(new Employee(1, "kiki", 98762421, "M.E"));
			hs.add(new Employee(2, "chai", 98762421, "CIV"));
			hs.add(new Employee(3, "raks", 98762421, "M.E"));
			hs.add(new Employee(4, "venu", 98762421, "M.E"));

			allDetails(hs);

		} else {
			System.out.println("Enter valid alphabate");
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Department=" + Department + "]";
	}

}

class aComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getId() == o2.getId()) {
			return 0;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class bComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
