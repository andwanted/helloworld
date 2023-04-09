import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoDeArquivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File a = new File("c:\\temp\\arquivo.txt");

		File b = new File("c:\\temp");

		String path = "C:\\temp\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		fr = new FileReader(path);
		br = new BufferedReader(fr);
		String line = br.readLine();
		line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String pathOut = "C:\\temp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
			for (String lineOut : lines) {
				bw.write(lineOut);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
