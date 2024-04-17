package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import fileJavaCsv.Produto;

public class Programa {

	static Random random = new Random();
	
	public static void main(String[] args) {

		criaSumario();
		
		}
	
	public static void criaCSV() {
		
		String[] nomes = { "TV", "Celular", "Tablet", "GPU", "CPU", "Fonte" };
		double[] precos = { 1249.99, 1099.00, 1999.99, 1899.00, 699.99, 499.00};
		
		String caminho = "C:\\OneDriveTemp\\teste.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {

			for (int i = 0; i < 6; i++) {
				int quantidade = random.nextInt(10) + 1;
				Produto prod = new Produto(nomes[i], precos[i], quantidade);
				bw.write(prod.toString());
				bw.newLine();
				
				boolean subpasta = new File("C:\\OneDriveTemp\\subpasta").mkdir();
				String resumo =  "C:\\OneDriveTemp\\subpasta\\resumo.csv";
				
				}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void criaSumario() {
		
		criaCSV();
		String pathResumo = "C:\\OneDriveTemp\\subpasta\\resumo.csv";
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\OneDriveTemp\\teste.csv")); BufferedWriter bw = new BufferedWriter(new FileWriter(pathResumo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] tokens = linha.split(",");
                
                bw.write(tokens[0] + "," + tokens[1]);
                bw.newLine();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	}