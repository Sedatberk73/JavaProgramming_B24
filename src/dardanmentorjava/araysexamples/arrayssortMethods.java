package dardanmentorjava.araysexamples;

public class arrayssortMethods {
    public static void main(String[] args) {
        System.out.println(st("aaabbbcc"));
    }

    public static String st(String str) {

        String countLetters = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!unique.contains("" + str.charAt(i))) {
                unique += str.charAt(i);
            }
        }

        for (int k = 0; k < unique.length(); k++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (unique.charAt(k) == str.charAt(j)) {
                    count++;
                }
            }
            countLetters += count + "" + unique.charAt(k);
        }

        return countLetters;
    }
}