package guitarOri;

public class MainDriver {
	public static void main(String[] args){
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLikes = new Guitar("a",0,"fender","star","electronic","alder","alder");
		
		Guitar guitar = inventory.search(whatErinLikes);
		//System.out.println(guitar.getBackWood());
		
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
		inventory.addGuitar("a",0,"fender","star","electronic","alder","alder");
		System.out.println(inventory.getGuitar("a").getType());
	}
}
