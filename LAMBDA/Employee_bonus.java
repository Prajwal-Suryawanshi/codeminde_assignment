package advance_java.LAMBDA;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	
	String ename;
	int esalary;
	String gender;

	Employee(String ename,int esalary,String gender){
		this.ename=ename;
		this.esalary=esalary;
		this.gender=gender;
	}
}
public class Employee_bonus {

	public static void main(String[] args) {
		
		ArrayList<Employee> emplist= new ArrayList<Employee>();
		Employee obj;
		
		emplist.add(new Employee("prajwal",100000,"male"));
		emplist.add(new Employee("shivam",40000,"male"));
		emplist.add(new Employee("Yash",50000,"male"));
		emplist.add(new Employee("Rahul",90000,"male"));
		emplist.add(new Employee("ajay",30000,"male"));
		
		
		Function<Employee,Integer> fobj=emp->(emp.esalary*10)/100;
	
		
		Predicate<Integer> pobj=b->b>=5000;
		
		Consumer <Employee> cobj=emp->{
					System.out.println(emp.ename);
					System.out.println(emp.esalary);
					System.out.println(emp.gender);
				};
		
		for(Employee e:emplist) {
			int bonus=fobj.apply(e);
			
				if(pobj.test(bonus)) {
					cobj.accept(e);
					System.out.println(bonus);
				}
		}
				
	}

}
