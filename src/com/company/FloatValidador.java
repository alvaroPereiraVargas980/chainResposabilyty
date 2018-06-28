package com.company;

public class FloatValidador implements rules {
    private rules next;

    @Override
    public rules getNext() {
        return next;
    }

    @Override
    public void isValidate(String n) {
        if(n.length()<0){
           next.isValidate(n);
        }else{
            System.out.println("el digito  es positivo\n");
        }
    }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }


}
