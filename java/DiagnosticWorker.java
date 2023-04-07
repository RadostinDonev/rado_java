import java.util.ArrayList;
import java.util.List;

public class DiagnosticWorker extends Worker{


     private ServiceForCar order;

    public static Service service;
    public DiagnosticWorker(String name, int age) {
        super(name, age);

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
                Service.ServiceType s = Service.getRandomType();
                List list = new ArrayList();

                service.add(list);

            } catch (InterruptedException e) {
                System.out.println("LELE");
            }
        }
        }
}
