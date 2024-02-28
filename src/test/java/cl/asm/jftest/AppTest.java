package cl.asm.jftest;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

import cl.asm.jftest.car.Account;
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

    @Test
    public void testAccount()
    {
        Account account = new Account();
        account.accountNumber="01";

        Account.numberOfAccounts = Account.numberOfAccounts + 1;

        Logger.getGlobal().info("Numero de cuenta: " + account.accountNumber);
        Logger.getGlobal().info("Numero cuenta creada: " + Account.numberOfAccounts);

        Account account2 = new Account();
        account2.accountNumber="02";
        Account.numberOfAccounts = Account.numberOfAccounts + 1;

        Logger.getGlobal().info("Numero de cuenta: " + account2.accountNumber);
        Logger.getGlobal().info("Numero cuenta creada: " + Account.numberOfAccounts);
        assertTrue( true );
    }

    @Test
    public void testStudent(){
        //instanciamos un objeto de la clase Student
        //FQCN: cl.asm.jftest.student.Student
        cl.asm.jftest.student.Student student = new cl.asm.jftest.student.Student("01");
        System.out.println(student.toString());
        cl.asm.jftest.student.Student student2 = new cl.asm.jftest.student.Student("02");
        System.out.println(student2.toString());
        cl.asm.jftest.student.Student student3 = new cl.asm.jftest.student.Student("03");
        System.out.println(student3.toString());
        assertTrue( true );
    }
}
