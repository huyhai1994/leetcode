package java_regex;

/***
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 */
public class MyRegex {
    String pattern =
            "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}"
                    + "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
}
