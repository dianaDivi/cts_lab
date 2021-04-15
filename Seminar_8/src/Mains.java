
public class Mains {

	public static void main(String[] args) {
//		OrderFacade facade = new OrderFacade();
//		facade.order();
//		
		
		
		System.out.println("--------------------------------------------------------");

		AbstractBackpack myBackpack = new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorater(
				new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();

	}

}
