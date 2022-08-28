package org.example.validation;

public class Validacion {
    public boolean isNumeric(String num){
        try {
            String num_replace = num.replace(",", ".");
            Double.parseDouble(num_replace);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }

    public boolean validacionDiv(double n2){
        if (n2!=0){
            return true;
        }else {
            return false;
        }
    }
}
