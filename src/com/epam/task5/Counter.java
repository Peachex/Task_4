package com.epam.task5;

public class Counter {
    private int currentState = 0;
    private int minLimit = 0;
    private int maxLimit = 0;

    public Counter() {
        this.currentState = 0;
        this.maxLimit = 10;
        this.minLimit = -10;
    }

    public Counter(int currentState, int minLimit, int maxLimit) {
        if (minLimit <= maxLimit && currentState >= minLimit && currentState <= maxLimit) {
            this.currentState = currentState;
            this.minLimit = minLimit;
            this.maxLimit = maxLimit;
        }
    }

    public void increase() {
        if (this.currentState < this.maxLimit) {
            this.currentState++;
        }
    }

    public void decrease() {
        if (this.currentState > this.minLimit) {
            this.currentState--;
        }
    }

    public void view() {
        System.out.println(
                "min/current/max: " + this.minLimit + "/" + this.currentState + "/" + this.maxLimit
        );
    }
}
