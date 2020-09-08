package turma8;

import java.util.Scanner;

public class PrimeiraCLasse {
	public static void main (String args[])
	{
		int a,b,soma;
		double x,y,divisor;
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Entre com o valor de A: ");
			a = ler.nextInt();
			System.out.println("Entre com o valor de B: ");
			b = ler.nextInt();
			System.out.println("Entre com o valor de X: ");
			x = ler.nextFloat();
			System.out.println("Entre com o valor de y: ");
			y = ler.nextFloat();
		divisor= a % b;	
		soma = a + b;
		x = Math.pow(x, 3);
		y= Math.sqrt(y);
		System.out.println("A soma foi de: "+soma+" que bom...");
		System.out.println("O Valor de X foi de: "+x);
		System.out.println("O Valor de X foi de: "+y);
		System.out.println("O Valor do DIVISOR foi de: "+divisor);
	}
}