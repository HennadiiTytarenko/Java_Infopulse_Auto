package lesson02;

public class SuperString {

    public static void main(String[] args) {

        System.out.println(eachNth("Miracle", 2));
        System.out.println(eachNth("abcdefg", 2));
        System.out.println(eachNth("abcdefg", 3));

    }

    private static String eachNth(String str, int k) {
        String updated = "";
        for (int i = 0; i < str.length(); i += k) {
            char c = str.charAt(i);
            updated+= c;
        }
        return updated;
    }
}
