package guitarVersion3;

import java.util.*;
public class MainDriver {
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatYouLike = new GuitarSpec(Builder.APERSON, "a", Type.HAND, Wood.AWOOD, Wood.BWOOD);
		List matchingGuitars = inventory.search(whatYouLike);
		
		if(!matchingGuitars.isEmpty()){
			System.out.println("We may find result(s)");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("The builder is "+ spec.getBuilder()+" and the model is "+ 
				spec.getModel() +" and the type is "+ spec.getType()+" and the backWood is "
				+ spec.getBackWood()+ " and finaly the topWood is "+ spec.getTopWood());
			}
		}
		else{
			System.out.println("No result");
		}
	}
	private static void initializeInventory(Inventory inventory){
		inventory.addGuitar("ab", 0.2, Builder.APERSON, "star", Type.HAND,
				Wood.AWOOD, Wood.BWOOD);
		
		inventory.addGuitar("a", 0, Builder.APERSON, "star", Type.HAND,
				Wood.AWOOD, Wood.BWOOD);
	}
}
