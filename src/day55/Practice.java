package day55;

public class Practice {

    public Practice(){
        this(100);
        System.out.println("No Arg Constructor");
    }


    public Practice(int x){
      //  this();
        System.out.println("1 Arg Constructor "+x);
    }

    public Practice(String str){
        this(102);
        System.out.println("1 Arg Constructor "+str);
    }

    public static void main(String[] args) {

        Practice t= new Practice("abc");


    }


}
