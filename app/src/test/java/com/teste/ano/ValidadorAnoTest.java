package com.teste.ano;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorAnoTest{
    private ValidadorAno _validadorAno;

    public ValidadorAnoTest(){
        _validadorAno = new ValidadorAno();
    }

    @Test
    public void testAnoValido(){
        assertEquals("Ano Inválido", _validadorAno.validaAno(2020));
    }

    @Test
    public void testAnoInvalido(){
        assertEquals("Ano Válido", _validadorAno.validaAno(2021));
    }
}