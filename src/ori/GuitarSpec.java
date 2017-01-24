package ori;

public class GuitarSpec extends InstrumentSpec {
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, 
			int numStrings, Wood backWood, Wood topWood){
		super(builder, model, type, backWood, topWood);//先写super，后定义自己的变量
		this.numStrings = numStrings;
	}
	public int getNumberStrings(){
		return numStrings;
	}
	//Override superclass matches()，不需要特别说明overwrite，直接写
	public boolean matches(GuitarSpec otherSpec){
		if(!super.matches(otherSpec)){	//直接调用super，不用再new新对象
			return false;
		}
		if(!(otherSpec instanceof GuitarSpec)){	//instanceof不太会用
			return false;
		}
		GuitarSpec spec = (GuitarSpec) otherSpec;//change data type
		if(numStrings != spec.numStrings){
			return false;
		}
		return true;
	}
}
