package cl.asm.jftest;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

import cl.asm.jftest.car.Car;
import cl.asm.jftest.car.Dealership;
import cl.asm.jftest.car.Fan;
import cl.asm.jftest.car.FinancialFunctions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Dealership dealer = new Dealership();
                
        //Se crea el objeto auto
        //Car car = new Car();        
        //instanciamos un objeto de la clase Car
        dealer.addCar(new Car());
        assertTrue(true);
        //Se llama al metodo addCar
        dealer.showCar();
        
        //instanciamos un objeto de la clase Fan
        Fan fan = new Fan();
        //llamamos al metodo turnOn
        fan.turnOn();
        //llamamos al metodo turnOff
        fan.turnOff();

        double interest = FinancialFunctions.computeSimpleInterest(1, 10, 1);
        Logger.getGlobal().info("Interest: " + interest);

        assertTrue( true );
    }
}
