package reigstroInfracao;

import cnhSituacao.AvaliadorSituacaoCnh;
import cnhSituacao.SituacaoCnh;
import infracao.Infracao;
import infracaoCalculadora.CalculadoraInfracao;
import motorista.Motorista;

public class RegistroInfracao {
	private CalculadoraInfracao calculadora;
	private AvaliadorSituacaoCnh avaliador;

	public RegistroInfracao(CalculadoraInfracao calculadora, AvaliadorSituacaoCnh avaliador) {
		this.calculadora = calculadora;
		this.avaliador = avaliador;
	}

	public void registrarInfracao(Infracao infracao) {
		Motorista motorista = infracao.getVeiculo().getResponsavel();
		int pontos = calculadora.calcularPontos(infracao);
		motorista.adicionarPontos(pontos);
	}

	public SituacaoCnh consultarSituacao(Motorista motorista) {
		return avaliador.avaliar(motorista);
	}
}
