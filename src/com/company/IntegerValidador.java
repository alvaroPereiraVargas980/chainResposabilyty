package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerValidador implements ValidatorInputs {
     ValidatorInputs next;
     public IntegerValidador(ValidatorInputs nextAprobado){
         this.next=nextAprobado;

     }

    @Override
    public void isValidate(String n) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(n);
        int count=0;
        while (m.find()){
            count++;
        }
        if(count!=n.length()){
            System.out.print("no es digito\n");
            next.isValidate(n);
        }else {
            System.out.print("digito\n");
//            next.isValidate(n);
        }

    }


}
