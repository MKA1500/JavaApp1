import java.util.ArrayList;

class Machine {
	
	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine is starting.");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	public void snap() {
		System.out.println("camera: snap!");
	}
}

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		showList2(list1);
		
		public static void showList(ArrayList<? extends Machine> list) {
			for (Machine value : list) {
				System.out.println(value);
				value.start();
//				value.snap();
			}
		}
		
		public static void showList2(ArrayList<? super Camera> list) {
			for (Machine value : list) {
				System.out.println(value);
				value.start();
			}
		}
		
		Plant plant1 = new Plant();
		Oak oak1 = new Oak();
		
		Plant plant2 = oak1;
		plant2.grow();
	}

}
