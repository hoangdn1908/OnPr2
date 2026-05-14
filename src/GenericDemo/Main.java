package GenericDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Number<Integer> integerNumber = new Number<>();
        Number<Double> doubleNumber = new Number<>();
        Number<String> stringNumber = new Number<>();
        Number<int[]> arrayListNumber = new Number<>();
        Number<List<Integer>> listNumber   = new Number<>();
        integerNumber.list.add(1);
        doubleNumber.list.add(9.6);
        stringNumber.list.add("1");
        arrayListNumber.list.add(new int[] {1,2,3});
        listNumber.list.add(new ArrayList<>());
    }
}
