package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionValidador implements ValidatorInputs {
     ValidatorInputs next;

    @Override
    public void isValidate(String n) {
            Pattern k = Pattern.compile("[A-Za-z+ ]");
            Matcher m = k.matcher(n);
            int macher=0;
            while(m.find()){
                macher++;
            }
        if(macher!=n.length()){
            System.out.print("no es alfabetico\n");
           next.isValidate(n);
        }else {
            System.out.print("alfabetico\n");
//            next.isValidate(n);
        }
        }
    @Override
    public void setNext(ValidatorInputs nextAprobado) {

        this.next=nextAprobado;
    }
}

