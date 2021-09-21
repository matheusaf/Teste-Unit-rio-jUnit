package com.teste.carteira;

public class PeriodicidadeCarteira {
	public PeriodicidadeCarteira() {

	}

	public int getPeriodoRenovacaoCarteira(int idade) {
		if (idade < 50)
			return 10;
		if (idade >= 50 && idade < 70)
			return 5;
		return 3;
	}
}