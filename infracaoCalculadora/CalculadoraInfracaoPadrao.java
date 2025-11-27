package infracaoCalculadora;

import infracao.Infracao;

public class CalculadoraInfracaoPadrao implements CalculadoraInfracao {
	@Override
	public int calcularPontos(Infracao infracao) {
		return infracao.getTipo().getPontos();
	}

	@Override
	public double calcularValor(Infracao infracao) {
		return infracao.getTipo().getValor();
	}
}
