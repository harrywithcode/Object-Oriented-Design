package dogVersion3;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	public void recognize(String bark){
		System.out.println("Bark recognizer hear a "+ bark+".");
		door.open();
	}
}
