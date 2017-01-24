package dogVersion4;
import java.util.*;

public class Remote {
	private DogDoor door;
	
	public Remote(DogDoor door){
		this.door = door;
	}
	
	public void pressButton(){
		System.out.println("Press the remote control button");
		if(door.isOpen()){
			door.close();
		}
		else{
			door.open();
			/*
			final Timer timer = new Timer();//Create a new timer so we can schedule the closing
			timer.schedule(new TimerTask(){
				public void run(){
					door.close();//All the task does is close the door and turn off the timer
					timer.cancel();
				}
			}, 5000);//5000 means 5 seconds
			*/
		}
	}
}
//page 82
//Why did you make the timer variable final?
//Because we need to call its cancel() method in the TimerTask anonymous class.
//If you need to access variables in your anonymous class from the enclosing class(That's Remote in this case),
//those variables must be final. And really, just because it makes things work.