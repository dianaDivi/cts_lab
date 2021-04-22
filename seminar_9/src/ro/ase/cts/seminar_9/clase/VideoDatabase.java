package ro.ase.cts.seminar_9.clase;

import java.util.ArrayList;

public class VideoDatabase {
	private ArrayList<YoutubeVideo> videoCollection;
	
	public VideoDatabase() {
		videoCollection=new ArrayList<>();
		videoCollection.add(new YoutubeVideo(1, "Mama", 130f));
		videoCollection.add(new YoutubeVideo(1, "Jamila", 137f));

	}
	
	public ArrayList<YoutubeVideo> getVideoCollection(){
		
	}
	
	
	public String getVideoInfo(int id) {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		for(YoutubeVideo video:videoCollection) {
			if(id==video.getId()) {
				StringBuilder videoDescription=new StringBuilder();
				videoDescription.append(video.getTitle()).append("takes you").append(video.getDuration()).append("minutes to watch");
				
				return videoDescription.toString();
			}
		}
		return "invalid id";
	}
}
