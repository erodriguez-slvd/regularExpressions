package org.solvd;
/*
Write a Java method that groups repeating characters in a String.
input:
 String input = "qqqqqqqweeeeerrtyyyyyyUUUUuuiTT";
output:
 "qwertyuit"

 .: Matches any single character.
\\1+: Refers to the first captured group (the character matched by .) and matches one or more occurrences of that character.
(.)\\1+: This entire expression captures a character (using .) and matches any number of consecutive repetitions of that character (\\1+).
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(groupRepeatedCharacters("qqqqqqqweeeeerrtyyyyyyUUUUuuiTT"));

    }
    public static String groupRepeatedCharacters(String input){
        //Use a regex to replace consecutive repeating characters with a single character
        return input.toLowerCase().replaceAll("(.)\\1+", "$1");
    }
}
