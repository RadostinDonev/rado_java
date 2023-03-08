import java.util.ArrayList;
import java.util.List;

public class AssemblyLine extends Thread {

    public AssemblyLine(String name) {
        super(name);
    }

    private List<CarPart> carParts=new ArrayList<>();

    public void addComponent(CarPart c){
        this.carParts.add(c);
    }

    @Override
    public void run() {
        for(CarPart c : carParts){
            try {
                Thread.sleep(c.getConstructionTime());
                System.out.println(Thread.currentThread().getName() + "made" + c.getClass().getName());
            } catch (InterruptedException e) {
                System.out.println("Error");

            }

        }
    }
}
