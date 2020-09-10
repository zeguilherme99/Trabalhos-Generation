import java.util.Scanner;

public class While {
	public static void main (String args [])
	{
		Scanner ler = new Scanner (System.in);
		int idade=0,cont21=0,cont50=0;
		while(idade!= -99)
			{System.out.printf("\nDigite sua idade");
			idade=ler.nextInt();
			if (idade<21 && idade>0)
			{
				cont21++;
			}
			if(idade>50 && idade>0)
			{
				cont50++;
			}
			}
		System.out.printf("\nO numero de pessoas menores de  21 anos foram de: %d e o de pessoas com mais de 50 anos foram de %d ", cont21, cont50);
			
	}

}
