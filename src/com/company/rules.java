package com.company;

interface rules{
    public void isValidate(String n);
    public void seNext(rules aprobado);
    public rules getNext();

}