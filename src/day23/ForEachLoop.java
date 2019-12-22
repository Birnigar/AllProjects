package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] price={99.23,11.99,100.23,99.99,56.34};
        //for each loop syntax
        //for(dataTypeOfYourArray variableNameForEachItem: yourArrayVariable)
        //do something with your array items
        //
        for (int x = 0; x <price.length ; x++) {

            double eachPrice=price[x];
            System.out.println("eachPrice = " + eachPrice);
        }
        for (double eachPrice : price) {
            System.out.println("eachPrice = " + eachPrice);
        }
        
        
        
        
        
        
        
        
        
    }
}
