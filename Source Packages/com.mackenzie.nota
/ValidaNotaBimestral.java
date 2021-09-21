package com.mackenzie.nota;

public class ValidaNotaBimestral {
	public ValidaNotaBimestral() {
	}

	public String validaNota(int nota) {
		if (nota >= 0 && nota <= 10) {
			return "Nota válida";
		}
		return "Nota inválida";
	}
}