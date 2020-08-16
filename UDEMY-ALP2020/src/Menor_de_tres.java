/*
 * PROBLEMA: "menor_de_tres"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int n1 = sc.nextInt();		
		System.out.print("Segundo valor: ");
		int n2 = sc.nextInt();		
		System.out.print("Terceiro valor: ");
		int n3 = sc.nextInt();
		
		int menor;		
		if (n1 < n2 && n1 < n3) {
			menor = n1;
		} else {
			if (n2 < n3) {
				menor = n2;
			} else {
				menor = n3;
			}
		}
		
		System.out.println("MENOR = " + menor);
		
		// fecha scanner
		sc.close();

	}

}
