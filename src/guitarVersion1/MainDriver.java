package guitarVersion1;

import java.util.*;

public class MainDriver {
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Map properties = new HashMap();
		properties.put("instrumentType",InstrumentType.GUITAR);
		properties.put("builder", Builder.ABUILDER);
		properties.put("backWood", Wood.AWOOD);
		
		InstrumentSpec clientSpec = new InstrumentSpec(properties);
		
		List matchingInstruments = inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty()){
			System.out.println("We get result!");
			for(Iterator i = matchingInstruments.iterator(); i.hasNext();){
				Instrument instrument = (Instrument)i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("We have a " + spec.getProperty(" InstrumentType ")
						+ " with the following properties:");
				for(Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();){
					String propertyName = (String)j.next();
					if(propertyName.equals("instrumentType")){
						continue;
					}
						System.out.println(" " + propertyName + ": "
								+ spec.getProperty(propertyName));
				}
				System.out.println("You can have this " 
						+ spec.getProperty("instrumentType") + " for $ "
						+ instrument.getPrice());
			}
		}
		else{
			System.out.println("Sorry we don't have any result");
		}
	}
	private static void initializeInventory(Inventory inventory){
		Map properties = new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.ABUILDER);
		properties.put("model", "CJ");
		properties.put("type", Type.ATYPE);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.AWOOD);
		properties.put("backWood", Wood.AWOOD);
		inventory.addInstrument("121",200.0, new InstrumentSpec(properties));
		
		properties.put("builder", Builder.BBUILDER);
		properties.put("model", "AB");
		properties.put("type", Type.BTYPE);
		properties.put("numStrings", 12);
		properties.put("topWood", Wood.BWOOD);
		properties.put("backWood", Wood.CWOOD);
		inventory.addInstrument("232",100.0, new InstrumentSpec(properties));
		inventory.addInstrument("333",12.0, new InstrumentSpec(properties));
		
		properties.put("instrumentType", InstrumentType.MANDOLIN);
		properties.put("builder", Builder.CBUILDER);
		properties.put("model", "SB");
		properties.put("type", Type.CTYPE);
		properties.put("numStrings", 6);
		properties.put("topWood", Wood.CWOOD);
		properties.put("backWood", Wood.DWOOD);
		inventory.addInstrument("222",99.0, new InstrumentSpec(properties));
		
	}
}
