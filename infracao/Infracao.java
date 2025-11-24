package infracao;

import veiculo.Veiculo;

public class Infracao {
	private TipoInfracao tipo;
	private Veiculo veiculo;

	public Infracao(TipoInfracao tipo, Veiculo veiculo) {
		this.tipo = tipo;
		this.veiculo = veiculo;
	}

	public TipoInfracao getTipo() {
		return tipo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
}
