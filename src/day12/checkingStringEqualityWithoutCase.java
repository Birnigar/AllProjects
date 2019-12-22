package day12;

        public class checkingStringEqualityWithoutCase {
            public static void main(String[] args) {

                String myName="NIGAR";

                boolean myNameCorrect = myName.equals("NiGar");

                System.out.println(myNameCorrect);

                boolean myNameNotCorrect=myName.equalsIgnoreCase("nigar");

                System.out.println(myNameNotCorrect);



            }
}
