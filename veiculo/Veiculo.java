package veiculo;

import motorista.Motorista;

public class Veiculo {
	private String placa;
	private String modelo;
	private Motorista responsavel;

	public Veiculo(String placa, String modelo, Motorista responsavel) {
		this.placa = placa;
		this.modelo = modelo;
		this.responsavel = responsavel;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public Motorista getResponsavel() {
		return responsavel;
	}
}
