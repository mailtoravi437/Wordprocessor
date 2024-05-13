package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Letter R = new Letter('R', "Arial", 12);
        R.display(0, 0);

        Letter A = new Letter('A', "Arial", 12);
        A.display(0, 6);

        Letter V = new Letter('V', "Arial", 12);
        V.display(0, 12);

        Letter I = new Letter('I', "Arial", 12);
        I.display(0, 18);
    }
}