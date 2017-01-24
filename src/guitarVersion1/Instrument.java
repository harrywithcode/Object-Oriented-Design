package guitarVersion1;

public class Instrument {//if you still use abstract class, you can't build object later
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec spec){
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public InstrumentSpec getSpec(){
		return spec;
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}
	public double getPrice(){
		return price;
	}
	public double setPrice(float newPrice){
		price = newPrice;
		return price;
	}
}
