package org.solvd;
/*
Write a Java method that extracts value from a String between square brackets.
input:
    String input = "ignore me [extract:me] ignore me!";
output:
    "extract:me"

\\[ matches the opening square bracket [.
(.*?) is a non-greedy match that captures any characters between the brackets. The .*? ensures that it stops at the first closing bracket.
\\] matches the closing square bracket ].
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(extractText("ignore me [extract:me] ignore me!"));
    }

    public static String extractText(String input) {
        String regexPattern = "\\[(.*?)\\]";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group(1); // If there is a match, return the content within the first pair of square brackets
        } else {
            return null;
        }
    }
}
