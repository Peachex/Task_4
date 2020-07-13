package com.epam.task11;

public class Text {
    private StringBuilder text = new StringBuilder();
    private String title;

    public Text(String title, Sentence... sentences) {
        this.title = title;

        for (Sentence sentence : sentences) {
            this.text.append(sentence);
        }
    }

    public void viewTitle() {
        System.out.println(this.title);
    }

    public void viewText() {
        System.out.println(this.text);
    }

    public void addSentences(Sentence... sentences) {
        for (Sentence sentence : sentences) {
            this.text.append(sentence);
        }
    }

    public String toString() {
        return this.text + "\n";
    }
}
