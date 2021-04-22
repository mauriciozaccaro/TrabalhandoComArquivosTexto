import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_Aula_186 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Teste", "Good nigth"};	
		
		String path = "C:\\Drivers PC\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // esse "true" no final faz com que o arquivo não seja recriado, mas sim alterado
			for(String line : lines) { // para cada string line existente no vetor lines
				bw.write(line);
				bw.newLine();
			}
			bw.write("");
			bw.newLine();
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
