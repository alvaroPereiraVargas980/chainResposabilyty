package com.company;

public class generator implements rules {
    private rules next;

    @Override
    public rules getNext() {
        return next;
    }

    @Override
    public void isValidate(String n) {
//        lengthValidador le = new lengthValidador();
//        this.seNext(le);
//
        FloatValidador flo = new FloatValidador();
        this.seNext(flo);
        next.isValidate(n);
//
        emphyValidador emphty = new emphyValidador();
        this.seNext(emphty);
        next.isValidate(n);
//
//        RegExpressionValidador expre = new RegExpressionValidador();
//        this.seNext(expre);

        integerValidador integer = new integerValidador();
        this.seNext(integer);

        next.isValidate(n);
    }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }

    public static void main (String[] arg){
        generator val = new generator();
        val.isValidate("123");

    }

}
