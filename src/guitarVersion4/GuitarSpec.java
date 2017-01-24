package guitarVersion4;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood){
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public boolean match(GuitarSpec searchSpec){
		if(builder != searchSpec.getBuilder()){
			return false;
		}
		if((model != null) && (!model.equals("")) && (!model.equals(searchSpec.getModel()))){
			return false;
		}
		if(type != searchSpec.getType()){
			return false;
		}
		if(numStrings != searchSpec.getNumStrings()){
			return false;
		}
		if(backWood != searchSpec.getBackWood()){
			return false;
		}
		if(topWood != searchSpec.getTopWood()){
			return false;
		}
		return true;
	}
	
	public Builder getBuilder(){
		return builder;
	}
	public String getModel(){
		return model;
	}
	public Type getType(){
		return type;
	}
	public int getNumStrings(){
		return numStrings;
	}
	public Wood getBackWood(){
		return backWood;
	}
	public Wood getTopWood(){
		return topWood;
	}
}
