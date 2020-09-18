package AprendendoPoo;

import java.util.Random;
import java.util.Scanner;

public class ProjetoPessoaTesteFinal {
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);
	Random random = new Random();

	ProjetoPessoa user = new ProjetoPessoa("Robertx", 251897, "(QUA e SEX)", 5, "Relax", 1564);
	int resp = 0, resp2 = 0, resp3 = 0, tempo1 = user.getTempo(), numero = random.nextInt(1000);
	String nome1, dias, perfil;

	do {
		System.out.println("Oioi, tutupom? Entre com a senha:");
		resp3 = ler.nextInt();
		if (resp3 == user.getAcesso()) {
			do {
				System.out.println("\nOlá Sr(a) " + user.getNome() + "!"
						+ "\n\nO que gostaria de fazer hoje? \n(1) Ver seu Perfilzinho \n(2) Acompanhar sua rotina de meditação \n(3) Inserir sua de meditação de hoje \n(4) Alterar todos os seus dados \n(0) Sair");
				resp = ler.nextInt();

				switch (resp) {
				case 1:
					System.out.println("SEU NOMEZINHO: " + user.getNome() + "\nSEU ID: " + user.getUsuario() + "\nVOCÊ ESTÁ: "
							+ user.getPsico() + "\nSenha: " + "Shiu, é segredo!");
					break;
				case 2:
					System.out.println("\nDIAS: " + user.getRotina() + "\nTEMPO: " + user.getTempo() + "min por dia");
					break;
				case 3:
					System.out.println("Quantos minutos você meditou hoje?");
					resp2 = ler.nextInt();

					if (resp2 >= user.getTempo() && resp2 != 0) {
						System.out.println("Nossa, parabéns!!! Isso foi show de boliche! Mantenha o ritmo!");
					} else if (resp2 < user.getTempo() && resp2 > 0) {
						System.out.println("Muito que bem, acredito que na próxima você consegue!");
					} else if (resp2 == 0) {
						System.out.println("Entendo que seu dia pode ter sido difícil. Que tal tentar um pouquinho hoje?");
					} else {
						System.out.println("UIUU UIUU, DEU ERRO, DEU ERRO!");
					}
					break;
				case 4:

					System.out.println("Beleza, então entre com uma nova senha numérica: ");

					resp3 = ler.nextInt();
					user.setAcesso(resp3);
					if (resp3 == user.getAcesso()) {
						nome1 = ler.nextLine();

						System.out.printf("Agora me diga seu nome: ");
						nome1 = ler.nextLine();
						user.setNome(nome1);
						user.setUsuario(numero);
						System.out.println("\nBeleza vamos lá " + user.getNome() + "!");

						System.out.println("Agora, papo reto, me diga brevemente, como você está hoje: ");
						perfil = ler.nextLine();
						user.setPsico(perfil);
						
						System.out.println("Entendo, que bom que está aqui, autocuidado é um detalhe tão importante na nossa vida! Não é?");
						perfil = ler.nextLine();

						System.out.println("Vamos lá, escolha o(s) dia(s) da semana que quer meditar EX: (QUA e SEX): ");
						dias = ler.nextLine();
						user.setRotina(dias);

						do {
							System.out.println("Me diga, quantos minutos por dia gostaria de meditar?: ");
							tempo1 = ler.nextInt();
							user.setTempo(tempo1);
							if (tempo1 <= 0) {
								System.out.println("Eita, você digitou alguma coisa que eu não consigo entender...");
							}
						} while (tempo1 <= 0);

						System.out.println("Seus dados foram alterados com sucesso!");
					} else {
						System.out.println("Cuidado, sua senha está incorreta");
					}
					break;
				default:
					break;
				}
			} while (resp != 0);
			{
				System.out.println("Valeu Valeu, até a próxima!");
			}
		} else {
			System.out.println("Deu ~bijuja~ oxe, assim não tem como entrar queridx");
		}
	} while (resp3 != user.getAcesso());
}

}
