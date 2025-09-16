package projeto_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		 System.out.println("Alô mundo Java!");
		 System.out.println("Alô mundo");
		 int x = 56;
		 System.out.println(x);
		 System.out.println("RESULTADO = " + x + " METROS");
		 System.out.println("Olha o Resultado: " + x + " Metros");
		double numero1 = 45;
		Locale.setDefault(Locale.US);
		System.out.printf("RESULTADO = %.2f Metros%n", numero1);
		 /*	%f = ponto flutuante
				%d = inteiro
				%s = texto
				%n = quebra de linha
		*/
		String name1 = "joão Victor";
		int idade1 = 32;
		double salario1 = 5000.0;
		System.out.printf("O %s tem %d anos e seu salário é de R$ %.2f%n reais.", name1, idade1, salario1);
		
		
		String product1 = "Computer";  //%s
		String product2 = "Office desk"; //%s
		double price1 = 2100.0;  //%f
		double price2 = 650.50; //%f
		
		System.out.printf("\nProducts: %s, which price is $ %.2f%n", product1, price1);
		System.out.printf("\nProducts: %s, which price is $ %.2f%n", product2, price2);
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		
		
		int a = 5;
		int y = 2 * a;
		System.out.println(a);
		System.out.println(y);
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		float b1, B1, h1, area1;
		b1 = 6f;
		B1 = 8f;
		h1 = 5f;
		area1 = (b1 + B1) / 2f * h1;
		System.out.println(area1);
		
		/* Casting
		É a conversão explícita de um tipo para outro.
		É necessário quando o compilador não é capaz de “adivinhar” que o 
		resultado de uma expressão deve ser de outro tipo. */
		
		int cinco1, dois1;
		double resultado1;
		cinco1 = 5;
		dois1 = 2;
		resultado1 = a / b;
		System.out.println(resultado1);
		
		double v1;
		int v2;
		
		v1 = 5.0;
		v2 = (int) a;
		System.out.println(v2);
		
		
		
		
		
		
		
		
		
	}

}
