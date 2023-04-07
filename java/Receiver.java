import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Receiver {

    private String name;
    private int age;


    private Service service;
    private List<Car> cars = new ArrayList<>();
    private List<DiagnosticOrder> orders = new ArrayList<>();


    public void addCar(Car car) {
        for (Car c : cars) {
            if (c.getRegNum().equals(car.getRegNum())) {
            }
                // todo add DateBase
                DBManager.getInstance().saveRegNumber("");
                if (!c.getPhoneNum().equals(car.getPhoneNum())) {
                    c.setPhoneNum("");
                    // todo set DataBase
                    DBManager.getInstance().actPhoneNumber("");

                }
                return;
            }
        cars.add(car);
        }
    }











