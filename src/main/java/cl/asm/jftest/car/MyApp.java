package cl.asm.jftest.car;

public class MyApp {

    public static void main(String[] args) {
        //instanciar un objeto de tipo Fan
        Fan fan = new Fan();
        //encender el ventilador
        fan.turnOn();
        //apagar el ventilador
        fan.turnOff();
        
        //instanciar un objeto de tipo Dealership
        Dealership dealership = new Dealership();
        //instanciar un objeto de tipo Car
        Car car = new Car();
        //agregar un carro al concesionario
        dealership.addCar(car);
        //mostrar el carro
        dealership.showCar();
        //remover el carro
        dealership.removeCar();
        //mostrar el carro
        dealership.showCar();
    }

}
