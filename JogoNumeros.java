package exercicioLeucio;

import java.util.Random;
import java.util.Scanner;

public class JogoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Random g = new Random();

		int numRandom;
		int numTent = 0;

		numRandom = g.nextInt(49);

		numRandom += 1;

		for (int numUser = 0; numUser != numRandom; numTent++) {
			System.out.println("escolha um número entre 1 e 50");
			numUser = ler.nextInt();

			if (numUser < numRandom) {
				System.out.println("tente número maior");

			} else if (numUser > numRandom) {
				System.out.println("tente um número menor");

			} else {
				System.out.println("acertou");
				System.out.println("número de tentativas: " + (numTent + 1));
			}

		}

	}

}
