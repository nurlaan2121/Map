import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarInfo> mapmassive = new HashMap<>();
        Car car = new Car(1L,"06KG215ASI");
        Car car2 = new Car(2L,"01KG815AUD");
        Car car3 = new Car(3L,"02KG275ASD");
        Car car4 = new Car(4L,"04KG259ESD");
        Car car5 = new Car(5L,"02KG815AJD");
        CarInfo carInfo = new CarInfo(2005,"Mersedes benz",150000,"Black");
        CarInfo carInfo2 = new CarInfo(1995,"Matiz",148000,"Blue");
        CarInfo carInfo3 = new CarInfo(2021,"Tico",150200,"Yellow");
        CarInfo carInfo4 = new CarInfo(2002,"Mitsubishi",150900,"White");
        CarInfo carInfo5 = new CarInfo(2014,"Lanos",15800,"Blue");
        mapmassive.put(car,carInfo);
        mapmassive.put(car2,carInfo2);
        mapmassive.put(car3,carInfo3);
        mapmassive.put(car4,carInfo4);
        mapmassive.put(car5,carInfo5);
        System.out.println(mapmassive.entrySet());

    }
}