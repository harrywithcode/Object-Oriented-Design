package ori;

public enum Type {
	ATYPE, BTYPE, CTYPE, DTYPE;
	
	public String toString(){
		switch(this){
		case ATYPE:
			return "atype";
		case BTYPE:
			return "btype";
		case CTYPE:
			return "ctype";
		case DTYPE:
			return "dtype";
		}
		return null;
	}
}
