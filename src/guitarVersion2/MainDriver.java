package guitarVersion2;
import java.util.*;

public class MainDriver {
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatEricLikes = new Guitar ("a", 0, Builder.APERSON, "star", Type.HAND,
				Wood.AWOOD, Wood.BWOOD);
		List matchingGuitars = inventory.search(whatEricLikes);
		if(!matchingGuitars.isEmpty()){
			System.out.println("we find result(s)");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();){
				Guitar guitar = (Guitar) i.next();
				System.out.println("Result:"+" "+guitar.getBuilder()+" "+guitar.getModel()+" "+
						guitar.getType()+" "+guitar.getBackWood()+" "+guitar.getTopWood()+" the price is "+
									guitar.getPrice()+" and the serialNumber is "+ guitar.getSerialNumber());
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
