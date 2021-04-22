import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program_Aula_188 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o caminho de um arquivo: ");
			
			String strPath = sc.nextLine();
			// sc = C:\Drivers PC\out.txt
			File path = new File(strPath);
			
			BasicFileAttributes att;
			att = Files.readAttributes(path.toPath(), BasicFileAttributes.class);
			BasicFileAttributes atttt;
			atttt = Files.readAttributes(path.toPath(), BasicFileAttributes.class);
			
			FileTime tFile = att.creationTime();
			FileTime ttFile = atttt.lastModifiedTime();
			

		    String pattern = "dd/MM/yyyy HH:mm:ss";
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
		    String formatted = simpleDateFormat.format( new Date( tFile.toMillis() ) );
		    String formatted2 = simpleDateFormat.format( new Date( ttFile.toMillis() ) );
		    
		    
		    System.out.println("Data e hora de criação do arquivo: " + formatted);
		    System.out.println("Data e hora da ultima alteração do arquivo: " + formatted2);
		    System.out.println();
			
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
