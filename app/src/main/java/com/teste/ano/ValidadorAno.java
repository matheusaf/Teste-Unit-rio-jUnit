package com.teste.ano;

public class ValidadorAno {
	public ValidadorAno() {
	}

	public String validaAno(int ano) {
		if (ano > 1900 && ano < 2020) {
			return "Ano Válido";
		}
		return "Ano Inválido";
	}
}
