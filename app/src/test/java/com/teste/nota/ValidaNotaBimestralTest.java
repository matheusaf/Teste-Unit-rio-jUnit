package com.teste.nota;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidaNotaBimestralTest{
    private ValidaNotaBimestral _validaNotaBimestral;
    
    public ValidaNotaBimestralTest(){
        _validaNotaBimestral = new ValidaNotaBimestral();
    }

    @Test
    public void testNovaValida(){
        assertEquals("Nota Válida", _validaNotaBimestral.validaNota(10));
    }

    @Test
    public void testNotaInvalida(){
        assertEquals("Nota Inválida", _validaNotaBimestral.validaNota(11));
    }
}