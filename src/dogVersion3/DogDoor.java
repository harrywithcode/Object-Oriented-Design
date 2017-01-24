package dogVersion3;

import java.util.*;

public class DogDoor {
	private boolean open;
	
	public DogDoor(){
		this.open = false;
	}
	public void open(){
		System.out.println("Dog door is open now");
		open = true;
		//让自动关门成为door的一个特点，而不是遥控器的特点，这样，只要涉及到door，都可以自动关门，不会有重复代码
		//和database里面的1NF，2NF，3NF很像
		final Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				close();
				timer.cancel();
			}
		},5000);
	}
	
	public void close(){
		System.out.println("Dog door is close now");
		open = false;
	}
	public boolean isOpen(){
		return open;
	}
}
