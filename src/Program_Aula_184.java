import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program_Aula_184 {

	public static void main(String[] args) {
		
		String path = "C:\\Drivers PC\\teste_java.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // BufferedReader é instaciado a partir do FileReader
			// poderia ser feito em uma linha única, conforme abaixo
			//  br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally{
			try {
				if(br != null ) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}



	}

}
