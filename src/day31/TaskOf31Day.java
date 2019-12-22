package day31;

public class TaskOf31Day {
    public static void main(String[] args) {
        reverseMyName();
        System.out.println();
        reversePrintAnyName("Ayse");
        System.out.println();
        printLastCharacterOfname("Faruk");
        printFullNameInformation("Furkan", "Ozyurt");
        compareNameCharacterCount("Faruk", "Furkan");
        printAToZ();
    }

    /*
        Create below static void methods :
        and call them in main method to test.
        reversePrintMyOwnName
    * create a method that has no parameter
        and print your name in reversed order
                reversePrintAnyName
    * create a method that has 1 String parameter called name
        and print that name in reversed order
                printLastCharacterOfName
    * create a method that has 1 String parameter called name
        and print last character of that name
                printFullNameInformation
    * create a method that has 2 String parameter called firstName,lastName
        and print "Your first name is firstName , Your last Name is lastName
        print " your full name lenth is lengthOfTheFullName"
        compareNameCharacterCount
    * create a method that has 2 String parameter called name1,name2
        if name 1 has more characters
        print " name 1 is longer "
                if name 2 has more characters
        print " name 2 is longer "
                if name 2 has same character count
        print " name 1 and name 2 same character count "
        printAtoZ
    * create a method that has no parameter
        and print A-Z in one line
        printZtoA
    * create a method that has no parameter
        and print Z-A in one line
        printAlphabetInRange
    * create a method that have 2 char as parameters: beginning, ending
    if beginning character is before ending character
        for example beginning A , ending D  -->> ABCD
    if beginning character is after ending character
        for example beginning D , ending A  -->> DCBA
        */
    public static void reverseMyName() {
        String myName = "Nigar";
        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.print(myName.charAt(i));

        }
    }


    public static void reversePrintAnyName(String name) {

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }

    }

    public static void printLastCharacterOfname(String name) {

        char lastCharacter = name.charAt(name.length() - 1);
        System.out.println(lastCharacter);
    }

    public static void printFullNameInformation(String firstName, String lastName) {

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }

    public static void compareNameCharacterCount(String name1, String name2) {
        if (name1.length() > name2.length()) {
            System.out.println(name1);
        } else if (name2.length() > name1.length()) {
            System.out.println(name2);
        } else if (name1.length() == name2.length()) {
            System.out.println(name1 + " and " + name2 + " same character count ");
        }

    }

    public static void printAToZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
    }

    public static void printZToA() {
        for (char i = 'Z'; i <= 'A'; i++) {
            System.out.print(i + " ");

        }


    }


}




