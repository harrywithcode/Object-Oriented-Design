package guitarVersion1;

public enum Builder {
	ABUILDER, BBUILDER, CBUILDER, DBUILDER;
	
	public String toString(){
		switch(this){
		case ABUILDER:
			return "abuilder";
		case BBUILDER:
			return "bbuilder";
		case CBUILDER:
			return "cbuilder";
		case DBUILDER:
			return "dbuilder";
		}
		return null;
	}
}
