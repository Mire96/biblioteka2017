package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private long isbn;
	private String izdavac;
	private int izdanje;
	private LinkedList<Autor> autori;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	
	
	
}
