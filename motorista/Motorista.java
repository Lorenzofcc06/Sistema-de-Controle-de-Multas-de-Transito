package motorista;

public class Motorista {
	private String nome;
	private String cnh;
	private int pontosAcumulados;

	public Motorista(String nome, String cnh) {
		this.nome = nome;
		this.cnh = cnh;
		this.pontosAcumulados = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getCnh() {
		return cnh;
	}

	public int getPontosAcumulados() {
		return pontosAcumulados;
	}

	public void adicionarPontos(int pontos) {
		pontosAcumulados += pontos;
	}
}
