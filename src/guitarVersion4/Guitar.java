package guitarVersion4;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber, double price, GuitarSpec spec){
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;//At this time, even though we add one new property, we do any change on Guitar class
						//That is because of encapsulated
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}
	public double getPrice(){
		return price;
	}
	public GuitarSpec getSpec(){
		return spec;
	}
}
