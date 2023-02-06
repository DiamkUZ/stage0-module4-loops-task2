package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            boolean isPrimal = true;
            int testCounter = 2;
            while (testCounter < counter) {
                if (counter % testCounter == 0) {
                    isPrimal = false;
                }
                testCounter++;
            }
            if (isPrimal ) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
