public class Counter {
    // value has to stay between 0 and 100

    Integer value;

    Counter() {
        value = 0;
    }

    Object increment() {
        if (value < 100) {
            value = value + 1;
            return value;
        } else {
            return null;
        }
    }

    Object decrement() {
        if (value > 0) {
            value = value - 1;
            return value;
        } else {
            return null;
        }
    }
}
