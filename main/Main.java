package main;

import cnhSituacao.AvaliadorSituacaoCnhPadrao;
import cnhSituacao.SituacaoCnh;
import infracao.Infracao;
import infracao.TipoInfracao;
import infracaoCalculadora.CalculadoraInfracaoPadrao;
import motorista.Motorista;
import reigstroInfracao.RegistroInfracao;
import veiculo.Veiculo;

public class Main {
	public static void main(String[] args) {

		RegistroInfracao service = new RegistroInfracao(new CalculadoraInfracaoPadrao(),
				new AvaliadorSituacaoCnhPadrao());

		Motorista motorista = new Motorista("João Silva", "123456789");
		Veiculo veiculo = new Veiculo("ABC1234", "Corsa", motorista);

		Infracao infracaoGrave = new Infracao(TipoInfracao.GRAVE, veiculo);
		service.registrarInfracao(infracaoGrave);

		Infracao infracaoLeve = new Infracao(TipoInfracao.LEVE, veiculo);
		service.registrarInfracao(infracaoLeve);

		int pontos = motorista.getPontosAcumulados();
		SituacaoCnh situacao = service.consultarSituacao(motorista);

		System.out.println("Pontos do motorista: " + pontos);
		System.out.println("Situação da CNH: " + situacao);
	}
}