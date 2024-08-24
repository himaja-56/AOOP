package srp;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Alice","Manager");
		Employee emp2 = new Employee("Bob","Developer");
		
		SalaryCalculator salarycalculator = new SalaryCalculator();
		System.out.println(emp1.getName() + "'s Salary: "+salarycalculator.calculateSalary(emp1));
		System.out.println(emp2.getName() + "'s Salary: "+salarycalculator.calculateSalary(emp2));
		
		
		// TODO Auto-generated method stub

	}

}
