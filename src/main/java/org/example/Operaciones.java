package org.example;

import org.example.validation.Validacion;

public class Operaciones {
    private double num1;
    private double num2;

    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
        return this.num1 + this.num2;
    }

    public double resta(){
        return this.num1 - this.num2;
    }

    public double multiplicar(){
        return this.num1 * this.num2;
    }

    public Object dividir(){
        Validacion validarDiv = new Validacion();

        if (validarDiv.validacionDiv(this.num2)){
            return this.num1 / this.num2;
        }else {
            return false;
        }
    }
}
