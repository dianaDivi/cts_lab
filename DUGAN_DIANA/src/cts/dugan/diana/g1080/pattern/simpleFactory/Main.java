package cts.dugan.diana.g1080.pattern.simpleFactory;

public class Main {

	public static void main(String[] args) {

		IClip clipVideo = ClipFactory.creareClip(EnumClip.VIDEO, "VIDEO 1", 300);
		IClip clipVideo2 = ClipFactory.creareClip(EnumClip.VIDEO, "VIDEO 2", 100);
		IClip clipTutorial = ClipFactory.creareClip(EnumClip.TUTORIAL, "TUTORIAL 1", 200);
		IClip clipTutorial2 = ClipFactory.creareClip(EnumClip.TUTORIAL, "TUTORIAL 2", 500);

		System.out.println(clipVideo);
		System.out.println(clipVideo2);
		System.out.println(clipTutorial);
		System.out.println(clipTutorial2);

	}

}
