package cts.dugan.diana.g1080.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IPlaylist{
	private String denumire;
	private List<IPlaylist> playlist;
	
	

	public Playlist(String denumire) {
		super();
		this.denumire = denumire;
		this.playlist = new ArrayList<IPlaylist>();
	}


	@Override
	public void adaugaNod(IPlaylist componenta) {
		playlist.add(componenta);
		
	}



	@Override
	public void stergeNod(IPlaylist componenta) {
		playlist.remove(componenta);
	}



	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea "+this.denumire);
		for(IPlaylist s: playlist) {
			s.afiseazaInformatii();
		}
		
	}



	@Override
	public IPlaylist getComponenta(int index) throws Exception {
		if(index>= 0 && index <= playlist.size()) {
			return playlist.get(index);
		}else {
			 throw new Exception("Nu face parte");
		}
		
	}


	


}
