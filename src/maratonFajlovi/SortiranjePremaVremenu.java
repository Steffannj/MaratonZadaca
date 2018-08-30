package maratonFajlovi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortiranjePremaVremenu {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("maraton.txt");
		Scanner fs = new Scanner(f);
		ArrayList<Ucesnik> listaUcesnika = new ArrayList<Ucesnik>();

		while (fs.hasNext()) {
			String ime = fs.next();
			int vrijeme = fs.nextInt();
			Ucesnik u = new Ucesnik(ime, vrijeme);
			listaUcesnika.add(u);
		}
		
		Collections.sort(listaUcesnika, new Comparator<Ucesnik>() {
			public int compare(Ucesnik u1, Ucesnik u2) {
				return Integer.valueOf(u1.getVrijeme()).compareTo(u2.getVrijeme());
			}
		});
		
		System.out.println("Svi ucesnici sortirani prema vremenu koje su ostvarili od najmanjeg prema najvecem: ");
		
		for (int i = 0; i < listaUcesnika.size(); i++) {
			System.out.println(listaUcesnika.get(i).getIme() + " " + listaUcesnika.get(i).getVrijeme());
		}
		fs.close();

	}

}
