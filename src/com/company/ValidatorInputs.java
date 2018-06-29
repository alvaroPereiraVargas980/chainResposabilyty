package com.company;

interface Rules {

    public void isValidate(String n);
     public void setNext(Rules aprobado);
     Rules getNext();

}