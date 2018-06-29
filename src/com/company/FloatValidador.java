package com.company;

public class FloatValidador implements ValidatorInputs {
     ValidatorInputs next;


    @Override
    public void isValidate(String n) {
        if(n.length()<0){
            System.out.println("el digito  es negativo\n");
           next.isValidate(n);
        }else{
            System.out.println("el digito  es positivo\n");

        }
    }
    public void setNext(ValidatorInputs nextAprobado) {

        this.next=nextAprobado;
    }




}

