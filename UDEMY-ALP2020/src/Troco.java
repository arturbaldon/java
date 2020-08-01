/*
 * PROBLEMA: "troco"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidadeComprada = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiroRecebido = sc.nextDouble();
		
		double troco = (double)dinheiroRecebido - (precoUnitario * quantidadeComprada);
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		// fecha scanner
		sc.close();

	}

}
