package com.company;

public class emphyValidador implements rules {
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
            System.out.println("el input no esta vacio\n");
        }

    }

    @Override
    public void seNext(rules aprobado) {
        next=aprobado;
    }
}
