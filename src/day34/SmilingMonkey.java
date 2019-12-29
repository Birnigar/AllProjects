package day34;

public class SmilingMonkey {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, false));

        System.out.println(monkeyTrouble3(true,false));

            }

    /**
     * A method that return true only if both monkeys are smiling or not smiling
     *
     * @param aSmile first monkey smile or not
     * @param bSmile second monkey smile or not
     * @return true only if both monkeys are smiling or not smiling
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        }
        return false;

    }

    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        }
        return false;
    }

    public static String monkeyTrouble3(boolean aSmile,boolean bSmile){
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return "Yes";
        }
        return "No";
    }





}