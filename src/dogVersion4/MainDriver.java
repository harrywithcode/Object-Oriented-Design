package dogVersion4;

public class MainDriver {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		Bark bark = new Bark("ha");
		door.addAllowedBark(bark);
		door.addAllowedBark(new Bark("wang"));
		door.addAllowedBark(new Bark("ao"));
		door.addAllowedBark(new Bark("woo"));
		door.addAllowedBark(new Bark("sa"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		System.out.println("Dog starts barking");
		recognizer.recognize(new Bark("wang"));
		System.out.println("The dog goes outside");
		
		try{
			Thread.currentThread().sleep(10000);
		}catch (InterruptedException e){}
		System.out.println("The dog is stuck outside, at this time, the dog barks again within a new sound");
		
		Bark smallDogBark = new Bark("yip");
		System.out.println("A small dog barks");
		recognizer.recognize(smallDogBark);
		
		try{
			Thread.currentThread().sleep(5000);
		}catch (InterruptedException e){}
		
		System.out.println("The door hear the sound again");
		recognizer.recognize(new Bark("sa"));
		System.out.println("the dog comes in");
	}
}
