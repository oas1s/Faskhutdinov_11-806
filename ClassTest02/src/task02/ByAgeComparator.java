package task02;

import task02.Car;

import java.util.Comparator;

public class ByAgeComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return (car1.getAge() - car2.getAge());
    }
}
