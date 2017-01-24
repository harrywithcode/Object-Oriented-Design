package dogVersion1;

public class MainDriver {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Dog barks inside the door");
		remote.pressButton();
		System.out.println("Dog goes outside, and the door close automatically");
		System.out.println("Dog barks outside the door");
		remote.pressButton();
		System.out.println("Door opens, dog come in");
		System.out.println("Door close automatically after 5 seconds");		
	}
}
