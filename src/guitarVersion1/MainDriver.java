package guitarVersion1;

public class MainDriver {
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatEricLikes = new Guitar ("a", 0, Builder.APERSON, "star", Type.HAND,
				Wood.AWOOD, Wood.BWOOD);
		Guitar guitar = inventory.search(whatEricLikes);
		if(guitar != null){
			System.out.println("Result"+guitar.getBuilder()+" "+guitar.getModel()+" "+
		guitar.getType()+" "+guitar.getBackWood()+" "+guitar.getTopWood()+" the price is "+
					guitar.getPrice());
		}
		else{
			System.out.println("No result");
		}
	}
	private static void initializeInventory(Inventory inventory){
		//inventory.addGuitar("a", 0, Builder.APERSON, "star", Type.HAND,
			//	Wood.AWOOD, Wood.BWOOD);
		
		inventory.addGuitar("a", 0, Builder.APERSON, "star", Type.HAND,
				Wood.AWOOD, Wood.BWOOD);
	}
}
