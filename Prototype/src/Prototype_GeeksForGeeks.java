import java.util.HashMap;
import java.util.Map;

abstract class Color implements Cloneable{

	protected String colorName;
	
	abstract void addColor();
	
	public Object clone() {
		Object clone=null;
		
		try {
			clone=super.clone();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}

class blueColor extends Color{
	
	public blueColor() {
		this.colorName="blue";
	}

	@Override
	void addColor() {
		System.out.println("Blue color added");
	}

}

class redColor extends Color{
	public redColor() {
		this.colorName="red";
	}

	@Override
	void addColor() {
		System.out.println("Red color add");
		
	}
	
}


class blackColor extends Color{

	public blackColor() {
		this.colorName="black";
	}
	
	@Override
	void addColor() {
		System.out.println("Black color add");
		
	}
	
}

class ColorStore{
	private static Map<String, Color> colorMap=new HashMap<String, Color>();
	
	static {
		colorMap.put("blue", new blueColor());
		colorMap.put("red", new blackColor());
		colorMap.put("black", new blackColor());
	}
	
	public static Color getColor(String colorName) {
		return (Color)colorMap.get(colorName).clone();
	}
}



public class Prototype_GeeksForGeeks {
	public static void main (String[] args) {
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
	}

}
