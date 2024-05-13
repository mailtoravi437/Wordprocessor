package org.example;

public class Letter {
    char c;
    String font;
    int fontSize;

    Letter(char c, String font, int fontSize) {
        this.c = c;
        this.font = font;
        this.fontSize = fontSize;
    }

    public void display(int x, int y) {
        System.out.println("Character: " + c + ", Font: " + font + ", Font Size: " + fontSize + ", X: " + x + ", Y: " + y);
    }
}
