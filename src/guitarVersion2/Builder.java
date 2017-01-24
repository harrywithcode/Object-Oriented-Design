package guitarVersion2;

public enum Builder {
	APERSON, BPERSON, CPERSON;
	
	public String toString(){
		switch(this){
		case APERSON:
			return "aperson";
		case BPERSON:
			return "bperson";
		case CPERSON:
			return "cperson";
		}
		return null;
	}
}
