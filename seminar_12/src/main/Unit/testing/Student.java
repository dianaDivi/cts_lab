package main.Unit.testing;

public class Student {
	public String nume;
	public int varsta;
	public int note[];
	public Student(String nume, int varsta, int[] note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public int[] getNote() {
		return note;
	}
	public void setNote(int[] note) {
		this.note = note;
	}
	
	
	
}
