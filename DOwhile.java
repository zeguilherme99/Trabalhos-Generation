import java.util.Scanner;

public class DOwhile {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int numero=0,x;
		do { 
			System.out.printf("\nDigite um numero");
			x=ler.nextInt();
			numero=numero+x;
		}while(x!=0);
		System.out.printf("A soma dos numeros foram de: %d", numero);
	}
}
