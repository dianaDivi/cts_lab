package ro.ase.cts.seminar_9.clase;

import java.util.ArrayList;

public class VideoDatabase {
	private ArrayList<YoutubeVideo> videoCollection;
	
	public VideoDatabase() {
		videoCollection=new ArrayList<>();
		videoCollection.add(new YoutubeVideo(1, "Mama", 130f));
		videoCollection.add(new YoutubeVideo(1, "Jamila", 137f));

	}
	
}
