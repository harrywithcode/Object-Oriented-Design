package guitarVersion4;

public enum Wood {
	AWOOD, BWOOD, CWOOD, DWOOD, EWOOD;
	
	public String toString(){
		switch(this){
		case AWOOD:
			return "awood";
		
		case BWOOD:
			return "bwood";
			
		case CWOOD:
			return "cwood";
			
		case DWOOD:
			return "dwood";
		case EWOOD:
			return "ewood";
		}
		return null;
	}
}
