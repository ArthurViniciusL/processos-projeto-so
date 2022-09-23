package CPU;

import java.util.Random;

public class GeradorDeProcessos {

	public int qtdInstrucoesMin = 10;
	public int qtdInstrucoesMax = 50;

	public GeradorDeProcessos(int qtdProcessos) {

		for (int i = 0; i < qtdProcessos; i++) {
			System.out.println("Processo " + (i++));

			Random random = new Random();
			int QtdInstruções = random.nextInt((qtdInstrucoesMax - qtdInstrucoesMin) + 1) + qtdInstrucoesMin;

			Processo novoProcesso = new Processo(QtdInstruções);
		}

	}

}
