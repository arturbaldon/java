/*
 * PROBLEMA: "experiencias"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos de teste serão digitados? ");
		int n = sc.nextInt();
		
		int quantidadeCobaia, coelho = 0, rato = 0, sapo = 0;
		char tipoCobaia;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidadeCobaia = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			if (tipoCobaia == 'c' || tipoCobaia == 'C') {
				coelho = coelho + quantidadeCobaia;
			} else {
				if (tipoCobaia == 'r' || tipoCobaia == 'R') {
					rato = rato + quantidadeCobaia;
				} else {
					if (tipoCobaia == 's' || tipoCobaia == 'S') {
						sapo = sapo + quantidadeCobaia;
					}
				}
			}			
		}
		
		int totalCobaia = coelho + rato + sapo;
		double percenCoelho = ((double)coelho / totalCobaia) * 100.0;
		double percenRato = ((double)rato / totalCobaia) * 100.0;
		double percenSapo = ((double)sapo / totalCobaia) * 100.0;
		
		System.out.println("\nRELATORIO FINAL:");		
		System.out.println("Total: " + totalCobaia + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percenCoelho));
		System.out.println("Percentual de ratos: " + String.format("%.2f", percenRato));
		System.out.println("Percentual de sapos: " + String.format("%.2f", percenSapo));
		
		// fecha scanner
		sc.close();

	}

}
