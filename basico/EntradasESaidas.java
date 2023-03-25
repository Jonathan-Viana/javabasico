package cursoJava.basico;

import java.util.Scanner;

public class EntradasESaidas {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		double altura; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: " );
		nome = leitor.nextLine();
		
		System.out.println("Digite seu idade: " );
		idade = leitor.nextInt();
		
		System.out.println("Digite seu altura: " );
		altura = leitor.nextDouble();
		
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Altura: " +altura);
		System.out.println();
		
		System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f", nome,idade,altura);

	}

}
