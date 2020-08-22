/*
 * PROBLEMA: "multiplos"
 * VER ARQUIVO "04-estrutura-condicional-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São múltiplos");			
		} else {
			System.out.println("Não são múltiplos");
		}
		
		// fecha scanner
		sc.close();

	}

}
