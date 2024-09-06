package cl.asm.jftest.assest.zo829;

public class TestPrincipal {

    public void test() {

        System.out.println("***********TestPrincipal.test()********");

        System.out.println("Hello World");
        final int score1 = 8, score2 = 3;
        char myScore = 7;
        var goal = switch(myScore){
            default -> "bad";
            case score1 -> "great";
            case 2,4,6 -> "good";
            case score2, 0 -> "not bad";
        };
        System.out.println(goal);
        

    }

}
