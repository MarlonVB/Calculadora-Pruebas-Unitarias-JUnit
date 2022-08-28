package org.example;

import org.example.validation.Validacion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.*;

public class OperacionesTest {

    Map<String, Object> mapResult= Map.of(
            "Suma", 13.0,
            "Resta", -3.0,
            "Miltiplicacion", 40.0,
            "Divicion", 0.625,
            "Validacion", true);
    double sumaReturn, restaReturn, multReturn;
    Object divReturn;

    @Before
    public void validation(){
        String n1= "3";
        String n2= "3,8";
        Validacion validacion = new Validacion();
        boolean v1 = validacion.isNumeric(n1);
        assertEquals("No Cumple",true, v1);
        boolean v2 = validacion.isNumeric(n2);
        assertEquals("No cumple",true, v2);
    }

    @Test
    public void sumar() {
        Operaciones operaciones= new Operaciones(5,8);
        sumaReturn = operaciones.sumar();
        assertEquals(mapResult.get("Suma"), sumaReturn);
    }

    @Test
    public void resta() {
        Operaciones operaciones= new Operaciones(5,8);
        restaReturn = operaciones.resta();
        assertEquals(mapResult.get("Resta"), restaReturn);
    }

    @Test
    public void multiplicar() {
        Operaciones operaciones= new Operaciones(5,8);
        multReturn = operaciones.multiplicar();
        assertEquals(mapResult.get("Miltiplicacion"), multReturn);
    }

    @Test
    public void dividir() {
        Operaciones operaciones= new Operaciones(5,8);
        divReturn = operaciones.dividir();
        assertEquals(mapResult.get("Divicion"),divReturn);
    }
}