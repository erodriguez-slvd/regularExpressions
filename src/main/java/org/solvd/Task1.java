package org.solvd;
/*
Write a Java method that validates whether an input string is a valid email address and matches the following pattern:
automation_XXXXXXXX_YYYYYY@solvd.com
where X - current date, Y - random letters or figures.
For example, automation_20240325_a1b2c3@solvd.com.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String email1 = "automation_20240325_a1b2c3@solvd.com";
        String email2 = "automation_20240325_@solvd.com";
        String email3 = "automation_20240325_a1b2c3@invalid.com";
        String email4 = "automation_20240325_a1b2c3@solvd.co";

        System.out.println(isValidInput(email1));
        System.out.println(isValidInput(email2));
        System.out.println(isValidInput(email3));
        System.out.println(isValidInput(email4));
    }
    /*
    ^starts with
    \\d matches exactly 8 digits [0-9]
    [a-zA-Z0-9] matches one or more alphanumeric characters (random letters or figures)
    @solvd\\.com matches the literal string "@solvd.com"
    $ end of the string
     */
    public static boolean isValidInput(String email){
        //create regular expression pattern
        String emailPattern = "^automation_\\d{8}_[a-zA-Z0-9]+@solvd\\.com$";
        //compile the pattern using Pattern class
        Pattern pattern = Pattern.compile(emailPattern);
        //match the email string against the pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
