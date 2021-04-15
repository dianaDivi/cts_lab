
public class WithLaptopDecorater extends AbstractBackpackDecorator {

	public WithLaptopDecorater(AbstractBackpack basicBackpack) {
		super(basicBackpack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + Laptop");
	}
	
}
