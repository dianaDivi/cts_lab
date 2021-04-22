package ro.ase.cts.seminar_9.main;

import ro.ase.cts.Flyweng.Model3DFactory;
import ro.ase.cts.Flyweng.ModelFlyweightInterface;
import ro.ase.cts.Flyweng.ModelType;
import ro.ase.cts.Flyweng.ScreenData;
import ro.ase.cts.seminar_9.clase.YoutobeLabrary;
import ro.ase.cts.seminar_9.clase.YoutubeLibraryInterface;
import ro.ase.cts.seminar_9.clase.YoutubeLibraryProxy;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLib = new YoutobeLabrary();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoInfo(1));
		
		
		YoutubeLibraryInterface youtubeLibProxy = new YoutubeLibraryProxy();
		System.out.println(youtubeLibProxy.listVideos());
		System.out.println(youtubeLibProxy.listVideos());
		System.out.println(youtubeLibProxy.getVideoInfo(1));
		System.out.println(youtubeLibProxy.getVideoInfo(1));
		System.out.println("-----------------------------------------------------");
		ScreenData dataSet1 = new ScreenData("green", 99, 30, 100);
		ScreenData dataSet2 = new ScreenData("green", 20, 30, 40);
		
		ModelFlyweightInterface soldier1 = Model3DFactory.getModel(ModelType.SOLDIER);
		ModelFlyweightInterface soldier2 = Model3DFactory.getModel(ModelType.SOLDIER);

		soldier1.display(dataSet1);
		soldier1.display(dataSet2);
		soldier2.display(dataSet2);
	}
}
