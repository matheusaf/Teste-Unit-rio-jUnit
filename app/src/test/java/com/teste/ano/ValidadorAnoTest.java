package com.teste.ano;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorAnoTest{
    private ValidadorAno _validadorAno;

    public ValidadorAnoTest(){
        _validadorAno = new ValidadorAno();
    }

    @Test
    public void testAnoValido(){
        assertEquals("Ano Válido", _validadorAno.validaAno(1900));
        assertEquals("Ano Válido", _validadorAno.validaAno(1901));
        assertEquals("Ano Válido", _validadorAno.validaAno(2019));
        assertEquals("Ano Válido", _validadorAno.validaAno(2020));
    }

    @Test
    public void testAnoInvalido(){
        assertEquals("Ano Inválido", _validadorAno.validaAno(1899));
        assertEquals("Ano Inválido", _validadorAno.validaAno(2021));
    }
}