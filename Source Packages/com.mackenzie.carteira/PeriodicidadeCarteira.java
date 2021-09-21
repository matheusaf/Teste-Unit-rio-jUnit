package com.mackenzie.carteira;

public class PeriodicidadeCarteira {
	public PeriodicidadeCarteira() {

	}

	public int getPeriodoRenoavacaoCarteira(int idade) {
		if (idade < 50)
			return 10;
		if (idade >= 50 && idade < 70)
			return 5;
		if (idade >= 70)
			return 3;
		return -1;
	}
}