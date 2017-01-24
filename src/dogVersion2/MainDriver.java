package dogVersion2;
//import java.util.*;

public class MainDriver {
	public static void main(String[] args){
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Event trigger: the dog barks");
		remote.pressButton();
		
		System.out.println("dog goes outside");
		
		try{
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("But he is stuck outside");//±»¿¨×¡ÁË
		System.out.println("So he starts barkinng");
		System.out.println("So the host grab the remote control");
		
		remote.pressButton();
	}
}
