/*
 * PROBLEMA: "coordenadas"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de X: ");
		double x = sc.nextDouble();
		System.out.print("Valor de Y: ");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			if (x == 0) {
				System.out.println("Eixo Y");				
			} else {
				if (y == 0) {
					System.out.println("Eixo X");
				} else {
					if (x > 0 && y > 0) {
						System.out.println("Q1");
					} else {
						if (x < 0 && y > 0) {
							System.out.println("Q2");
						} else {
							if (x < 0 && y < 0) {
								System.out.println("Q3");
							} else {
								System.out.println("Q4");
							}
						}
					}
				}
			}

		}
		
		// fecha scanner
		sc.close();

	}

}
