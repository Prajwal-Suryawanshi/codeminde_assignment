package library_managment_sys;

import java.util.Scanner;

public class BookRecode {
		static Scanner sc = new Scanner (System.in);
		 static String []Book_name=new String[50];
		 public static String []Bookarray=new String[50];
		
		public void Book() {
			while(true) {
			System.out.println("**************Book Record************");
			System.out.println("\t1.Add Book\n\t2.Display Book\n\t3.exit\n\tEnter your choise number");
				int chStud=sc.nextInt();
				switch(chStud) {
				case 1:Bookarray=AddBook();
						break;
				case 2:DisplayBook(Bookarray);			
						break;
				case 3:	Login.Admin();
				}

			}

		}
		public static String[] AddBook() {
			System.out.println("enter how many book you want to add");
			int cout,n=sc.nextInt();

			Book_name[0]=sc.nextLine();
				
					for( int i=0;i<n;i++) {
						cout=i+1;
						System.out.print( cout+".");		
						Book_name[i]=sc.nextLine();
						}
							
				return Book_name;
			
		}
		public static void DisplayBook(String []Bookarray) {
			System.out.println("*******Book Present Record*******");
			
			for(int i=0;i<Bookarray.length;i++) {
				int cout=i+1;
				if(Bookarray[i]!=null)			
					System.out.println("\t"+cout+"."+Bookarray[i]);
				
			}
			
		}
	
}
