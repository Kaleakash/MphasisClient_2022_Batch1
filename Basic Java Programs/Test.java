class Employee {
	private String name;
	private float salary;
	void setValue(String name, float salary) {
		//name = name;		localvarible = localvariable 	
		//salary = salary;
		this.name = name;
		//this.salary = salary;
		if(salary<=0) {
			this.salary = 8000;
		}else {
			this.salary  = salary;
		}
	}
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
}
class Test {
	public static void main(String args[]) {
	//display();	
	//salary = 12000;
	Employee emp = new Employee();
	//emp.name = "Raj Deep";
	//emp.salary = -12000;
	emp.setValue("Raj Deep",12000);
	emp.display();
	}
}