package guitarVersion1;
import java.util.*;

public class Inventory {
	private List inventory;
	
	public Inventory(){
		this.inventory = new LinkedList();
	}
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
		Instrument instrument = new Instrument(serialNumber, price, spec);
		//The reason that first time you can't make a new object is because you don't
		//change the Instrument class "abstract" property
		inventory.add(instrument);
	}
	public Instrument getInstrument(String serialNumber){
		for(Iterator i = inventory.iterator(); i.hasNext();){
			Instrument instrument = (Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)){
				return instrument;
			}
		}
		return null;
	}
	public List search(InstrumentSpec clientSpec){
		List matchingInstrument = new LinkedList();
		for(Iterator i = inventory.iterator(); i.hasNext();){
			Instrument instrument = (Instrument)i.next();
			if(instrument.getSpec().equals(clientSpec)){
				matchingInstrument.add(instrument);
			}
		}
		return matchingInstrument;
	}
}
