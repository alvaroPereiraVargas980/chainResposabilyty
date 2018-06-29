package com.company;

public class lengthValidador implements rules {
    private rules next;

    @Override
    public rules getNext() {
        return next;
    }
    @Override
    public void isValidate(String n) {

        if(n.length()<2000){
            next.isValidate(n);
        }else{
            System.out.println("la cadena tiene mas de 2000 caracteres");
        }
    }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }


}
