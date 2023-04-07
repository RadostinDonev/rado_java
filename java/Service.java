import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Service {
    enum ServiceType {
        REPAIR,
        MAINTENANCE}
    private ServiceType serviceType;
    public ServiceForCar getNextOrder() {
        //TODO
    }
    private String name;
   private double price;
   private int time;
   private List<Car> cars=new ArrayList<>();
    private BlockingQueue<DiagnosticOrder> orders;
    private BlockingQueue<DiagnosticOrder> repair;
    private BlockingQueue<DiagnosticOrder> maintenance;

    public Service(ServiceType serviceType, String name, double price, int time) {
        this.serviceType = serviceType;
        this.name = name;
        this.price = price;
        this.time = time;
    }
    public void InputCar(Car c){
        this.cars.add(c);
       // c.start();
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public static ServiceType getRandomType(){
        int chance = new Random().nextInt(2);
        switch (chance){
            case 1 : return  ServiceType.REPAIR;
            default: return ServiceType.MAINTENANCE;
        }
    }

    public void add(List list) {
        orders.poll();
    }


}
