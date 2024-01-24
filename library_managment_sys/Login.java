package library_managment_sys;
import java .util.*;
public class Login extends Signup{
	static Scanner sc = new Scanner (System.in);

	public  String username;
	public int password;
		Login() {
		System.out.println("enter your user name");
		username=sc.nextLine();
		System.out.println("enter your password");
		password=sc.nextInt();
		
	}
		public void check() {
			boolean bool=super.username.equals(username);
			if (true ==bool && super.password ==password) {
				System.out.println("you havae login sucessfully");
				Admin();
			}
			else {
				System.out.println("wrong password");
			}
		}
		public static void Admin() {
			int ch;
			System.out.println("***************Administrator Page****************");
			while(true) {
				System.out.println("\t1.Student Record\n\t2.Book Record\n\t3.Manage Book\n\t4.exit\n\tEnter your choise number");
				ch=sc.nextInt();
				switch(ch) {
					case 1:StudentRecord objs=new StudentRecord();
							objs.Student();
							break;
					
					case 2:BookRecode objb =new BookRecode();
							objb.Book();
							break;
						
					case 3:ManageBook objm= new ManageBook();
							objm.manabook();
							break;
					case 4:	Main_method.function();
							break;
				}
			}
			
			
		}
}
