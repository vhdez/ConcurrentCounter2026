//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Counter myCounter = new Counter();

    Incrementer incrementer1 = new Incrementer(myCounter);
    Decrementer decrementer1 = new Decrementer(myCounter);

    Thread incrementerThread = new Thread(incrementer1);
    Thread decrementerThread = new Thread(decrementer1);

    incrementerThread.start();
    decrementerThread.start();
}
