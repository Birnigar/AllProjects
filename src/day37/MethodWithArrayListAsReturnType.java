package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
    }





public static List<Integer> getListFrom1ToFinalNumber(int finalNumber) {
        finalNumber=100;
    List<Integer> nums = new ArrayList<>();

    for (int numbers = 0; numbers <= finalNumber; numbers++) {
        nums.add(numbers);
    }

    return nums;
}

    }

