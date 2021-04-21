import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program_Aula_188 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o caminho de um arquivo: ");
			
			String strPath = sc.nextLine();
			// sc = C:\Drivers PC\out.txt
			File path = new File(strPath);
			
			System.out.println("getName: " + path.getName()); // getName traz apenas o nome do arquivo
			System.out.println("getParent: " + path.getParent()); // getParent traz apenas o caminho do arquivo
			System.out.println("getPath: "+ path.getPath()); // traz tanto caminho como nome do arquivo
			System.out.println(path.getAbsolutePath());
			System.out.println(path.getCanonicalPath());
			System.out.println(path.getFreeSpace());
			System.out.println(path.getTotalSpace());
			System.out.println(path.getUsableSpace());
			System.out.println(path.getAbsoluteFile());
			System.out.println(path.getCanonicalFile());
			System.out.println(path.getClass());
			
		sc.close();
	}

}
