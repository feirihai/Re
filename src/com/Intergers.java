package com;

public class Intergers {
    public void process(int []target,Commend cmd){
        cmd.process(target);
    }
    public static void main(String[] args){
        int []target = {1,-2,9,-3};
        Intergers intergers = new Intergers();
        intergers.process(target,new AddCommend());
    }
}
