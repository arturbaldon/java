/*
 * PROBLEMA: "baskara"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		if (a == 0 || delta < 0) {
			System.out.println("Esta equação não possui raízes reais");			
		} else {
			double x1 = (- b + Math.sqrt(delta)) / (2 * a);
			double x2 = (- b - Math.sqrt(delta)) / (2 * a);
			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
		
		// fecha scanner
		sc.close();

	}

}
