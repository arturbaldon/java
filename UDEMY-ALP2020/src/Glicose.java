/*
 * PROBLEMA: "glicose"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		double medidaGlicose = sc.nextDouble();
		
		if (medidaGlicose <= 100) {
			System.out.println("Classificação: normal");
		} else {
			if (medidaGlicose <= 140) {
				System.out.println("Classificação: elevado");
			} else {
				System.out.println("Classificação: diabetes");
			}
		}
		
		// fecha scanner
		sc.close();

	}

}
