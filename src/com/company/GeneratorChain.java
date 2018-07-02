package com.company;
import java.io.*;
import java.util.*;
public class GeneratorChain {
    ValidatorInputs next1;

    public static void main (String[] arg){
        GeneratorChain val = new GeneratorChain();
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un dato");
        String value=sc.nextLine();
//aqui va el orden de las respectivas validaciones
        EmphyValidador emphy= new EmphyValidador(val.next1);
      RegExpressionValidador reg= new RegExpressionValidador(val.next1=emphy);
      IntegerValidador integer = new IntegerValidador(val.next1=reg);
      FloatValidador flo = new FloatValidador(val.next1=integer);
      LengthValidador leng= new LengthValidador(val.next1=flo);
      leng.isValidate(value);

    }
}
