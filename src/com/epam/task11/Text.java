package com.epam.task11;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;
    private String title;

    public Text(String title, Sentence... sentences) {
        this.title = title;
        this.sentences = sentences;
    }

    public Sentence[] getSentences() {
        return this.sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void viewTitle() {
        System.out.println(this.title);
    }

    public void viewText() {
        System.out.println(this.toString());
    }

    public void addSentences(Sentence... sentences) {
        this.sentences = Arrays.copyOf(this.sentences, this.sentences.length + sentences.length);
        System.arraycopy(sentences,0, this.sentences, this.sentences.length - sentences.length, sentences.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : this.sentences) {
            sb.append(sentence);
        }
        return (sb.toString() + "\n").trim();
    }
}
