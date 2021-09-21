package com.mackenzie.nota;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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