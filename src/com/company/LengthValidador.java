package com.company;

public class LengthValidador implements ValidatorInputs {
     ValidatorInputs next;
     public LengthValidador(ValidatorInputs nextAprobado){
         this.next=nextAprobado;
     }

    @Override
    public void isValidate(String n) {

        if(n.length()<2000){
            System.out.println("la cadena tiene menos de 2000 caracteres");
            next.isValidate(n);
        }else{
            System.out.println("la cadena tiene mas de 2000 caracteres");
//            next.isValidate(n);
        }
    }


}
