package advance_java.LAMBDA;

import java.util.function.Consumer;

public class Cosumer_interface {

	public static void main(String[] args) {
		
		Consumer <String> cobj=name->System.out.println(name);
		cobj.accept("prajwal");
	}

}
