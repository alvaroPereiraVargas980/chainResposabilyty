package com.company;

public class EmphyValidador implements ValidatorInputs {
    ValidatorInputs next;
    public EmphyValidador(ValidatorInputs nextAprobado){
        this.next= nextAprobado;
    }


    @Override
    public void isValidate(String n) {
        if (n.length() < 0) {
            System.out.println("el input esta vacio\n");
            next.isValidate(n);
        } else {
            System.out.println("el input no esta vacio\n");

        }

    }

}
