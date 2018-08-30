package maratonFajlovi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IspisVremenaUnesenogUcesnika {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime ucesnika: ");
		File f = new File("maraton.txt");
		Scanner fs = new Scanner(f);
		ArrayList<Ucesnik> listaUcesnika = new ArrayList<Ucesnik>();

		while (fs.hasNext()) {
			String ime = fs.next();
			int vrijeme = fs.nextInt();
			Ucesnik u = new Ucesnik(ime, vrijeme);
			listaUcesnika.add(u);
		}
		boolean postoji = false;
		String ime = unos.nextLine();
		for (int i = 0; i < listaUcesnika.size(); i++) {
			if (ime.equals(listaUcesnika.get(i).getIme())) {
				System.out.println("Vrijeme ucesnika " + ime + " je " + listaUcesnika.get(i).getVrijeme() + ".");
				postoji = true;
			}
		}
		if (!postoji) {
			System.out.println("Ucesnik sa tim imenom ne postoji.");
		}

		fs.close();
		unos.close();

	}

}
