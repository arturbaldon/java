/*
 * PROBLEMA: "notas"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		double notaFinal = nota1 + nota2;
		System.out.println("NOTA FINAL = " + String.format("%.1f", notaFinal));
		if (notaFinal < 60.00) {
			System.out.println("REPROVADO");
		}		
		
		// fecha scanner
		sc.close();

	}

}
