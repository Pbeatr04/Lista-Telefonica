package agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeitorBuffer {
	public static String ler(File arquivo) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader reader = new FileReader(arquivo);
			BufferedReader bufReader = new BufferedReader(reader);
			String s;
			do {
				s = bufReader.readLine();
				if (s!=null) {
					sb.append( s + "\r\n" );
				}
			} while (s!=null);
			bufReader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
