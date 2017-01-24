package ori;
import java.util.*;

public class Inventory {
	private List inventory;
	
	public Inventory(){
		this.inventory = new LinkedList();
	}
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
		Instrument instrument = null;
		if(spec instanceof GuitarSpec){
			instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
		}
		else if(spec instanceof MandolinSpec){
			instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
		}
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
	//search function is same as before, only need to add one more search()for Mandolin
	public List search(MandolinSpec searchSpec){
		List matchingMandolin = new LinkedList();
		for(Iterator i = inventory.iterator(); i.hasNext();){
			Mandolin mandolin = (Mandolin)i.next();
			if(mandolin.getSpec().matches(searchSpec)){
				matchingMandolin.add(mandolin);
			}
		}
		return matchingMandolin;
	}
	
	public List search(GuitarSpec searchSpec){
		List matchingGuitar = new LinkedList();
		for(Iterator i = inventory.iterator(); i.hasNext();){
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitar.add(guitar);
			}
		}
		return matchingGuitar;
	}
	
}
