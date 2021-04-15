
public class AbstractBackpackDecorator extends AbstractBackpack{
	
	protected AbstractBackpack basicBackpack;

	public AbstractBackpackDecorator(AbstractBackpack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		
	}
	
	

}
