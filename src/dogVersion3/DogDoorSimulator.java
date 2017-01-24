package dogVersion3;

public class DogDoorSimulator {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("The dog starts barking");
		recognizer.recognize("Woof");
		
		System.out.println("The dog comes in");
		System.out.println("finished");
		
		try{	//other case, alternate paths, P142
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("But the dog is stuck outside");
		System.out.println("The dog bark again");
		recognizer.recognize("wang wang");
		System.out.println("The dog back inside");
	}
}
