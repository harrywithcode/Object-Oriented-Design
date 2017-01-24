package dogVersion4;

public class Bark {
	private String sound;
	
	public Bark(String sound){
		this.sound = sound;
	}
	
	public String getSound(){
		return sound;
	}
	
	public boolean equals(Object bark){//其实是用bark和sound做比较，中间引入了一个otherBark来当中介
		if(bark instanceof Bark){
			Bark otherBark = (Bark)bark;
			if(this.sound.equalsIgnoreCase(otherBark.sound)){
				return true;
			}
		}
		return false;
	}
}
