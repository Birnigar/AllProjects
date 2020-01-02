package day35;

public class ParsingPractice2 {
    public static void main(String[] args) {

        String snt = "I bought 3 tomato and price was 3,14 each";
        String priceStr = snt.replace(",", ".");
        String[] arr = priceStr.split(" ");
        System.out.println(Float.valueOf(arr[arr.length - 2]) * Integer.valueOf(arr[2]));


        String sentence="You are seeing the first 2000 results for AIA Review Number: IPR";
String[] sentenceArr=sentence.split(" ");
        System.out.println(Integer.parseInt(sentenceArr[5]));



    }
}