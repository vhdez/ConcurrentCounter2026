public class Incrementer implements Runnable {
    Counter sharedCounter;

    Incrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    public void run() {
        for (int i = 0; i < 105; i = i + 1) {
            System.out.println("INC: " + sharedCounter.increment());
        }
    }
}
