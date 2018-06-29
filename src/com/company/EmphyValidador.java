package com.company;

public class EmphyValidador implements ValidatorInputs {
    ValidatorInputs next;


    @Override
    public void isValidate(String n) {
        if (n.length() < 0) {
            System.out.println("el input esta vacio\n");
            next.isValidate(n);
        } else {
            System.out.println("el input no esta vacio\n");
            next.isValidate(n);
        }

    }
    @Override
    public void setNext(ValidatorInputs nextAprobado) {

        this.next = nextAprobado;
    }

}
