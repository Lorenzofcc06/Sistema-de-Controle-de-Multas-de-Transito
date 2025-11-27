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

		RegistroInfracao registro = new RegistroInfracao(new CalculadoraInfracaoPadrao(),
				new AvaliadorSituacaoCnhPadrao());

		Motorista motorista = new Motorista("Lorenzo Facco", "123456789");
		Veiculo veiculo = new Veiculo("LLL4444", "Golf", motorista);

		Infracao infracaoGrave = new Infracao(TipoInfracao.GRAVE, veiculo);
		registro.registrarInfracao(infracaoGrave);

		Infracao infracaoLeve = new Infracao(TipoInfracao.LEVE, veiculo);
		registro.registrarInfracao(infracaoLeve);

		int pontos = motorista.getPontosAcumulados();
		SituacaoCnh situacao = registro.consultarSituacao(motorista);

		System.out.println("Pontos do motorista: " + pontos);
		System.out.println("Situação da CNH: " + situacao);
	}
}