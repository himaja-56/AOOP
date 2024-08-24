package srp;

public class SalaryCalculator {
	public double calculateSalary(Employee employee) {
		double baseSalary = 50000;
		if(employee.getRole().equals("Manager")) {
			return baseSalary * 2;
		}
		else if(employee.getRole().equals("Devveloper")) {
			return baseSalary * 1.5;
		}
		else {
			return baseSalary;
		}
	}

}
