package cts.dugan.diana.g1080.pattern.composite;

public interface IPlaylist {
	public void adaugaNod(IPlaylist componenta);
	public void stergeNod(IPlaylist componenta);
	public void afiseazaInformatii();
	IPlaylist getComponenta(int index) throws Exception;
	
}
