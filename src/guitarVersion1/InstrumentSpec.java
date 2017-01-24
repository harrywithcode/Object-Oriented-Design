package guitarVersion1;
import java.util.*;

public class InstrumentSpec {
	private Map properties;
	
	public InstrumentSpec(Map properties){
		if(properties == null){
			this.properties = new HashMap();
		}
		else{
			this.properties =  new HashMap(properties);
		}
	}
	
	public Object getProperty(String propertyName){	//what is the meaning of Object
		return properties.get(propertyName); //key is propertyName, value is propertyValue
	}
	public Map getProperties(){
		return properties;
	}
	public boolean matches(InstrumentSpec otherSpec){
		for(Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();){
			String propertyName = (String)i.next();
			if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))){
				return false;
			}
		}
		return true;
	}
}
