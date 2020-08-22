/*
 * PROBLEMA: "senha_fixa"
 * VER ARQUIVO "05-estruturas-repetitivas-exercicios"
 * */
import java.util.Locale;
import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// seta locale US para "." como separador decimal
		Locale.setDefault(Locale.US);

		// declara scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senhaDigitada = sc.nextInt();
		
		int senha = 2002;
		while (senhaDigitada != senha) {
			System.out.print("Senha Inválida! Tente novamente: ");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		// fecha scanner
		sc.close();

	}

}
