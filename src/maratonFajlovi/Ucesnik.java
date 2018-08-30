package maratonFajlovi;

public class Ucesnik {
	private String ime;
	private int vrijeme;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getVrijeme() {
		return vrijeme;
	}

	public Ucesnik(String ime, int vrijeme) {
		super();
		this.ime = ime;
		this.vrijeme = vrijeme;
	}

	public void setVrijeme(int vrijeme) {
		this.vrijeme = vrijeme;
	}

}
