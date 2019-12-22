package day12;



public class CarShopping {

    public static void main(String[] args) {

        String carBrand="Tesla";
        int budget=40000;
        int carPrice=30000;
       // if(carBrand.equals("coralla") | carBrand.equals("Tesla") && carPrice<=budget){
         //   System.out.println("CAR AQUIRED!!");
       // }else{
        //    System.out.println("NOT WHAT I AM LOOKING FOR");
        //}

        if(carBrand.equals("coralla")){
            System.out.println("CORALLA CAR ACQUIRED!!");
        }else if(carBrand.equals("Tesla")){
            System.out.println("TESLA CAR ACQUIRED!!");
        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR");

        }


    }

}
