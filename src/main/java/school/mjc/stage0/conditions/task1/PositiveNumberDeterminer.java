package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if (numberToBeDetermined > 0) {
            System.out.println("true");
        } else if(numberToBeDetermined < 0) {
            System.out.println("false");
        }else {
            System.out.println("false");
        }

    }
}
