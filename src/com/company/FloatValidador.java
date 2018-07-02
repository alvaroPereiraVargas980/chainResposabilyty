package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FloatValidador implements ValidatorInputs {
     ValidatorInputs next;

     public FloatValidador(ValidatorInputs nextAprobado){
         this.next=nextAprobado;
     }

    @Override
    public void isValidate(String n) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(n);
        if((n.length()<0)||(!m.find())){
            System.out.println("el digito  es negativo o no es numeral\n");
           next.isValidate(n);
        }else{
            System.out.println("el digito  es positivo\n");

        }
    }




}

