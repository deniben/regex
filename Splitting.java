package forlearn;

import java.util.Arrays;

public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you mast " +
            "cut down the mightiest tree in the forest " +
            "with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");//выражение может не содержать специальных символов
        split("\\W+"); // \W - символ не являющийся символом слова по другому [^\W], но здесь еще +
        split("n\\W+");
        split(",\\s");
        split("(you|the)");

        System.out.println(knights.replace("f\\w+", "located"));
        System.out.println(knights.replaceAll("shrubbery|tree|herring","banana"));
    }
}
