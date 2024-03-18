package cl.asm.jftest.claseB;

import cl.asm.jftest.claseA.ClaseA;

public class ClaseB {

    static int valorB = 0;
    int valorC;

    public static void main(String[] args) {
        ClaseA obj1 = new ClaseA();
        //el atributo no es visible al no estar en el mismo packete.
        System.out.println("valorA = " + ClaseA.valorA);
    }
    
}
