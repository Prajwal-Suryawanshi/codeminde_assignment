package Collection_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int roll;
	String name;
	String add;
	
	
	public Student(int roll, String name, String add) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAdd(String add) {
		this.add = add;
	}
	public String getAdd() {
		return add;
	}
	@Override
	public int compareTo(Student o) {
			return this .roll-o.roll;
				
	}

	
	
	
	
	
}

public class Student_data_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud=new ArrayList();
		
		Student obj1=new Student(12,"Prajwal","Kolhapur");

		
		Student obj2=new Student(3,"om","Sangli");
		
		Student obj3=new Student(1,"Mahesh","Satara");
	
		stud.add(obj1);
		stud.add(obj2);
		stud.add(obj3);
		
		Collections.sort(stud);
		
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i).getRoll()+" "+stud.get(i).getName()+" "+stud.get(i).getAdd());
					}
	}

}
