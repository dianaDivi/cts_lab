package ro.ase.cts.seminar_9.clase;

import java.util.ArrayList;

public class YoutobeLabrary implements YoutubeLibraryInterface {
	private VideoDatabase database;
	public YoutobeLabrary() {
		this.database=new VideoDatabase();
	}
	
	@Override
	public String listVideos() {
		System.out.println("Fetch");
		ArrayList<YoutubeVideo> videoList=database.getVideoCollection();
		
		StringBuilder videoListBuilder=new StringBuilder();
		for(YoutubeVideo video:videoList) {
			videoListBuilder.append(video.getId())
							.append("-")
							.append(video.getTitle())
							.append("/");
			
			
		}
		
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
