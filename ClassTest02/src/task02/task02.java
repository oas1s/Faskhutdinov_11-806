package task02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task02 {
    public static ArrayList<Car> CarList;
    public static List<Car> top10(Comparator<Car> comparator, int n) {
        ArrayList<Car> newList = new ArrayList<>();
        CarList.sort(comparator);
        for (int i = 0; i <n; i++) {
            newList.add(CarList.get(i));
        }
        return newList;
    }
}
