package cnhSituacao;

import motorista.Motorista;

public class AvaliadorSituacaoCnhPadrao implements AvaliadorSituacaoCnh {
	@Override
	public SituacaoCnh avaliar(Motorista motorista) {
		int pontos = motorista.getPontosAcumulados();
		if (pontos < 10)
			return SituacaoCnh.REGULAR;
		else if (pontos < 20)
			return SituacaoCnh.EM_RISCO;
		else
			return SituacaoCnh.SUSPENSA;
	}
}
