package ro.ase.cts.seminar_9.clase;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface {

	private YoutubeLibraryInterface libImplementation;
	
	public  YoutubeLibraryProxy() {
		libImplementation=new YoutobeLabrary();
	}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
