package ori;

public enum Style {
	ASTYLE, BSTYLE, CSTYLE, DSTYLE;
	
	public String toString(){
		switch (this){
		case ASTYLE:
			return "astyle";
		case BSTYLE:
			return "bstyle";
		case CSTYLE:
			return "cstyle";
		case DSTYLE:
			return "dstyle";
		}
		return null;
	}
}
