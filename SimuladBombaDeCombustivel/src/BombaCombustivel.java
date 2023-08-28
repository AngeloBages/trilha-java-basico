
public class BombaCombustivel {

	String tipoCombustivel;
	int valorLitro;
	int quantidade;
	
	public BombaCombustivel(String tipoCombustivel, int valorLitro, int quantidade) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.quantidade = quantidade;
	}
	
	public double abastecerPorValor(int valor) {
		double quantidadeAbastecida = valor/valorLitro;
		return quantidadeAbastecida;
	}
	
	public double abastecerPorLitro(int litro) {
		double valorPago = litro * valorLitro;
		return valorPago;
	}
	
	public void alterarValor(int valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public void alterarQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void alterarTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
}
