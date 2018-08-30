package maratonFajlovi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NajboljiMaratonci {

	public static void main(String[] args) throws IOException {
		File f = new File("maraton.txt");
		Scanner fs = new Scanner(f);
		Path path = Paths.get("najboljiMaratonci.txt");
		BufferedWriter bw = Files.newBufferedWriter(path);
		ArrayList<Ucesnik> listaUcesnika = new ArrayList<Ucesnik>();

		while (fs.hasNext()) {
			String ime = fs.next();
			int vrijeme = fs.nextInt();
			Ucesnik u = new Ucesnik(ime, vrijeme);
			listaUcesnika.add(u);
		}
		for (int i = 0; i < listaUcesnika.size(); i++) {
			if (listaUcesnika.get(i).getVrijeme() >= 300) {
				bw.write(listaUcesnika.get(i).getIme() + " " + listaUcesnika.get(i).getVrijeme());
				bw.newLine();
			}

			bw.flush();
		}
		fs.close();
	}

}
