package dogVersion4;

public class Bark {
	private String sound;
	
	public Bark(String sound){
		this.sound = sound;
	}
	
	public String getSound(){
		return sound;
	}
	
	public boolean equals(Object bark){//��ʵ����bark��sound���Ƚϣ��м�������һ��otherBark�����н�
		if(bark instanceof Bark){
			Bark otherBark = (Bark)bark;
			if(this.sound.equalsIgnoreCase(otherBark.sound)){
				return true;
			}
		}
		return false;
	}
}
