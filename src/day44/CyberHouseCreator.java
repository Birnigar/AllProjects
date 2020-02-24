package day44;

public class CyberHouseCreator {
    public static void main(String[] args) {

        CyberHouse.showNeighborhood();

        CyberHouse c1 = new CyberHouse(23, "Vintage");
        CyberHouse c2 = new CyberHouse(245, "Modern");
        CyberHouse c3 = new CyberHouse(90, "Classic");
        CyberHouse c4 = new CyberHouse(276, "HighTek");
        CyberHouse c5 = new CyberHouse(56, "Borocko");
        CyberHouse c6 = new CyberHouse(35, "Renesance ");

        c1.showAllInfo();
        c2.showAllInfo();


        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);


    }
}
