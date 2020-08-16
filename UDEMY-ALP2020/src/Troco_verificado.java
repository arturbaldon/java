/*
 * PROBLEMA: "menor_de_tres"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Troco_verificado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();		
		System.out.print("Dinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		double totalCompra = quantidade * preco;
		
		if (totalCompra <= dinheiro) {
			double troco = dinheiro - totalCompra;
			System.out.println("TROCO = " + String.format("%.2f", troco));
		} else {
			double falta = totalCompra - dinheiro;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", falta) + " REAIS");
		}
		
		// fecha scanner
		sc.close();

	}

}
