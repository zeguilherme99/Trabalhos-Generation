import java.util.Scanner;

public class ExercicioLacoRepeticao2 {
	public static void main (String args[])
	{
		int a,b,c,maior=0,medio=0,menor=0;
		Scanner ler = new Scanner (System.in);
		System.out.printf("Digite o primeiro numero");
		a=ler.nextInt();
		System.out.printf("Digite o segundo numero");
		b=ler.nextInt();
		System.out.printf("Digite o terceiro numero");
		c=ler.nextInt();
			if(a>b && b>c)
			{
				maior=a;
				medio=b;
				menor=c;
			}
			else if(a>b && c>b)
				{
				maior=a;
				medio=c;
				menor=b;
				}
			else if(b>a && a>c)
			{
				maior=b;
				medio=a;
				menor=c;
			}
			else if(b>c && c>a )
			{
				maior=b;
				medio=c;
				menor=a;
			}
			else if(c>a && a>b)
			{
				maior=c;
				medio=a;
				menor=b;
			}
			else if(c>b && b>a)
			{
				maior=c;
				medio=b;
				menor=a;
			}
		System.out.printf("O maior numero é %d, o medio é %d e o menor e %d", maior, medio, menor);
	}
}
