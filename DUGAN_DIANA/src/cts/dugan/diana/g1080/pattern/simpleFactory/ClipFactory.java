package cts.dugan.diana.g1080.pattern.simpleFactory;

public class ClipFactory {
	public static IClip creareClip(EnumClip tip,String denumire, int durata) {
		switch (tip) {
			case VIDEO:
				return new ClipVideo(denumire, durata);
			
			case TUTORIAL:
				return new ClipTutorial(denumire, durata);
		default:
			throw new IllegalArgumentException();
		}
	}
}
