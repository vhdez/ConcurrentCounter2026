public class Decrementer implements Runnable {
    Counter sharedCounter;

    Decrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    public void run() {
        for (int i = 0; i < 105; i = i + 1) {
            System.out.println(sharedCounter.decrement());
        }
    }
}
