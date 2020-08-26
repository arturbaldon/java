/*
 * PROBLEMA: "comerciante"
 * VER ARQUIVO "06-vetores-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		String[] vetNomeProduto = new String[n];
		double[] vetPrecoCompra = new double[n];
		double[] vetPrecoVenda = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			vetNomeProduto[i] = sc.nextLine();
			System.out.print("Preço de compra: ");			
			vetPrecoCompra[i] = sc.nextDouble();			
			System.out.print("Preço de venda: ");
			vetPrecoVenda[i] = sc.nextDouble();
		}
		
		System.out.println("\n\nRELATORIO:");
		
		double lucro, lucroPercent;
		int lucroAbaixo10 = 0, lucroEntre10e20 = 0, lucroAcima20 = 0;
		
		for (int i = 0; i < n; i++) {
			lucro = vetPrecoVenda[i] - vetPrecoCompra[i];
			lucroPercent = (lucro * 100.0) / vetPrecoCompra[i];
			if (lucroPercent < 10) {
				lucroAbaixo10++;
			} else {
				if (lucroPercent <= 20) {
					lucroEntre10e20++;
				} else {
					lucroAcima20++;
				}
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		
		double totalCompra = 0, totalVenda = 0, totalLucro;
		for (int i = 0; i < n; i++) {
			totalCompra = totalCompra + vetPrecoCompra[i];
			totalVenda = totalVenda + vetPrecoVenda[i];
		}
		
		totalLucro = totalVenda - totalCompra;
		System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
		System.out.println("Lucro total: " + String.format("%.2f", totalLucro));
		
		// fecha scanner
		sc.close();

	}

}
