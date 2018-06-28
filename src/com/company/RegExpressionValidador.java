package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionValidador implements rules{
    private rules next;
    @Override
    public rules getNext() {
        return next;
    }
    @Override
    public void isValidate(String n) {
            Pattern k = Pattern.compile("[A-Za-z+ ]");
            Matcher m = k.matcher(n);
            int macher=0;
            while(m.find()){
                macher++;
            }
        if(macher!=n.length()){
           next.isValidate(n);
        }else {
            System.out.print("alfabetico\n");
        }
        }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }


}

