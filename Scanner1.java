package projeto_java;

import java.util.Locale;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		/*
		 * Scanner Para fazer entrada de dados, nós vamos criar um objeto do tipo
		 * "Scanner" da seguinte forma: Scanner sc = new Scanner(System.in); import
		 * java.util.Scanner; faça sc.close() quando não precisar mais do objeto sc
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		// Para ler uma palavra (texto sem espaços)
		String nome;
		nome = sc.next();
		System.out.println(nome);
		// Saída = nome escrito escolhido pelo usuário//

		int inteiro;
		inteiro = sc.nextInt();
		System.out.println(inteiro);
		/* Saída = número inteiro escrito escolhido pelo usuário */

		double numero1;
		numero1 = sc.nextDouble();
		System.out.println(numero1);
		// Saída = número double escrito escolhido pelo usuário//

		char letra;
		letra = sc.next().charAt(0);
		System.out.println(letra);

		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
