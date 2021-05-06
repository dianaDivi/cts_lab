package ro.ase.CTS.ex6.Facade;

public class Facade {
	public static String internareSauNu(int codPacient, int codPat) {
		Pacient pacient=new Pacient();
		if(codPacient==pacient.getCodPacient()) {
			Medic medic=new Medic();
			if(!medic.obtineSituatiePacient(codPacient)) {
				Salon salon=new Salon();
				if(!salon.situatieSalon(codPat)) {
					return "Pacientul "+pacient.getNumePacient()+" trebuie internat in salonul  "+codPat;
				}else {
					return "Pacientul trebuie internat dar salanul nu este disponibil";
				}
				//return "Pacientul trebuie internat";
			}else {
				return "Pacientul nu trebuie internat";

			}
					
		}else{
			return "Pacientul nu este identificat";
		}
	}
}
