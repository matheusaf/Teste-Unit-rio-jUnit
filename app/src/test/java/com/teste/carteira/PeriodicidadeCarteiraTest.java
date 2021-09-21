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
       assertEquals(10, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(80));
    }

    @Test
    public void testRenoavacao5(){
        assertEquals(10, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(80));
    }

    @Test
    public void testRenoavacao3(){
        assertEquals(10, _periodicidadeCarteira.getPeriodoRenovacaoCarteira(80));
    }

}