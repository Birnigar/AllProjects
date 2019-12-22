package day19;

public class MonkeySongWithForLoop {
    public static void main(String[] args) {
        String gen1="boy";
        String gen2="girl";
        String d1="his";
        String d2="her";
        for (int i = 5; i >0; i--) {
            if (i % 2 != 0 && i != 1) {
                System.out.println(i +" "+ gen1 + " little monkeys jumping on the bed " + "\n" +
                        "One fell off and bumped " + d1 + " head" + "\n" +
                        "Mama called the doctor" + "\n" +
                        "And the doctor said," + "\n" +
                        "No more monkeys jumping on the bed");
                System.out.println();
            } else if (i % 2 == 0) {
                System.out.println(i +" "+gen2 + " little monkeys jumping on the bed " + "\n" +
                        "One fell off and bumped " + d2 + " head" + "\n" +
                        "Mama called the doctor" + "\n" +
                        "And the doctor said," + "\n" +
                        "No more monkeys jumping on the bed");
                System.out.println();
            } else {
                System.out.println(i +" "+ gen1 + " little monkey jumping on the bed " + "\n" +
                        "One fell off and bumped " + d1 + " head" + "\n" +
                        "Mama called the doctor" + "\n" +
                        "And the doctor said," + "\n" +
                        "Put those monkeys right to bed");

            }

        }

    }
}
