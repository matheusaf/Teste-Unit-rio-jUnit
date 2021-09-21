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
        assertEquals("Nota Válida", _validaNotaBimestral.validaNota(0));
        assertEquals("Nota Válida", _validaNotaBimestral.validaNota(1));
        assertEquals("Nota Válida", _validaNotaBimestral.validaNota(9));
    }

    @Test
    public void testNotaInvalida(){
        assertEquals("Nota Inválida", _validaNotaBimestral.validaNota(-1));
        assertEquals("Nota Inválida", _validaNotaBimestral.validaNota(11));
    }
}