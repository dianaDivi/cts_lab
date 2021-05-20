package cts.dugan.diana.g1080.pattern.composite;

public class Main {

	public static void main(String[] args) throws Exception {
		IPlaylist playlist=new Playlist("Video preferate");
		
		
		IPlaylist animatii=new Playlist("Animatie");
		IPlaylist documentare=new Playlist("Documentare");
		
		Clip zoo=new Clip("Zoo",400,5);
		Clip sorcova=new Clip("Sorcova",600,3);
		Clip shrek=new Clip("Shrek",1000,5);
		Clip top8=new Clip("Top 8",100,4);
		Clip duffyDuck=new Clip("Duffy Duck",20,4);
		Clip tepes=new Clip("Vlad Tepes",300,4);
		
		playlist.adaugaNod(animatii);
		playlist.adaugaNod(documentare);

		animatii.adaugaNod(shrek);
		animatii.adaugaNod(top8);
		animatii.adaugaNod(duffyDuck);

		documentare.adaugaNod(zoo);
		documentare.adaugaNod(sorcova);
		documentare.adaugaNod(tepes);
		
		playlist.afiseazaInformatii();

		IClip clip = (IClip) playlist.getComponenta(0).getComponenta(2);
		IClip clip2 = (IClip) playlist.getComponenta(1).getComponenta(1);

		clip.start();
		clip2.start();
		clip2.pause();
		clip.stop();
		
		

	}

}
