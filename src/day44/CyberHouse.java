package day44;

public class CyberHouse {
    private static String neighbourhoodName="Cybertek Ave";
    int houseNum;
    String design;

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println("house: "+this.houseNum+", design: "+this.design+",  neighbourhoodName "+neighbourhoodName);
    }




    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }

    public static void showNeighborhood(){

        System.out.println("neighbourhoodName = " + neighbourhoodName);
    }


}

