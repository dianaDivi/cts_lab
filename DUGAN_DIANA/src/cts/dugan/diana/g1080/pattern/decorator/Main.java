package cts.dugan.diana.g1080.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Modificabil clip1=new Clip("Shrek", 1231, 12);
		Modificabil clip2=new Clip("Shrek2", 1200, 23);
		Modificabil clip3=new Clip("Shrek3", 2000, 43);
		Modificabil clip4=new Clip("Shrek4", 1600, 100);
		
		
		
		
		DecoratorReclama decoratorClip1=new DecoratorReclama(clip1);
		DecoratorReclama decoratorClip2=new DecoratorReclama(clip2);
		

		IClip clip11 = (IClip) clip1;
		clip11.start();
		IClip clip12 = (IClip) clip2;
		clip12.start();
		IClip clip13 = (IClip) clip3;
		clip13.start();
		IClip clip14 = (IClip) clip4;
		clip14.start();

		decoratorClip1.modificaReclama(1000, 10);
		decoratorClip2.modificaReclama(2000, 11);
		
		IClip clip111 = (IClip) clip1;
		clip111.start();
		IClip clip122 = (IClip) clip2;
		clip122.start();
		

	}

}
