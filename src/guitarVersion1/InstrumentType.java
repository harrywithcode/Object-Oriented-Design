package guitarVersion1;

public enum InstrumentType {
	GUITAR, MANDOLIN, BASS, BANJO;
	
	public String toString(){
		switch(this){
		case GUITAR:
			return "Guitar";
		case MANDOLIN:
			return "Mandolin";
		case BASS:
			return "Bass";
		case BANJO:
			return "Banjo";
			//default: return "Unspecified";
		}
		return null; //or we can cancel this line and write in another command way
	}
}
