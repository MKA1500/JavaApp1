//import java.util.ArrayList;
//
//class Machine {
//	
//	@Override
//}

public class Main {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Oak oak1 = new Oak();
		
		Plant plant2 = oak1;
		plant2.grow();
	}

}
