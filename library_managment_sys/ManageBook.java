package library_managment_sys;
import java.util.*;

public class ManageBook {
	
 
		static Scanner sc = new Scanner (System.in);
		 static String []Bookmanage_name=new String[50];
		 static short[] Bookmanage_roll=new short[50];
		 public static String []Bookmanagearray=new String[50];
		
		public void manabook() {
			while(true) {
			System.out.println("**************Student Record************");
			System.out.println("\t1.Issue Book\n\t2.Return Book\n\t3.exit\n\tEnter your choise number");
				int chStud=sc.nextInt();
				switch(chStud) {
				case 1:Bookmanagearray=IssueBook();
						break;
				case 2:ReturnBook(Bookmanagearray);			
						break;
				case 3:	Login.Admin();
				}

			}

		}
		public static String[] IssueBook() {
			System.out.println("enter how many book you have to issue");
			int cout,n=sc.nextInt();

			Bookmanage_name[0]=sc.nextLine();
		
					for( int i=0;i<n;i++) {
						cout=i+1;
						System.out.println("enter student roll number ");
						Bookmanage_roll[i]=(short) sc.nextInt();
						System.out.println("enter name of issue book ");
						System.out.print( cout+".");
						Bookmanage_name[i]=sc.nextLine();
						System.out.println("");
						}
							
				return Bookmanage_name;
			
		}
		public static void ReturnBook(String []Bookmanagearray) {
			System.out.println("*******Return Book Record*******");
			
			for(int i=0;i<Bookmanagearray.length;i++) {
				if(Bookmanagearray[i]!=null)
				System.out.println(i+1+"."+Bookmanagearray[i]);
				
			}
			
		}
	

}
