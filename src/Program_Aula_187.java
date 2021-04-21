import java.io.File;
import java.util.Scanner;

public class Program_Aula_187 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Caminho da Pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); //Aqui está sendo criado um vetor (folders) de arquivos
		// e na parte "File::isDirectory" especifica que os arquivos do vetor serão todos de diretorios ou seja, PASTAS
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder.getPath());
		}

		System.out.println();
		
		File[] arquivx = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for(File file : arquivx) {
			System.out.println(file.getPath());
		}
		
		boolean success = new File(strPath + "\\Nova Pasta de Teste").mkdir(); // serve para criar uma nova pasta 
		// no diretorio indicado anteriormente...  o boolean é apenas para dizer se foi criado ou não, a partir do true/false
		System.out.println("Pasta criada com sucesso? (true/false): " + success);
		
		sc.close();
	}

}
