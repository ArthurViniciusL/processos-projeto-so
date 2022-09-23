package CPU;

public class Processo {

	private int id;
	private int qtdInstrucoes;

	public Processo(int quantidadeInstrucoes) {
		this.qtdInstrucoes = quantidadeInstrucoes;

		while (qtdInstrucoes != 0) {
			
			this.id += 1;
			System.out.println(toString());
			qtdInstrucoes -= 1;
			
			//sleep para exbir no terminal:
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return "Processo: [id = " + id + "]";
	}
}
