package advance_java.LAMBDA;

interface Cab1{
	public String BookCab(String Source, String Destination);
}

public class Lambda_fun2 {

	public static void main(String[] args) {
		
		Cab1 obj=(Source, Destination)->
			{
				System.out.println("Your cab is book from"+ Source +"to "+Destination);
				return ("Price is 2000");
			};
		System.out.println(obj.BookCab("Kolhapur", "Mumbai"));

	}

}
