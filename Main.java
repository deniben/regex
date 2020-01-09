package forlearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*Regex expression
        (-|\\+)? - can be minus or plus or nothing
        */
        Pattern pattern = Pattern.compile("(-|\\+)?\\d+");
        Matcher m = pattern.matcher("+380923370349");
        System.out.println(m.matches());

        Pattern numberPattern = Pattern.compile("((\\+)?380)[0-9]{9}");
        Matcher matcher = numberPattern.matcher("380992370349");
        System.out.println("-3829".matches("(-|\\+)?\\d+"));
        System.out.println("3829".matches("(-|\\+)?\\d+"));
        System.out.println("Valid number: " + matcher.matches());


        //Задача выражение сделать, которая начинаеться с прописной и завершаеться точкой
        String word = "legacy of discord the MMORPG game that i have never seen.";
        System.out.println(word.matches("[a-z]+\\w+$\\."));

        System.out.println("Valid ETH address: "+"0xDB4C68A90DCb2915dc5c4BE54D213666E20736d9".matches("(0x)[a-zA-Z0-9]{40}"));

    }
}
