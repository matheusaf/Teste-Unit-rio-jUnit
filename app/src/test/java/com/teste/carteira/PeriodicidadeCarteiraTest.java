package com.teste.carteira;

import org.junit.Test;
import static org.junit.Assert.*;

public class PeriodicidadeCarteiraTest{
    private PeriodicidadeCarteira _periodicidadeCarteira;

    public PeriodicidadeCarteiraTest(){
        _periodicidadeCarteira = new PeriodicidadeCarteira();
    }

    @Test
    public void testRenoavacao10(){
       assertEquals(10, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(49));
    }

    @Test
    public void testRenoavacao5(){
        assertEquals(6, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(50));
        assertEquals(5, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(69));
    }

    @Test
    public void testRenoavacao3(){
        assertEquals(3, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(70));
        assertEquals(3, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(71));
    }

}