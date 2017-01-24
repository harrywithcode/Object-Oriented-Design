package ori;

public class GuitarSpec extends InstrumentSpec {
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, 
			int numStrings, Wood backWood, Wood topWood){
		super(builder, model, type, backWood, topWood);//��дsuper�������Լ��ı���
		this.numStrings = numStrings;
	}
	public int getNumberStrings(){
		return numStrings;
	}
	//Override superclass matches()������Ҫ�ر�˵��overwrite��ֱ��д
	public boolean matches(GuitarSpec otherSpec){
		if(!super.matches(otherSpec)){	//ֱ�ӵ���super��������new�¶���
			return false;
		}
		if(!(otherSpec instanceof GuitarSpec)){	//instanceof��̫����
			return false;
		}
		GuitarSpec spec = (GuitarSpec) otherSpec;//change data type
		if(numStrings != spec.numStrings){
			return false;
		}
		return true;
	}
}
