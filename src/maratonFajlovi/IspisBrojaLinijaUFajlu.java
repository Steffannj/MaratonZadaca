package maratonFajlovi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class IspisBrojaLinijaUFajlu {

	public static void main(String[] args) throws IOException {

		URL url = new URL("http://www.textfiles.com/science/astronau.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		int brojLinija = 1;
		while (br.readLine() != null) {
			brojLinija++;
		}
		System.out.println("Broj linija u tekstu koji se nalazi na navedenoj URL adresi je " + brojLinija);
	}

}
