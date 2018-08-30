package maratonFajlovi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NajbrziUcesnik {

	public static void main(String[] args) throws IOException {
		File f = new File("maraton.txt");
		Scanner fs = new Scanner(f);
		String najbrziUcesnik = fs.next();
		int najbrzeVrijeme = fs.nextInt();

		while (fs.hasNext()) {
			String ime = fs.next();
			int vrijeme = fs.nextInt();
			if (vrijeme < najbrzeVrijeme) {
				najbrzeVrijeme = vrijeme;
				najbrziUcesnik = ime;
			}
		}
		System.out.println("Najbrzi ucesnik je " + najbrziUcesnik + " sa vremenom " + najbrzeVrijeme);
		fs.close();
	}

}
