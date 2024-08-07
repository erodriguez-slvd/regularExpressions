package org.solvd;
/*
Write a Java method that extracts values from a simple JSON and works with different types.
input:
    String json = "{"key1": 11, "key2": 'asd', "key3": 342}";
    String keyToExtract = "key3";
output:
    342
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(extractValue("{\"key1\": 11, \"key2\": 'asd', \"key3\": 342}","key3"));
    }

    public static String extractValue(String json, String key){
        //create regular expression pattern
        String regex = "\"" + key + "\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)";
        //compile the pattern using Pattern class
        Pattern pattern = Pattern.compile(regex);
        //match the JSON string against the pattern
        Matcher matcher = pattern.matcher(json);

        if (matcher.find()){
            String value = json.substring(matcher.start(), matcher.end()).trim().replaceAll("'", "");
            return value;
        }
        return "";
    }
}
