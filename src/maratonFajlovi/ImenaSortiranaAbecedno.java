package maratonFajlovi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ImenaSortiranaAbecedno {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> imena = new ArrayList<>();
		File f = new File("imena.txt");
		Scanner fs = new Scanner(f);
		while(fs.hasNext()) {
			imena.add(fs.next());
		}
		Collections.sort(imena);
		for(int i = 0; i < imena.size(); i++) {
			System.out.println(imena.get(i));
		}
		fs.close();
	}
}
