package day27;

import java.util.Arrays;

public class Multi_Dimensional_3DArrays {
    public static void main(String[] args) {

        int [][][] arr3D={{{1,2,3},{4,5,6}}  , {{7,8,9},{10,11,12}} };

        System.out.println( arr3D[1][0][2]);
        System.out.println(arr3D[0][0][1]);

        System.out.println(Arrays.toString(arr3D[0][0]));
        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(Arrays.deepToString(arr3D[0]));





    }
}
