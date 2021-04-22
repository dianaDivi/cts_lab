
public class Mains {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.order();
		
		
		CatalogComponent laptop = new Product("Asus", 2000);
		CatalogComponent smartPhone = new Product("Samsung s20", 3500);
		
		CatalogComponent techProductsCatalog = new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);
		
		CatalogComponent officeProductCatalog = new ProductCatalog("Office products");
		CatalogComponent paperclip = new Product("Paperclip", 5);
		CatalogComponent pen = new Product("Blue pen", 2);
		officeProductCatalog.add(pen);
		officeProductCatalog.add(paperclip);

		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product", 0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		
		System.out.println(genericProducts);
		
		
		System.out.println("--------------------------------------------------------");

		AbstractBackpack myBackpack = new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorater(
				new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();

	}

}
