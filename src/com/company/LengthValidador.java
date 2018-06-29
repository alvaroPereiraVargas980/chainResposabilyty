package com.company;

public class LengthValidador implements ValidatorInputs {
     ValidatorInputs next;

    @Override
    public void isValidate(String n) {

        if(n.length()<2000){
            System.out.println("la cadena tiene menos de 2000 caracteres");
            next.isValidate(n);
        }else{
            System.out.println("la cadena tiene mas de 2000 caracteres");
            //next.isValidate(n);
        }
    }
    @Override
    public void setNext(ValidatorInputs nextAprobado) {

        this.next=nextAprobado;
    }

}
