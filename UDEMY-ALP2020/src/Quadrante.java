/*
 * PROBLEMA: "quadrante"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores das coordenadas X e Y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else {
				if (x < 0 && y > 0) {
					System.out.println("QUADRANTE Q2");
				} else {
					if (x < 0 && y < 0) {
						System.out.println("QUADRANTE Q3");
					} else {
						System.out.println("QUADRANTE Q4");
					}
				}
			}
			System.out.println("Digite os valores das coordenadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		// fecha scanner
		sc.close();		

	}

}
