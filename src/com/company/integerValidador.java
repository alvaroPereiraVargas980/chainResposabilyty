package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class integerValidador implements rules {
    private rules next;

    @Override
    public rules getNext() {
        return next;
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
            next.isValidate(n);
        }else {
            System.out.print("digito\n");
        }

    }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }


}
