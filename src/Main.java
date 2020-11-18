import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arry = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        workWithElement(arry);

    }

    public static void workWithElement(Integer[] arry) {
        List<Integer> rezult = new ArrayList<>();
        for (int i = 0; i < arry.length; i++) {
            rezult.add(arry[i]);
        }
        rezult.remove(0);
        rezult.remove(0);
        rezult.remove(rezult.size() - 1);
        for (Integer element : rezult) {
            System.out.println(element);
        }
        System.out.println();
    }
}
