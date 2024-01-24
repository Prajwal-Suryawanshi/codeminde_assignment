package library_managment_sys;
import java.util.*;
public class Main_method {

	public static void main(String[] args) {
		function();
		
	Thread t=new Thread();
			

	}
	public static void function() {
		Scanner sc= new Scanner(System.in);
		System.out.println("**********************Library Managment System*****************");
		while(true){
			
			System.out.println("1.login\n2.signup\n3.exit\nenter your choise ");
			int ch=sc.nextInt();
				switch(ch) {
					case 1:Login lo=new Login();
						lo.check();
						break;
					case 2:Signup si=new Signup();
						break;
					case 3:System.exit(0);
					default : System.out.println("you have enter wrong number...");		
						
					}
		}

	}
}	
