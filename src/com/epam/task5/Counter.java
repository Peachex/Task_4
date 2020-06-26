package com.epam.task5;

public class Counter {
    private int currentState;
    private int maxLimit;
    private int minLimit;

    public Counter() {
        this.currentState = 0;
        this.maxLimit = 10;
        this.minLimit = -10;
    }

    public Counter(int currentState, int maxLimit, int minLimit) {
        if (maxLimit >= minLimit) {
            this.maxLimit = maxLimit;
        } else {
            this.maxLimit = minLimit;
        }

        if (minLimit <= maxLimit) {
            this.minLimit = minLimit;
        } else {
            this.minLimit = maxLimit;
        }

        if (currentState >= this.minLimit && currentState <= this.maxLimit) {
            this.currentState = currentState;
        } else {
            this.currentState = (this.minLimit + this.maxLimit) / 2;
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

    public int getCurrentState() {
        return currentState;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }
}
