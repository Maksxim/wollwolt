package by.tms.collections.work2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private HashMap<Car,Integer> map = new HashMap<>();

    public HashMap park(Car car){
       Integer count = map.get(car);
       if(count != null){
           count += 1;
       }else{
           count = 1;
       }
       map.put(car,count);
       return map;
    }
    public void unPark (Car car){
        Integer count = map.get(car);
        if(count != null){
            if(count == 1){
                map.remove(car);
                return;
            }
            count -= 1;
        }
        map.put(car,count);
    }

    public Integer getCountByClass(Class classOfCar){
       int countOfCars = 0;
       for(Map.Entry<Car,Integer> entry:map.entrySet()){
           if(classOfCar.isInstance(entry.getKey())){
               countOfCars += entry.getValue();
           }
       }
       return countOfCars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "map=" + map +
                '}';
    }
}
