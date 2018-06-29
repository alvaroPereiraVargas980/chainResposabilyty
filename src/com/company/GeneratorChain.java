package com.company;
import java.io.*;
import java.util.*;
public class GeneratorChain {
    ValidatorInputs next1;

    public  GeneratorChain() {
     this.next1=new EmphyValidador();
    ValidatorInputs next2= new FloatValidador();
    ValidatorInputs next3=new LengthValidador();
    ValidatorInputs next4=new RegExpressionValidador();
    ValidatorInputs next5= new IntegerValidador();
        next1.setNext(next4);
//        next4.setNext(next2);
//        next2.setNext(next5);
//        next5.setNext(next3);
}
    public static void main (String[] arg){
        GeneratorChain val = new GeneratorChain();
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un dato");
        String value=sc.nextLine();
        val.next1.isValidate(value);



    }
}
