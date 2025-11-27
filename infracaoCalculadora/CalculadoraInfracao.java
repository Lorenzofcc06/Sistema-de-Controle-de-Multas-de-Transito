package infracaoCalculadora;

import infracao.Infracao;

public interface CalculadoraInfracao {
	int calcularPontos(Infracao infracao);

	double calcularValor(Infracao infracao);
}
