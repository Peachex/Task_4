package com.epam.task11;

/* 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
   консоль текст, заголовок текста. */
public class Main {
    public static void main(String[] args) {
        Text text = new Text("MY TEXT",
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("first"), new Word("sentence")),
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("second"), new Word("sentence")),
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("third"), new Word("sentence")),
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("fourth"), new Word("sentence")),
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("fifth"), new Word("sentence")),
                new Sentence(new Word("This"), new Word("is"), new Word("the"), new Word("last"), new Word("sentence")));

        System.out.print("Title: ");
        text.viewTitle();

        System.out.println("\nBefore adding:");
        text.viewText();

        text.addSentences(new Sentence(new Word("This"), new Word("sentence"), new Word("was"), new Word("added")));

        System.out.println("\nAfter adding:");
        text.viewText();
    }
}
