package org.example;

import org.example.validation.Validacion;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Validacion validacion = new Validacion();
        Scanner scn= new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        String n1 = scn.nextLine();

        System.out.println("Ingrese el segundo numero");
        String n2 = scn.nextLine();

        if (validacion.isNumeric(n1) && validacion.isNumeric(n2)){
            double op1= Double.parseDouble(n1);
            double op2= Double.parseDouble(n2);

            Operaciones op= new Operaciones(op1,op2);
            System.out.println("SUMA= "+op.sumar());
            System.out.println("RESTA= "+op.resta());
            System.out.println("ADICION= "+op.multiplicar());

            if (op2!=0){
                System.out.println("DIVICION= "+op.dividir());
            }else {
                System.out.println("¡ NO SE PUEDE DIVIDIR PARA 0!");
            }
        }
    }
}