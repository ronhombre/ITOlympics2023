//Problem 5 - DIFFICULT
public class VigenereCipher {
    public static void main(String[] args) {
        String res = cipher("VIGENERECIPHER", "COUNTON");

        System.out.println(res);
    }

    public static String cipher(String in, String key) {
        String output = "";

        int max = getDistance('A', 'Z') + 1;
        int keyIndex = 0;
        for(char c : in.toCharArray()) {
            byte b = (byte) (((byte) 'A') + ((getDistance('A', c) + getDistance('A', key.charAt(keyIndex++))) % max));
            output += (char) b;
            keyIndex = keyIndex % key.length();
        }

        return output;
    }

    public static int getDistance(char a, char b) {
        return (byte) b - (byte) a;
    }
}
