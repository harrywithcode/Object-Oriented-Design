package dogOri;

public class MainDriver {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("The dog starts barking");
		remote.pressButton();
		System.out.println("The dog goes outside");
		remote.pressButton();
		System.out.println("Never come back");
		remote.pressButton();
		System.out.println("Alright, come in please and stop barking");
		//The problem comes, because the dog brings its friend, a cat, come in
	}
}
