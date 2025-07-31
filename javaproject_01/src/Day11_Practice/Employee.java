package Day11_Practice;

public class Employee {
	int empId;
	String empName;
	String department;
	int salary;
	String position;
	
	public Employee (String empName, int empId) {
		this(empName, empId, "");
	}
	
	public Employee (String empName, int empId, String department) {
		this.empName = empName;
		this.empId = empId;
		this.department = department;
	}
	
	public void setDetails(int salary, String position) {
		this.salary = salary;
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void empInfo() {
		System.out.println(empName + " 사원의 사번은 " + empId + ", 직급은 " + position + ", 급여는 " + salary + " 입니다.");
	}
	
}
