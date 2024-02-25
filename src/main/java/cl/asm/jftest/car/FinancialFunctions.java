package cl.asm.jftest.car;

public class FinancialFunctions {

    //funcion interes 
    public static double computeSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time/100);
    }

}
