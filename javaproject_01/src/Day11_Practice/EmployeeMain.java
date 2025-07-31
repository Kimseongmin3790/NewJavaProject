package Day11_Practice;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee kim = new Employee("김철수" , 1001);
		Employee park = new Employee("박영희" , 2002, "인사부");
		
		kim.setDetails(3000000, "대리");
		
		System.out.println(kim.getSalary());
		
		park.empInfo();
		
	}

}
