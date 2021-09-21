package com.mackenzie.ano;

public class ValidadorAno {
	public ValidadorAno() {
	}

	public String validarAno(int ano) {
		if (ano > 1900 && ano < 2020) {
			return "Ano válido";
		}
		return "Ano Inválido";
	}
}
