package day35;

class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {

        Integer num1=100;

        int num2=Integer.valueOf("200");
        //this can not happen byself
        
        String caseNumber="IPR2012-00001";
        
        int year=Integer.parseInt(caseNumber.substring(3,7));
        System.out.println("year = " + year);
        System.out.println(getYearOutOfcaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfcaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfcaseNumber("CBM2001-10133"));
        String str="A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        getDigitOutOfString(str);
        
        Float f6=Float.parseFloat("3.14");
        System.out.println("f6 = " + f6);
        
        
    }

    public static int getYearOutOfcaseNumber(String caseNumber){

        return Integer.parseInt(caseNumber.substring(3,7));

    }public static void getDigitOutOfString (String str){
        String nums="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            if(Character.isDigit(str.charAt(i)  ) ){
                nums+=str.charAt(i);
            }
        }
        System.out.println(nums);
    }


}



