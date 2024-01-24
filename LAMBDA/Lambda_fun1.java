package advance_java.LAMBDA;

interface Cab{
	public void bookCab(String Source, String Destination);
}

public class Lambda_fun1 {

	public static void main(String[] args) {
	Cab obj=(Source, Destination)->System.out.println("Your cab is book from"+ Source +"to "+Destination);
	obj.bookCab("Mumbai", "Kolhapur");
		
	}

}
