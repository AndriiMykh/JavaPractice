package org.krzysiu.reverseapp;

import static org.krzysiu.reverseapp.AnagramMaker.ReverseOnlyLetters;
import static org.krzysiu.reverseapp.AnagramMaker.ReverseText;

public class ReverseTextApp {

    public static void main(String[] args) {
        String textToReverse = "a1bcd efg!h";
        System.out.println(ReverseOnlyLetters(textToReverse));
    }
}
