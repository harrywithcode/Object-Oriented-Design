package guitarVersion3;

public enum Type {
	HAND, ELECTRONIC;
	
	public String toString(){
		switch(this){
		case HAND:
			return "hand";
		case ELECTRONIC:
			return "electronic";
		}
		return null;
	}
}
