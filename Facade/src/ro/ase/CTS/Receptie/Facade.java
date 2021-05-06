package ro.ase.CTS.Receptie;

public class Facade {
	public static boolean verificareCamera(int codCamera) {
		CamereLibere camereLibere=new CamereLibere();
		
		if(camereLibere.verificareCameraLibera(codCamera)) {
			Menajera menajera=new Menajera();
			if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeCurate(codCamera)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public static String verificareDisponibilitateCamera(int codCamera) {
		CamereLibere camereLibere=new CamereLibere();
		if(camereLibere.verificareCameraLibera(codCamera)) {
			Menajera menajera=new Menajera();
			if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeCurate(codCamera)) {
				return "Camera este gata";
				
			}else {
				return "Asteapta pana se face curat";
			}
		}
		else {
			return "Asdteptati pana se elibereaza";
		}
	}
}
