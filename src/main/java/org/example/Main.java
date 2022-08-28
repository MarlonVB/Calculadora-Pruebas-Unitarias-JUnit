package org.example;

import org.example.validation.Validacion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Validacion validacion = new Validacion();
        Scanner scn = new Scanner(System.in);
        String n1, n2;

        // * Valido que los datos no sean nulos
        do{
            System.out.println("Ingrese el primer numero");
            n1 = scn.nextLine();

            if (!validacion.ingresoObligatorio(n1)){
                System.out.println("DEBE INGRESAR UN VALOR");
            }else {
                // * Valido que los datos sean numericos
                if (!validacion.isNumeric(n1)){
                    System.out.println("LOS DATOS INGRESADOS DEBEN SER NUMERICOS");
                }else {
                    // * Valido que los datos no se mayores a 100000
                    if (!validacion.validarMayorque(n1)){
                        System.out.println("NO PUEDE INGRESAR VALORES MAYORES A 100000");
                    }
                }
            }
        }while (!validacion.ingresoObligatorio(n1) || !validacion.isNumeric(n1)|| !validacion.validarMayorque(n1));

        do{
            System.out.println("Ingrese el segundo numero");
            n2 = scn.nextLine();
            if (!validacion.ingresoObligatorio(n2)){
                System.out.println("DEBE INGRESAR UN VALOR");
            }else {
                if (!validacion.isNumeric(n2)){
                    System.out.println("LOS DATOS INGRESADOS DEBEN SER NUMERICOS");
                }else {
                    if (!validacion.validarMayorque(n2)){
                        System.out.println("NO PUEDE INGRESAR VALORES MAYORES A 100000");
                    }
                }
            }
        }while (!validacion.ingresoObligatorio(n2) || !validacion.isNumeric(n2) || !validacion.validarMayorque(n2));

        double op1= Double.parseDouble(n1);
        double op2= Double.parseDouble(n2);

        Operaciones op= new Operaciones(op1,op2);
        System.out.println("SUMA= "+op.sumar());
        System.out.println("RESTA= "+op.resta());
        System.out.println("ADICION= "+op.multiplicar());

        // * En el caso de la division valido que no pueda divirse para 0
        if (op2!=0){
            System.out.println("DIVISION= "+op.dividir());
        }else {
            System.out.println("¡ NO SE PUEDE DIVIDIR PARA 0!");
        }
    }
}