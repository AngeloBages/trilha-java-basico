
public class Elevador {

	static final int QUANTIDADE_ANDAR = 5;
	
	int andarAtual;
	int capacidadeMax;
	int ocupacaoAtual;
	
	public void Inicializar(int capacidadeMax, int andarAtual) {
		this.capacidadeMax = capacidadeMax;
		this.andarAtual = andarAtual;
	}
	
	public void Entra() {
		if(ocupacaoAtual < capacidadeMax) {
			ocupacaoAtual++;
			System.out.println("\n Pessoas no elevador: " + ocupacaoAtual);
		}else {
			System.out.println("\n O elevador já atingiu sua capacidade Máxima");
		}
	}
	
	public void Sai() {
		if(ocupacaoAtual >= 1) {
			ocupacaoAtual --;
			System.out.println("\n Pessoas no elevador: " + ocupacaoAtual);
		}else {
			System.out.println("\n Não há pessoas no elevador");
		}
	}
	
	public void Subir() {
		if(andarAtual < QUANTIDADE_ANDAR) {
			andarAtual++;
			System.out.println("\n O elevador está no andar " + andarAtual);
		}else {
			System.out.println("\n O elevador já alcançou o último andar");
		}
	}
	
	public void Descer() {
		if(andarAtual > 0) {
			andarAtual--;
			if(andarAtual != 0) {
				System.out.println("\n O elevador está no andar " + andarAtual);
			}else {
				System.out.println("\n O elevador está no Térreo");
			}
		}else {
			System.out.println("\n O elevador já alcançou o térreo");
		}
	}
}
