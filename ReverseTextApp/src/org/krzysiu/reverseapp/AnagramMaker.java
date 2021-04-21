package org.krzysiu.reverseapp;


public class AnagramMaker {
    public static String ReverseText(String inputText){
        StringBuilder reversedText = new StringBuilder(inputText);
        return reversedText.reverse().toString();
    }

    public static String ReverseOnlyLetters(String inputText){
        String temporary = GetLettersFromString(inputText);
        temporary = ReverseText(temporary);
        return ReplaceLetters(inputText, temporary);
    }

    private static String ReplaceLetters(String originalString, String lettersForReplace) {
        int indexLettersForReplace = 0;
        StringBuilder output = new StringBuilder(originalString);
        for(int indexPlaceToReplace = 0; indexPlaceToReplace < originalString.length(); indexPlaceToReplace++){
            if(isItLetter(originalString.charAt(indexPlaceToReplace))){
                output.setCharAt(indexPlaceToReplace, lettersForReplace.charAt(indexLettersForReplace));
                indexLettersForReplace++;
            }
        }
        return output.toString();
    }

    private static boolean isItLetter(char inputCharacter) {
        return inputCharacter >= 65 && inputCharacter <= 90 || inputCharacter >= 97 && inputCharacter <= 122;
    }


    private static String GetLettersFromString(String inputText) {
        return inputText.replaceAll("[^A-Za-z]+","");
    }
    
    
}
