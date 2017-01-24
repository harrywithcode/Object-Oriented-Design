package guitarVersion1;

public enum Wood {
	AWOOD, BWOOD, CWOOD, DWOOD;
	
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
		}
		return null;
	}
}
