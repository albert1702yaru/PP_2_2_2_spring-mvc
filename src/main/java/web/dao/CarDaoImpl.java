package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Volkswagen", 1, 2007));
        carList.add(new Car("BMW", 2, 2015));
        carList.add(new Car("Volvo", 3, 2022));
        carList.add(new Car("VAZ", 4, 2017));
        carList.add(new Car("Volga", 5, 2013));
        carList.add(new Car("GAZ", 6, 2007));
        carList.add(new Car("YAZ", 7, 2015));
        carList.add(new Car("KAMAZ", 8, 2012));
        carList.add(new Car("MAZ", 9, 2017));
        carList.add(new Car("MAN", 10, 2013));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count >= 5) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}