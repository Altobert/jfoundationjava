package cl.asm.jftest.car;

public class Fan implements Switcheable{

    boolean isOn;

    @Override
    public void turnOn() {
        //ejecutar todo lo que necesite para encender el ventilador
        isOn = true;
        System.out.println("Encendiendo ventilador");
    }

    @Override
    public void turnOff() {
        //ejecutar todo lo que necesite para apagar el ventilador
        isOn = false;
        System.out.println("Apagando ventilador");
    }
    
}
