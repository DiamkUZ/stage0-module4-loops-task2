package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int evenCounter = 0;
        while (evenCounter <= printTillInclusive){
            System.out.println(evenCounter);
            evenCounter = evenCounter + 2;
        }
    }
}
