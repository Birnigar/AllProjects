package day08;

public class ifElseStatement {
    public static void main(String[] args) {

        int speedLimit=60;
        int yourCurrentSpeed=75;
        boolean IamSpeeding=(yourCurrentSpeed>speedLimit);

        if (IamSpeeding) {
            System.out.println("get pulled over by the police ");
            System.out.println("given ticket by the police ");
            System.out.println("taken away some points on your license ");
            System.out.println("go to court");
        } else {
            System.out.println("go to shopping");
            System.out.println("buy IceCream");
            System.out.println("Enjoy your day!");
        }
          System.out.println("THE END");

    }
}
