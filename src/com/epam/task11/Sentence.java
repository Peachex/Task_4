package com.epam.task11;

public class Sentence {
    private StringBuilder sentence = new StringBuilder();

    public Sentence(Word... words) {
        for (Word word : words) {
            this.sentence.append(word);
        }
    }

    public String toString() {
        return this.sentence + ".";
    }
}
