package com.epam.task11;

public class Sentence {
    private Word[] words;

    public Sentence(Word... words) {
        this.words = words;
    }

    public Word[] getWords() {
        return this.words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : this.words) {
            sb.append(word);
        }
        return sb.toString() + ".";
    }
}
