/*
 * PROBLEMA: "idades"
 * VER ARQUIVO "03-estrutura-sequencial-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);
		
		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");		
		String nomePrimeiraPessoa = sc.nextLine();
		System.out.print("Idade: ");
		int idadePrimeiraPessoa = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nomeSegundaPessoa = sc.nextLine();
		System.out.print("Idade: ");
		int idadeSegundaPessoa = sc.nextInt();
		
		double idadeMedia = (idadePrimeiraPessoa + idadeSegundaPessoa) / 2.0;
		System.out.println("A idade média de " + nomePrimeiraPessoa + " e " + nomeSegundaPessoa + " é de " + String.format("%.1f", idadeMedia) + " anos");
		
		// fecha scanner
		sc.close();

	}

}
