package cl.asm.jftest.hr;

import cl.asm.jftest.hr.reporting.TimeCard;

public class Admin {

    public static void main(String[] args) {
        System.out.println("Admin main");
        //No es visuble por que se encuentra en otro paquete.
        //TimeCard.add(); el metodo tiene que ser public static
        TimeCard.add();
    }

}
