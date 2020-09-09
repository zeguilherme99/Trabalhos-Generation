import java.util.Scanner;

public class ExercicioLacoRepeticao1 {
	public static void main(String args[])
	{	int a;
		Scanner ler =  new Scanner (System.in);
		System.out.printf("Digite quantos anos voce tem(de 10 a 25 anos):");
		a=ler.nextInt();
				if(a>=10 && a<=14)
				{
					System.out.printf("\nVoce se encontra na categoria infantil");
				}
				else if(a>14 && a<=17)
				{
					System.out.printf("\nVoce se encontra na categoria juvenil");
				}
				else 
				{
					System.out.printf("\nVoce se encontra na categoria adulto");
				}
	}

}
