package guitarVersion1;

import java.util.*;

public class Inventory {
	private List guitars;
	
	public Inventory(){
		guitars = new LinkedList();
	}
	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,
			Wood backWood, Wood topWood){
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}
	public Guitar getGuitar(String serialNumber){
		for(Iterator i = guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	public Guitar search(Guitar searchGuitar){
		for(Iterator i = guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar)i.next();
			Builder builder = searchGuitar.getBuilder();
			if((builder != null)&&(!builder.equals("")&&(!builder.equals(guitar.getBuilder())))){
				continue;
			}
			String model = searchGuitar.getModel();
			if((model != null)&&(!model.equals("")&&(!model.equals(guitar.getModel())))){
				continue;
			}
			Type type = searchGuitar.getType();
			if((type != null)&&(!type.equals("")&&(!type.equals(guitar.getType())))){
				continue;
			}
			Wood backWood = searchGuitar.getBackWood();
			if((backWood != null)&&(!backWood.equals("")&&!backWood.equals(guitar.getBackWood()))){
				continue;
			}
			Wood topWood = searchGuitar.getTopWood();
			if((topWood != null)&&(!topWood.equals("")&&(!topWood.equals(guitar.getTopWood())))){
				continue;
			}
			return guitar;//The code in book doesn't contain this line.
		}
		return null;
	}
	
}
