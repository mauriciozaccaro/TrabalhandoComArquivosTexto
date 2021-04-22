import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program_Aula_189_Exercicio_Proposto {

	/*Exercício Proposto 
	 * 
	 * Fazer um programa para ler o caminho de um arquivo .csv (separado por vírgula) contendo os dados de itens 
	 * vendidos. Cada item possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar 
	 * um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta original 
	 * do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário * quantidade).
	 * Conforme exemplo:
	 * 
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<Produto> listProd = new ArrayList<>();
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		File file = new File(strPath);
		
		String newPathCaminho = file.getParent();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = br.readLine();
			String[] lineSeparadas = line.split(",");
			
			Produto prod = new Produto(lineSeparadas[0], Double.parseDouble(lineSeparadas[1]), 
					                   Integer.parseInt(lineSeparadas[2]));
			while(line != null) {
				
				 listProd.add(prod);
				 line = br.readLine();
				 if(line != null) {
				 lineSeparadas = line.split(",");
				 
				 prod = new Produto(lineSeparadas[0], Double.parseDouble(lineSeparadas[1]), 
		                   Integer.parseInt(lineSeparadas[2]));
				 }	 
			}
		}
		catch(IOException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		new File(newPathCaminho + "\\out").mkdir(); // criando nova pasta
		
		String newFile = newPathCaminho + "\\out\\summary.csv"; //criando novo arquivo
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile,true))){
			
			bw.write("<<EXERCÍCIO PROPOSTO - AULA 189>>");
			bw.newLine();
			bw.newLine();
			for(Produto list : listProd) {
				String teste = list.getNomeProd() + "," + list.calculaPriceTotal();
				bw.write(teste);
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Ocorreu um erro no 2° try(): " + e.getMessage());
		}
		sc.close();
		System.out.println("Fim!");
	}

}
