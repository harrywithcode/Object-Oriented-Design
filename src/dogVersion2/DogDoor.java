package dogVersion2;

public class DogDoor {
	private boolean open;
	
	public DogDoor(){
		this.open = false;
	}
	
	public void open(){
		System.out.println("The dog door is opened now");
		open = true;
	}
	public void close(){
		System.out.println("The dog door is closed now");
		open = false;
	}
	public boolean isOpen(){
		return open;
	}
}
