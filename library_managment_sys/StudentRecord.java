package library_managment_sys;
import java .util.*;
public class StudentRecord {
	
//	static 
	static Scanner sc = new Scanner (System.in);
	 static String []Stud_name=new String[50];
	 public static String []Studarray=new String[50];
	
	public void Student() {
		while(true) {
		System.out.println("**************Student Record************");
		System.out.println("\t1.Add Student\n\t2.Display Student\n\t3.exit\n\tEnter your choise number");
			int chStud=sc.nextInt();
			switch(chStud) {
			case 1:Studarray=AddStudent();
					break;
			case 2:DisplayStudent(Studarray);			
					break;
			case 3:	Login.Admin();
			}

		}

	}
	public static String[] AddStudent() {
		System.out.println("enter how many student you want to add");
		int cout,n=sc.nextInt();

			Stud_name[0]=sc.nextLine();
			
				for( int i=0;i<n;i++) {
					cout=i+1;
					System.out.print( cout+".");		
					Stud_name[i]=sc.nextLine();
					}
						
			return Stud_name;
		
	}
	public static void DisplayStudent(String []Studarray) {
		System.out.println("*******Student Present Record*******");
		
		for(int i=0;i<Studarray.length;i++) {
			if(Studarray[i]!=null)
			System.out.println(i+1+"."+Studarray[i]);
			
		}
		
	}
}