package cl.asm.jftest.car;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private List<Car> cars = new ArrayList<>();
    
    public void addCar(Car car){        
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2015;
        cars.add(car);
    }

    public void removeCar(){
        cars.remove(0);
    }

    public void showCar(){
        for(Car car: cars){
            System.out.println("Make: "+car.make);
            System.out.println("Model: "+car.model);
            System.out.println("Year: "+car.year);
        }
    }

}
