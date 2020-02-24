package Interwiev_Question;



public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(   FrequencyOfChars("ABCDAABC"));

    }

    public static String FrequencyOfChars(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (!s.contains("" + str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            result += "" + s.charAt(i) + count;
        }
        return result;
    }
}





